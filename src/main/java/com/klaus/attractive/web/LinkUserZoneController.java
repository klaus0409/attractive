package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.LinkUserZone;
import com.klaus.attractive.service.LinkUserZoneService;
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
@RequestMapping("/link/user/zone")
public class LinkUserZoneController {
    @Resource
    private LinkUserZoneService linkUserZoneService;

    @ApiOperation(value="addLinkUserZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "linkUserZone", required = true, dataType = "LinkUserZone" )
    @PostMapping
    public Result add(@RequestBody LinkUserZone linkUserZone) {
        linkUserZoneService.save(linkUserZone);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteLinkUserZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        linkUserZoneService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateLinkUserZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody LinkUserZone linkUserZone) {
        linkUserZoneService.update(linkUserZone);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectLinkUserZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "linkUserZone", required = true, dataType = "LinkUserZone" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        LinkUserZone linkUserZone = linkUserZoneService.findById(id);
        return ResultGenerator.genSuccessResult(linkUserZone);
    }

    @ApiOperation(value = "selectLinkUserZone" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LinkUserZone> list = linkUserZoneService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
