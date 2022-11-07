package cn.chenzecheng.ruoyi.module.example.service.user;

import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import cn.chenzecheng.ruoyi.module.example.dal.mysql.user.MemberUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 会员 User Service 实现类
 *
 * @author JacksonChen
 * @date 2022/11/7 23:08
 */
@Service
@Valid
@Slf4j
public class MemberUserServiceImpl implements MemberUserService {

    @Resource
    private MemberUserMapper memberUserMapper;

    @Override
    public MemberUserDO getUserByMobile(String mobile) {
        return memberUserMapper.selectByMobile(mobile);
    }

    @Override
    public MemberUserDO getUser(Long id) {
        return memberUserMapper.selectById(id);
    }


}
