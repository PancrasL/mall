package github.pancras.mall.member.dao;

import github.pancras.mall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:06:31
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
