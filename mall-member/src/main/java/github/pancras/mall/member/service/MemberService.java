package github.pancras.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import github.pancras.common.utils.PageUtils;
import github.pancras.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Pancras
 * @email xxx@qq.com
 * @date 2022-04-27 17:06:31
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

