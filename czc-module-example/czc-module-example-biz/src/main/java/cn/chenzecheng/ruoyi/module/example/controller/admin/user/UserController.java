package cn.chenzecheng.ruoyi.module.example.controller.admin.user;

import cn.chenzecheng.ruoyi.common.pojo.CommonResult;
import cn.chenzecheng.ruoyi.module.example.api.user.dto.UserInfoDTO;
import cn.chenzecheng.ruoyi.module.example.convert.user.UserConvert;
import cn.chenzecheng.ruoyi.module.example.dal.dataobject.user.MemberUserDO;
import cn.chenzecheng.ruoyi.module.example.service.user.MemberUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Banging
 */
@Slf4j
@Api("用户管理")
@RestController(value = "memberUserController")
@RequestMapping("/example/user")
public class UserController {

    @Resource
    private MemberUserService userService;

    @ApiOperation(value = "用户信息获取", notes = "用户基本信息的获取")
    @GetMapping("/{tel}")
    public CommonResult<UserInfoDTO> getUserInfo(@PathVariable String tel) {
        MemberUserDO user = userService.getUserByMobile(tel);
        return CommonResult.success(UserConvert.INSTANCE.convertInfo(user));
    }

    @ApiOperation(value = "用户新增", notes = "插入一个用户")
    @PutMapping
    public CommonResult<Long> addUserInfo(@RequestBody MemberUserDO userDO) {
        return CommonResult.success(userService.addUser(userDO));
    }
}
