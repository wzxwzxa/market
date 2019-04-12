package com.rimi.market.commons;

import java.io.Serializable;

/**
 * 一般返回类型
 *
 * @auther dell
 * @date 2019-04-12 16:13
 */
public class ResultVo implements Result, Serializable {
    //错误码
    private int code;
    //错误信息
    private String msg;

    public ResultVo() {
    }

    public ResultVo(ResultCode resultCode){
        this.code=resultCode.getCode();
        this.msg=resultCode.getMsg();
    }
    public ResultVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static Result success(){
        return new ResultVo(ResultCode.SUCCESS);
    }
    public static Result failure(){
        return new ResultVo(ResultCode.FAILURE);
    }
    public static Result of(ResultCode resultCode){
        return new ResultVo(resultCode);
    }

    @Override
    public String toString() {
        return "ResultVo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
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
}
