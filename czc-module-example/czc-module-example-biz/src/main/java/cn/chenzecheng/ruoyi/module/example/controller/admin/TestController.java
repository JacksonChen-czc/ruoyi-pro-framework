package cn.chenzecheng.ruoyi.module.example.controller.admin;

import cn.chenzecheng.ruoyi.common.pojo.CommonResult;
import cn.chenzecheng.ruoyi.common.pojo.PageResult;
import cn.chenzecheng.ruoyi.module.example.controller.admin.vo.TestReqVO;
import cn.chenzecheng.ruoyi.module.example.controller.admin.vo.TestRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static cn.chenzecheng.ruoyi.common.pojo.CommonResult.success;

/**
 * @author JacksonChen
 * @date 2022/11/6 16:45
 */
@Api(tags = "样例模块 - 测试api")
@RestController
@RequestMapping("/example/text")
@Validated
@Slf4j
public class TestController {

    @GetMapping
    @ApiOperation("测试")
    public CommonResult<PageResult<TestRespVO>> getCodeGenTablePage(@Valid TestReqVO testReqVO) {
        log.info("收到参数 testReqVO {}", testReqVO);
        return success(null);
    }
}
