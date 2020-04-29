package com.example.demo.service.impl;

import com.example.demo.mapper.PortalMapper;
import com.example.demo.mapper.SystemCarrerMapper;
import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.pojo.User;
import com.example.demo.service.UserServiceI;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceI {
    @Resource
    private PortalMapper portalMapper;

    /**
     *
     *
     * @return
     */
    @Resource
    private SystemCarrerMapper systemCarrerMapper;

    @Override
    public Result<SystemCareerDO> getSystemCareer() {

        List<SystemCareerDO> list = systemCarrerMapper.getSystemCareer();
        PageObject<SystemCareerDO> pageObject = new PageObject<>();
        pageObject.setDataList(list);
        pageObject.setTotal(list.size()/20);
        Result result = new Result();
        result.setData(pageObject);
        return null;
    }


    @Override
    public User getname() {
        //List<User> list = portalMapper.getAll();
        User u = new User(1,"11","22");
        return u ;
    }
}
