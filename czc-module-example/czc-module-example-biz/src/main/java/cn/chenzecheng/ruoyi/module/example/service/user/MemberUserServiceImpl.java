package cn.chenzecheng.ruoyi.module.example.service.user;

import cn.chenzecheng.ruoyi.framework.tech.datasource.core.enums.DataSourceEnum;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import cn.chenzecheng.ruoyi.module.example.dal.mysql.user.MemberUserMapper;
import com.baomidou.dynamic.datasource.annotation.DS;
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
    @DS(DataSourceEnum.SLAVE) // 读写分离，从库查询
    public MemberUserDO getUser(Long id) {
        return memberUserMapper.selectById(id);
    }

    @Override
    @DS(DataSourceEnum.MASTER) // 读写分离，主库插入
    public Long addUser(MemberUserDO userDO) {
        memberUserMapper.insert(userDO);
        return userDO.getId();
    }
}
