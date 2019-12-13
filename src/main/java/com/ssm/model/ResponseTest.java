package com.ssm.model;

/**
 * @program: SSMDemo-master
 * @author: 吴小龙
 * @create: 2019-12-12 14:52
 * @description:
 */

public class ResponseTest {
    private int messageId;
    private String CollectTime;
    private int CollectValue;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getCollectTime() {
        return CollectTime;
    }

    public void setCollectTime(String collectTime) {
        CollectTime = collectTime;
    }

    public int getCollectValue() {
        return CollectValue;
    }

    public void setCollectValue(int collectValue) {
        CollectValue = collectValue;
    }
}
