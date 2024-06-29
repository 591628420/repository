package com.component.mapper;

import com.component.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {
    @Select("select id,name from t_test where id =#{id}")
    Test selectById(@Param("id") Long id);
}
