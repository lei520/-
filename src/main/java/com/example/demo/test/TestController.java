package com.example.demo.test;

import com.example.demo.pojo.User;
import com.example.demo.service.UserServiceI;
import com.example.demo.util.AjaxResult;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("lei")
public class TestController {
    @Autowired
    private UserServiceI userServiceI;
    @RequestMapping("l")
    public AjaxResult test(){
        //Map map = new HashMap();
        User user = userServiceI.getname();
        String nihao = "lalal";
        return AjaxResult.success(nihao,user);
    }
    @RequestMapping("l2")
    public Result<Object> test2(){
        //Map map = new HashMap();
        User user = userServiceI.getname();
        String nihao = "lalal";
        return Result.success();
    }
    @RequestMapping("l3")
    public Result test3(){
        //Map map = new HashMap();
        User user = userServiceI.getname();
        return Result.success();
    }
    @RequestMapping("l4")
    public Result test4(){
        //Map map = new HashMap();
        User user = userServiceI.getname();
        return Result.fail();
    }
    @RequestMapping("l5")
    public Result test5(){
        //Map map = new HashMap();
        User user = userServiceI.getname();
        return Result.fail(22,"李四");
    }

}
