package com.example.demo.test;


import com.example.demo.pojo.SystemAccident;
import com.example.demo.service.DataBaseService;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Result<PageObject> getSystemCareer(PageObject pageObject) {
        System.out.println("===>");
        Result<PageObject> systemCareer = dataBaseService.getSystemCareer(pageObject);
        return systemCareer;
    }

    //accident事故类别

    /**
     * 事故类别查询，根据isCert
     * @param pageObject
     * @return
     */
    @RequestMapping("/systemAccident")
    @ResponseBody
    public Result<PageObject> getSystemAccidentByCert(PageObject pageObject,Integer isCert) {
        Result<PageObject> rs = dataBaseService.getSystemAccidentByCert(pageObject,isCert);
        return rs;
    }

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    @RequestMapping("/systemAccidentById/{id}")
    @ResponseBody
    public Result<SystemAccident> systemAccidentById(@PathVariable Integer id) {
        Result<SystemAccident> rs = dataBaseService.systemAccidentById(id);
        return rs;
    }

    /**
     * 修改事故类别
     * @param systemAccident
     * @return
     */
    @RequestMapping("/updateSystemAccident")
    @ResponseBody
    public Result updateSystemAccident(SystemAccident systemAccident) {
        Result rs = dataBaseService.updateSystemAccident(systemAccident);
        return rs;
    }

    @RequestMapping("/delSystemAccident/{id}")
    @ResponseBody
    public Result delSystemAccident(@PathVariable Integer id) {
        Result rs = dataBaseService.delSystemAccident(id);
        return rs;
    }


}
