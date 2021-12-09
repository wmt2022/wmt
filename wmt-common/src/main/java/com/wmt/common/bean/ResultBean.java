package com.wmt.common.bean;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 自定义Api响应结构
 *
 * @param <T> 响应数据类型
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/23
 */
@Data
public class ResultBean<T> {

    @ApiModelProperty(value = "响应状态码，200表示成功")
    private int code = ResponseStatus.OK.getCode();

    /**
     * 响应消息
     */
    @ApiModelProperty(value = "响应状态信息")
    private String msg = ResponseStatus.OK.getMsg();
    /**
     * 响应中的数据
     */
    @ApiModelProperty(value = "响应数据")
    private T data;

    private ResultBean() {

    }

    private ResultBean(ResponseStatus ResponseStatus) {
        this.code = ResponseStatus.getCode();
        this.msg = ResponseStatus.getMsg();
    }


    private ResultBean(T data) {
        this.data = data;
    }

    private ResultBean(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    /**
     * 业务处理成功,无数据返回
     */
    public static ResultBean ok() {
        return new ResultBean();
    }

    /**
     * 业务处理成功，有数据返回
     */
    public static <T> ResultBean ok(T data) {
        return new ResultBean(data);
    }

    /**
     * 业务处理失败
     */
    public static ResultBean fail(ResponseStatus ResponseStatus) {
        return new ResultBean(ResponseStatus);
    }

    public static ResultBean error(int code, String message) {
        return new ResultBean(code, message);
    }

    /**
     * 系统错误
     */
    public static ResultBean error() {
        return new ResultBean(ResponseStatus.ERROR);
    }
}

