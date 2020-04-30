package com.example.demo.service.impl;


import com.example.demo.mapper.SystemAccidentMapper;
import com.example.demo.mapper.SystemCarrerMapper;
import com.example.demo.pojo.SystemAccident;
import com.example.demo.pojo.SystemAccidentExample;
import com.example.demo.pojo.SystemCareerDO;
import com.example.demo.service.DataBaseService;
import com.example.demo.util.BasePageQuery;
import com.example.demo.util.ErrorCode;
import com.example.demo.util.PageObject;
import com.example.demo.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@Component
public class DataBaseServiceImpl implements DataBaseService {


    @Resource
    private SystemCarrerMapper systemCarrerMapper;
    @Resource
    private SystemAccidentMapper systemAccidentMapper;

    @Override
    public Result<PageObject> getSystemCareer(PageObject pageObject) {

        if ("".equals(pageObject.getSize())){
            return Result.fail(ErrorCode.PARAM_ERROR);
        }
        try {
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
            return Result.success(pageObject);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(ErrorCode.EMPTY_RESULT.getCode(), e.getMessage());
        }
    }
    @Override
    public Result<PageObject> getSystemAccidentByCert(PageObject pageObject,Integer isCert) {
        if (isCert==null){
            return Result.fail(ErrorCode.PARAM_ERROR);
        }
        try {
            BasePageQuery basePageQuery = new BasePageQuery();
            basePageQuery.setPage(pageObject.getPage());
            basePageQuery.setSize(pageObject.getSize());
            List<SystemAccident> list =  systemAccidentMapper.getSystemAccidentByCert(basePageQuery.getOffset(),pageObject.getSize(),isCert);
            pageObject.setDataList(list);
            int total = (systemAccidentMapper.SystemAccidentByCert(isCert).size()+pageObject.getSize()-1)/pageObject.getSize();
            pageObject.setTotal(total);
            return Result.success(pageObject);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(ErrorCode.EMPTY_RESULT.getCode(), "查询失败");
        }
    }

    @Override
    public Result<SystemAccident> systemAccidentById(Integer id) {
        try {
            SystemAccident systemAccident = systemAccidentMapper.selectByPrimaryKey(id);
            return Result.success(systemAccident);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(ErrorCode.EMPTY_RESULT.getCode(), "获取数据失败");
        }
    }

    @Override
    public Result updateSystemAccident(SystemAccident systemAccident) {
        if (systemAccident == null){
            return Result.fail(ErrorCode.PARAM_ERROR);
        }
        try {
            systemAccidentMapper.updateByPrimaryKeySelective(systemAccident);
            return Result.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(ErrorCode.UNKNOWN.getCode(),"修改失败");
        }
    }

    @Override
    public Result delSystemAccident(Integer id) {
        if (id == null){
            return Result.fail(ErrorCode.PARAM_ERROR);
        }
        try {
            systemAccidentMapper.deleteByPrimaryKey(id);
            return Result.success();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(ErrorCode.SYSTEM_ERROR.getCode(),"删除失败");
        }
    }


}
