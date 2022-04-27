package github.pancras.mall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.warehouse.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:36:04
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

