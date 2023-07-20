package cn.iteuds.lottery.common;

import java.io.Serializable;

/**
 * @description: 统一返回对象中，Code码、Info描述
 * @author：yinzheng
 * @date: 2023/7/20
 * @Copyright： yinzheng
 */
public class Result implements Serializable {
    private static final long serialVersionUID = -3826891916021780628L;
    private String code;
    private String info;

    public Result() {
    }

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildSuccessResult(String code, String info) {
        return new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult(String code, String info) {
        return new Result(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
    }
}
