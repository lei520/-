package com.example.demo.service;


import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;

public interface DataBaseService {


    Result<SystemCareerDO> getSystemCareer(PageObject pageObject);

   /* Result<SystemCareerDO> delSystemCareer(Integer id);

    Result<SystemCareerDO> SystemCareerById(Integer id);

    Result<SystemCareerDO> addSystemCareer(SystemCareerDO systemCareerDO);*/
}
