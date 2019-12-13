package com.ssm.mapper;

import com.ssm.model.ResponseTest;
import com.ssm.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RabbitMQMapper {
    List<ResponseTest> selectAll(@Param("param") Map param);
}
