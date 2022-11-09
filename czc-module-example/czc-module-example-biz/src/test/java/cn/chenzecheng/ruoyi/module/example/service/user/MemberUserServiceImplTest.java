package cn.chenzecheng.ruoyi.module.example.service.user;

import cn.chenzecheng.ruoyi.common.enums.CommonStatusEnum;
import cn.chenzecheng.ruoyi.common.util.collection.ArrayUtils;
import cn.chenzecheng.ruoyi.framework.tech.redis.config.MyRedisAutoConfiguration;
import cn.chenzecheng.ruoyi.framework.tech.test.core.ut.BaseDbAndRedisUnitTest;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;
import java.util.function.Consumer;

import static cn.chenzecheng.ruoyi.framework.tech.test.core.util.RandomUtils.randomPojo;
import static cn.hutool.core.util.RandomUtil.randomEle;

/**
 * @authMy JacksonChen
 * @date 2022/11/9 22:33
 */
@Import({MemberUserServiceImpl.class, MyRedisAutoConfiguration.class})
class MemberUserServiceImplTest extends BaseDbAndRedisUnitTest {

    @Resource
    private MemberUserServiceImpl memberUserService;

    @Test
    void getUserByMobile() {
        MemberUserDO memberUserDO = randomUserDO();
        memberUserService.addUser(memberUserDO);

        MemberUserDO userByMobile = memberUserService.getUserByMobile(memberUserDO.getMobile());
        System.out.println(userByMobile);
        Assertions.assertNotNull(userByMobile);
    }

    @Test
    void getUser() {
        MemberUserDO memberUserDO = randomUserDO();
        Long id = memberUserService.addUser(memberUserDO);

        MemberUserDO user = memberUserService.getUser(id);
        System.out.println(user);
        Assertions.assertNotNull(user);
    }

    @Test
    void addUser() {
        MemberUserDO memberUserDO = randomUserDO();
        Long id = memberUserService.addUser(memberUserDO);

        MemberUserDO user = memberUserService.getUser(id);
        System.out.println(user);
        Assertions.assertNotNull(user);
    }

    // ========== 随机对象 ==========

    @SafeVarargs
    private static MemberUserDO randomUserDO(Consumer<MemberUserDO>... consumers) {
        Consumer<MemberUserDO> consumer = (o) -> {
            o.setStatus(randomEle(CommonStatusEnum.values()).getStatus()); // 保证 status 的范围
        };
        return randomPojo(MemberUserDO.class, ArrayUtils.append(consumer, consumers));
    }
}