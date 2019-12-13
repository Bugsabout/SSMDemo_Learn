package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.model.ResponseTest;
import com.ssm.model.ReturnBean;
import com.ssm.service.RabbitMQService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: SSMDemo-master
 * @author: 吴小龙
 * @create: 2019-12-12 14:46
 * @description: rabbitmq测试
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("rabbitmq")
public class RabbitMQController {
    @Autowired
    private RabbitMQService rabbitMQService;


    @RequestMapping("selectAll")
    public ReturnBean selectAll(String timeStart,String timeEnd) {
        Map<String,Object> resultMap=new HashMap<String,Object>();
        List<ResponseTest> responseTests = rabbitMQService.selectAll(timeStart,timeEnd);
        String message= JSON.toJSONString(responseTests);
        System.out.println(message);
        resultMap.put("list",responseTests);

        return  new ReturnBean(200, "ok", resultMap);
    }


















}
