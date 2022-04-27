package github.pancras.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author Pancras
 * @email sunlightcs@gmail.com
 * @date 2022-04-27 16:05:39
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

