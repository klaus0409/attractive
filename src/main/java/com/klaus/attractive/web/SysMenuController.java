package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.SysMenu;
import com.klaus.attractive.service.SysMenuService;
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
@RequestMapping("/sys/menu")
public class SysMenuController {
    @Resource
    private SysMenuService sysMenuService;

    @ApiOperation(value="addSysMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysMenu", required = true, dataType = "SysMenu" )
    @PostMapping
    public Result add(@RequestBody SysMenu sysMenu) {
        sysMenuService.save(sysMenu);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteSysMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        sysMenuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateSysMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody SysMenu sysMenu) {
        sysMenuService.update(sysMenu);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectSysMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysMenu", required = true, dataType = "SysMenu" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SysMenu sysMenu = sysMenuService.findById(id);
        return ResultGenerator.genSuccessResult(sysMenu);
    }

    @ApiOperation(value = "selectSysMenu" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysMenu> list = sysMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
