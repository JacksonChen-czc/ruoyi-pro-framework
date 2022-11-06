package cn.chenzecheng.ruoyi.module.example.controller.admin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author JacksonChen
 * @date 2022/11/6 16:49
 */
@ApiModel("样例模块 - 测试接口 Request VO")
@Data
public class TestReqVO {

    @ApiModelProperty(value = "aaa", required = true, example = "1")
    private String aaa;
}
