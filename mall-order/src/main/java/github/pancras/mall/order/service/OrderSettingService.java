package github.pancras.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:18:31
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

