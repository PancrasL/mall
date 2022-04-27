package github.pancras.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 16:33:14
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

