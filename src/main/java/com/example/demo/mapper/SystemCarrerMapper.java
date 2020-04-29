package com.example.demo.mapper;


import com.example.demo.pojo.SystemCareerDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface SystemCarrerMapper {
    List<SystemCareerDO> getSystemCareer();

    List<SystemCareerDO> getSystemCareers(@Param("offset") Integer offset,@Param("size") int size);
}
