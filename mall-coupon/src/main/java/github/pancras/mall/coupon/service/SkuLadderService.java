package github.pancras.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 16:33:13
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

