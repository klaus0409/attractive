package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.SysZone;
import com.klaus.attractive.service.SysZoneService;
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
@RequestMapping("/sys/zone")
public class SysZoneController {
    @Resource
    private SysZoneService sysZoneService;

    @ApiOperation(value="addSysZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysZone", required = true, dataType = "SysZone" )
    @PostMapping
    public Result add(@RequestBody SysZone sysZone) {
        sysZoneService.save(sysZone);
        return ResultGenerator.genSuccessResult();
    }

   @ApiOperation(value="deleteSysZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "id", required = true, dataType = "Integer" )
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        sysZoneService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

 @ApiOperation(value="updateSysZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @PutMapping
    public Result update(@RequestBody SysZone sysZone) {
        sysZoneService.update(sysZone);
        return ResultGenerator.genSuccessResult();
    }
    @ApiOperation(value="selectSysZone",produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful request"),
            @ApiResponse(code = 500, message = "internal server error")})
    @ApiImplicitParam(name = "sysZone", required = true, dataType = "SysZone" )
    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        SysZone sysZone = sysZoneService.findById(id);
        return ResultGenerator.genSuccessResult(sysZone);
    }

    @ApiOperation(value = "selectSysZone" ,produces="application/json")
    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<SysZone> list = sysZoneService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
