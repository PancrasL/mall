package github.pancras.mall.thirdparty.oss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import github.pancras.common.utils.R;
import io.minio.MinioClient;
import io.minio.PostPolicy;
import io.minio.errors.ErrorResponseException;
import io.minio.errors.InsufficientDataException;
import io.minio.errors.InternalException;
import io.minio.errors.InvalidResponseException;
import io.minio.errors.ServerException;
import io.minio.errors.XmlParserException;

@RestController
public class OssController {
    @Autowired
    private MinioClient minioClient;

    @Value("${minio.bucket}")
    private String bucketName;

    @RequestMapping("/oss/policy/{objectName}")
    public R policy(@PathVariable String objectName) throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        objectName = format + "/"+ UUID.randomUUID() + "_" + objectName;
        // 1. 创建一个Post 策略
        // 为存储桶创建一个上传策略，过期时间为7天
        PostPolicy policy = new PostPolicy(bucketName, ZonedDateTime.now().plusDays(7));
        // 设置一个参数key-value，值为上传对象的名称（保存在桶中的名字）
        policy.addEqualsCondition("key", objectName);
        // 设置上传文件的大小 10kiB to 10MiB.
        policy.addContentLengthRangeCondition(10 * 1024, 10 * 1024 * 1024);

        // 2. 获取策略的 认证令牌、签名等信息
        Map<String, String> formData = minioClient.getPresignedPostFormData(policy);
        formData.put("bucket", bucketName);
        formData.put("key", objectName);

        return R.ok().put("data", formData);
    }
}
