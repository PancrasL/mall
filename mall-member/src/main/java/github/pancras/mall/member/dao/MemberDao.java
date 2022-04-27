package github.pancras.mall.member.dao;

import github.pancras.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:06:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
