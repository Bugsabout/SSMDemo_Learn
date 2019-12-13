package com.ssm.service.impl;

import com.ssm.mapper.RabbitMQMapper;
import com.ssm.model.ResponseTest;
import com.ssm.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: SSMDemo-master
 * @author: 吴小龙
 * @create: 2019-12-12 14:54
 * @description:
 */
@Service
public class RabbitMEServiceImpl implements RabbitMQService {
    @Autowired
    private RabbitMQMapper rabbitMQMapper;


    @Override
    public List<ResponseTest> selectAll(String timeStart, String timeEnd) {
        Map param = new HashMap();
        param.put("timeStart", timeStart);
        param.put("timeEnd", timeEnd);

        return rabbitMQMapper.selectAll(param);
    }
}
