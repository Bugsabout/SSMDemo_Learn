package com.ssm.model;

import java.util.Map;

/**
 * @program: SSMDemo-master
 * @author: 吴小龙
 * @create: 2019-12-12 15:01
 * @description: 返回格式
 */

public class ReturnBean {
    private int code;
    private String msg;
    private Object data;

    public ReturnBean(int i, String ok, Map<String, Object> resultMap) {
        this.code=i;
        this.msg=ok;
        this.data=resultMap;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
