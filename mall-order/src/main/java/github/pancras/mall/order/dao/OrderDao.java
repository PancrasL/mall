package github.pancras.mall.order.dao;

import github.pancras.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:18:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
