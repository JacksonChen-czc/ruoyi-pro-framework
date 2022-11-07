package cn.chenzecheng.ruoyi.module.example.service.user;

import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;

/**
 * 会员用户 Service 接口
 *
 * @author 芋道源码
 */
public interface MemberUserService {

    /**
     * 通过手机查询用户
     *
     * @param mobile 手机
     * @return 用户对象
     */
    MemberUserDO getUserByMobile(String mobile);

    /**
     * 通过用户 ID 查询用户
     *
     * @param id 用户ID
     * @return 用户对象信息
     */
    MemberUserDO getUser(Long id);
}