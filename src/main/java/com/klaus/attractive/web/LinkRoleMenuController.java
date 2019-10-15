package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.LinkRoleMenu;
import com.klaus.attractive.service.LinkRoleMenuService;
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
@RequestMapping("/link/role/menu")
public class LinkRoleMenuController {
    @Resource
    private LinkRoleMenuService linkRoleMenuService;

    @ApiOperation(value="addLinkRoleMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "linkRoleMenu", required = true, dataType = "LinkRoleMenu" )
    @PostMapping
    public Result add(@RequestBody LinkRoleMenu linkRoleMenu) {
        linkRoleMenuService.save(linkRoleMenu);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteLinkRoleMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        linkRoleMenuService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateLinkRoleMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody LinkRoleMenu linkRoleMenu) {
        linkRoleMenuService.update(linkRoleMenu);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectLinkRoleMenu",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "linkRoleMenu", required = true, dataType = "LinkRoleMenu" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        LinkRoleMenu linkRoleMenu = linkRoleMenuService.findById(id);
        return ResultGenerator.genSuccessResult(linkRoleMenu);
    }

    @ApiOperation(value = "selectLinkRoleMenu" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LinkRoleMenu> list = linkRoleMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
