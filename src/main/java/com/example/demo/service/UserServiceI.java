package com.example.demo.service;

import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.pojo.User;
import com.example.demo.util.Result;

public interface UserServiceI {
    User getname();
    Result<SystemCareerDO> getSystemCareer();
}
