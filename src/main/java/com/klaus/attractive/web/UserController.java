package com.klaus.attractive.web;

import com.klaus.attractive.core.Result;
import com.klaus.attractive.core.ResultGenerator;
import com.klaus.attractive.model.User;
import com.klaus.attractive.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
* Created by wang.jianyu on 2019/10/14.
*/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;


    @PostMapping(value = "/add")
    public Result add(@ModelAttribute User user) {
        Date date = new Date(System.currentTimeMillis());
        user.setAccountTime(date);
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping(value = "/delete")
    public Result delete(@RequestParam(value = "id") Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }


    @PostMapping(value = "/edit")
    public Result update(@ModelAttribute User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@RequestParam(value = "id") Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size
            ,@RequestParam(required=true,value="name",defaultValue="")String name) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findByName(name.trim());
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
