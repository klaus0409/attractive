package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.Msg;
import com.klaus.attractive.model.SysUser;
import com.klaus.attractive.model.UserRoleDemo;
import com.klaus.attractive.service.SysUserService;
import com.klaus.attractive.utils.shiro.JWTUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
* Created by wang.jianyu on 2019/10/09.
*/
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @ApiOperation(value="addSysUser",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysUser", required = true, dataType = "SysUser" )
    @PostMapping
    public Result add(@RequestBody SysUser sysUser) {
        sysUserService.save(sysUser);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteSysUser",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        sysUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateSysUser",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody SysUser sysUser) {
        sysUserService.update(sysUser);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectSysUser",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysUser", required = true, dataType = "SysUser" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SysUser sysUser = sysUserService.findById(id);
        return ResultGenerator.genSuccessResult(sysUser);
    }

    @ApiOperation(value = "selectSysUser" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<SysUser> list = sysUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @ApiOperation(value = "用户登录", notes = "登录--不进行拦截")
    @PostMapping("/login")
    public Msg login(@RequestParam("username") String username,@RequestParam("password") String password) {
        String realPassword = sysUserService.getPassword(username);
        if (realPassword == null) {
            return Msg.fail().add("info","用户名错误");
        } else if (!realPassword.equals(password)) {
            return Msg.fail().add("info","密码错误");
        } else {
            return Msg.success().add("token", "admin");//JWTUtil.createToken(username)
        }
    }

    @ApiOperation(value = "无权限", notes = "无权限跳转的接口")
    @RequestMapping(path = "/unauthorized/{message}")
    public Msg unauthorized(@PathVariable String message) throws UnsupportedEncodingException {
        return Msg.fail().add("info",message);
    }

    @ApiOperation(value = "特定用户访问", notes = "拥有 user, admin 角色的用户可以访问下面的页面")
    @GetMapping("/getMessage")
    public UserRoleDemo getMessage() {
        UserRoleDemo user = new UserRoleDemo();
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        user.setCode(200);
        user.setRoles(roles);
        user.setToken("admin");
        user.setIntroduction("introduction");
        user.setAvatar("https://raw.githubusercontent.com/mgbq/nx-admin/master/src/assets/img/home/logo.png");
        user.setName("Super Admin");
        return user;
    }

    @ApiOperation(value = "Vip用户访问", notes = "拥有 vip 权限可以访问该页面")
    @PostMapping("/getVipMessage")
    @RequiresRoles(logical = Logical.OR, value = {"user", "admin"})
    @RequiresPermissions("vip")
    public Msg getVipMessage() {
        return Msg.success().add("info","成功获得 vip 信息！");
    }
}
