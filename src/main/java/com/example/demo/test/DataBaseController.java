package com.example.demo.test;


import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.service.DataBaseService;
import com.example.demo.service.UserServiceI;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DataBaseController {
    @Resource
    private DataBaseService dataBaseService;

    @RequestMapping("/6677")
    @ResponseBody
    public Result<SystemCareerDO> getSystemCareer(PageObject pageObject) {
        System.out.println("===>");
        Result<SystemCareerDO> systemCareer = dataBaseService.getSystemCareer(pageObject);
        return systemCareer;
    }

}
