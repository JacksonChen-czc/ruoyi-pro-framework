package cn.chenzecheng.ruoyi.module.example.dal.mysql.user;

import cn.chenzecheng.ruoyi.framework.tech.mybatis.core.mapper.BaseMapperX;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员 User Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface MemberUserMapper extends BaseMapperX<MemberUserDO> {

    default MemberUserDO selectByMobile(String mobile) {
        return selectOne(MemberUserDO::getMobile, mobile);
    }

}
