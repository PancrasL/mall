package github.pancras.mall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.warehouse.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:36:04
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

