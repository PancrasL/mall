package github.pancras.mall.coupon.dao;

import github.pancras.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 16:33:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
