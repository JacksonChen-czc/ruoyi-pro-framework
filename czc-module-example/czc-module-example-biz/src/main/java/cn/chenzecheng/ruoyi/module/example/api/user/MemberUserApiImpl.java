package cn.chenzecheng.ruoyi.module.example.api.user;

import cn.chenzecheng.ruoyi.module.example.api.user.dto.UserRespDTO;
import cn.chenzecheng.ruoyi.module.example.convert.user.UserConvert;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import cn.chenzecheng.ruoyi.module.example.service.user.MemberUserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * 会员用户的 API 实现类
 *
 * @author 芋道源码
 */
@Service
@Validated
public class MemberUserApiImpl implements MemberUserApi {

    @Resource
    private MemberUserService userService;

    @Override
    public UserRespDTO getUser(Long id) {
        MemberUserDO user = userService.getUser(id);
        return UserConvert.INSTANCE.convertResp(user);
    }

}
