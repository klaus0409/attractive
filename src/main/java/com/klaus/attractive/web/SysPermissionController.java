package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.SysPermission;
import com.klaus.attractive.service.SysPermissionService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by wang.jianyu on 2019/10/09.
*/
@RestController
@RequestMapping("/sys/permission")
public class SysPermissionController {
    @Resource
    private SysPermissionService sysPermissionService;

    @ApiOperation(value="addSysPermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysPermission", required = true, dataType = "SysPermission" )
    @PostMapping
    public Result add(@RequestBody SysPermission sysPermission) {
        sysPermissionService.save(sysPermission);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteSysPermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        sysPermissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateSysPermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody SysPermission sysPermission) {
        sysPermissionService.update(sysPermission);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectSysPermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysPermission", required = true, dataType = "SysPermission" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SysPermission sysPermission = sysPermissionService.findById(id);
        return ResultGenerator.genSuccessResult(sysPermission);
    }

    @ApiOperation(value = "selectSysPermission" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysPermission> list = sysPermissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
