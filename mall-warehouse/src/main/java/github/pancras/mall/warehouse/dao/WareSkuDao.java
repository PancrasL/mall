package github.pancras.mall.warehouse.dao;

import github.pancras.mall.warehouse.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:36:04
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
