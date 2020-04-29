package com.example.demo.service.impl;


import com.example.demo.mapper.SystemCarrerMapper;
import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.service.DataBaseService;
import com.example.demo.util.BasePageQuery;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class DataBaseServiceImpl implements DataBaseService {


    @Resource
    private SystemCarrerMapper systemCarrerMapper;

    @Override
    public Result getSystemCareer(PageObject pageObject) {
        BasePageQuery basePageQuery = new BasePageQuery();
        basePageQuery.setPage(pageObject.getPage());
        basePageQuery.setSize(pageObject.getSize());
        List<SystemCareerDO> list = systemCarrerMapper.getSystemCareers(basePageQuery.getOffset(),pageObject.getSize());
        pageObject.setDataList(list);
        int total = (systemCarrerMapper.getSystemCareer().size()+pageObject.getSize()-1)/pageObject.getSize();
        pageObject.setTotal(total);
        Result result = new Result();
        result.setData(pageObject);
        Result.success(pageObject);
        //result.isSuccess();
        return Result.success(pageObject);
    }

    /*@Override
    public Result<SystemCareerDO> delSystemCareer(Integer id) {
        systemCarrerMapper.delSystemCareer(id);
        return null;
    }

    @Override
    public Result<SystemCareerDO> SystemCareerById(Integer id) {
        SystemCareerDO systemCareerDO = systemCarrerMapper.SystemCareerById(id);
        return null;
    }

    @Override
    public Result<SystemCareerDO> addSystemCareer(SystemCareerDO systemCareerDO) {
        //systemCarrerMapper.addSystemCareer(systemCareerDO);
        return null;
    }*/
}
