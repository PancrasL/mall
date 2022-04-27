package github.pancras.mall.product.dao;

import github.pancras.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Pancras
 * @email sunlightcs@gmail.com
 * @date 2022-04-27 16:05:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
