package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.LinkRolePermission;
import com.klaus.attractive.service.LinkRolePermissionService;
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
@RequestMapping("/link/role/permission")
public class LinkRolePermissionController {
    @Resource
    private LinkRolePermissionService linkRolePermissionService;

    @ApiOperation(value="addLinkRolePermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "linkRolePermission", required = true, dataType = "LinkRolePermission" )
    @PostMapping
    public Result add(@RequestBody LinkRolePermission linkRolePermission) {
        linkRolePermissionService.save(linkRolePermission);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteLinkRolePermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        linkRolePermissionService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateLinkRolePermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody LinkRolePermission linkRolePermission) {
        linkRolePermissionService.update(linkRolePermission);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectLinkRolePermission",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "linkRolePermission", required = true, dataType = "LinkRolePermission" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        LinkRolePermission linkRolePermission = linkRolePermissionService.findById(id);
        return ResultGenerator.genSuccessResult(linkRolePermission);
    }

    @ApiOperation(value = "selectLinkRolePermission" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LinkRolePermission> list = linkRolePermissionService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
