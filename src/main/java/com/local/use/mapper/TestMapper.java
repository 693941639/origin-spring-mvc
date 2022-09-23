package com.local.use.mapper;

import com.local.use.entity.Test;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestMapper {
    @Select("SELECT * FROM test WHERE id = #{id}")
    Test getById(@Param("id") long id);
}
