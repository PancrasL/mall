package github.pancras.mall.thirdparty.oss;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.errors.MinioException;
import io.minio.messages.Bucket;

public class MinioUploadTest {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, InvalidKeyException {
        try {
            // 使用MinIO服务的URL，端口，Access key和Secret key创建一个MinioClient对象
            MinioClient minioClient = MinioClient.builder()
                    .endpoint("http://127.0.0.1:9100/")
                    .credentials("minio", "12345678")
                    .build();

            List<Bucket> buckets = minioClient.listBuckets();
            System.out.println(buckets.toString());

            // 检查存储桶是否已经存在
            boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder().bucket("test").build());
            if (isExist) {
                System.out.println("Bucket already exists.");
            } else {
                // 创建一个名为asiatrip的存储桶，用于存储照片的zip文件。
                minioClient.makeBucket(MakeBucketArgs.builder().bucket("test").build());
            }
            InputStream inputStream = new FileInputStream(new File("D:\\Code\\Java\\TinyMall\\mall\\README.md"));
            minioClient.putObject(PutObjectArgs.builder()
                    .bucket("test")
                    .object("README.md")
                    .stream(inputStream, inputStream.available(), -1)
                    .build());
        } catch (MinioException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}
