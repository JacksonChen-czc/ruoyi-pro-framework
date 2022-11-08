package cn.chenzecheng.ruoyi.module.example.controller.admin.oauth2;

import cn.chenzecheng.ruoyi.common.pojo.CommonResult;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import cn.chenzecheng.ruoyi.module.example.dal.redis.oauth2.OAuth2AccessTokenRedisDAO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static cn.chenzecheng.ruoyi.common.pojo.CommonResult.success;

/**
 * 测试缓存
 *
 * @author JacksonChen
 * @date 2022/11/8 23:22
 */
@Api(tags = "样例模块 - 测试api")
@RestController
@RequestMapping("/example/oauth")
@Validated
@Slf4j
public class OauthController {

    @Resource
    private OAuth2AccessTokenRedisDAO oAuth2AccessTokenRedisDAO;

    @PutMapping
    @ApiOperation("新增")
    public CommonResult<String> getCodeGenTablePage(@RequestBody OAuth2AccessTokenDO oAuth2AccessTokenDO) {
        log.info("收到参数 accessToken {}", oAuth2AccessTokenDO);
        oAuth2AccessTokenRedisDAO.set(oAuth2AccessTokenDO);
        return success("ok");
    }

    @GetMapping("/{accessToken}")
    @ApiOperation("查询")
    public CommonResult<OAuth2AccessTokenDO> getCodeGenTablePage(@PathVariable String accessToken) {
        return success(oAuth2AccessTokenRedisDAO.get(accessToken));
    }
}
