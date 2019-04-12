package com.rimi.market.commons;

/**
 * 统一返回的状态码
 *
 * @auther dell
 * @date 2019-04-12 16:28
 */
public enum  ResultCode {

    /**
     * 成功
     */
    SUCCESS(200,"成功"),
    /**
     * 失败
     */
    FAILURE(201,"失败");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
    }}
