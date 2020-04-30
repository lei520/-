package com.example.demo.service;


import com.example.demo.pojo.SystemAccident;
import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;

public interface DataBaseService {


    Result<PageObject> getSystemCareer(PageObject pageObject);

    Result<SystemAccident> systemAccidentById(Integer id);

    Result updateSystemAccident(SystemAccident systemAccident);

    Result delSystemAccident(Integer id);

    Result<PageObject> getSystemAccidentByCert(PageObject pageObject,Integer isCert);
}
