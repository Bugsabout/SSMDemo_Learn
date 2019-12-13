package com.ssm.service;

import com.ssm.model.ResponseTest;
import com.ssm.model.User;

import java.util.List;

public interface RabbitMQService {

    List<ResponseTest> selectAll(String timeStart,String timeEnd);

}
