package com.wmt.common.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 响应状态枚举
 *
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/27
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResponseStatus {

    /**
     * 请求成功
     */
    OK(200, "SUCCESS"),

    /**
     * 服务器异常
     */
    ERROR(500, "未知异常，请联系管理员！"),

    /**
     * 参数错误
     */
    PARAM_ERROR(400, "非法参数！"),

    /**
     * 拒绝访问
     */
    FORBIDDEN(403, "拒绝访问！"),


    /**
     * 用户相关错误
     */
    NO_LOGIN(1001, "未登录或登录失效！"),
    USERNAME_PASS_ERROR(1004, "账号或密码错误！"),
    TWO_PASSWORD_DIFF(1005, "两次输入的新密码不匹配!"),
    OLD_PASSWORD_ERROR(1006, "旧密码不匹配!"),
    ALLOW_ROLE_ERROR(1007, "权限异常!"),
    USER_NOT_EXIST_ERROR(1008, "用户不存在!"),
    USER_ACCOUNT_ERROR(1009, "账号重复!"),
    SYS_NO_PERMISSION(10010, "没有权限！"),

    /**
     * 案件相关错误
     */
    Bind_Error(2001, "设备已经处于绑定状态，请解绑后再绑定！"),
    CaseNotFound_Error(2002, "案件已经结束或该案件不存在！"),
    CaseUser_Error(2003, "用户已在案件中！"),
    CaseId_NotFound(2004, "请求头中缺少案件id！"),
    /**
     * 睿极服务
     */
    RJ_ERROR(3001, "远程服务异常，请联系管理员"),
    DEVICE_NOTONLINE_ERROR(3002, "设备不在线，请检查"),
    PREVIEW_NOT_ONLINE(3003, "当前预览的设备不在线，请稍后尝试"),

    /**
     * 其他通用错误
     */
    PASSWORD_ERROR(88001, "密码错误！"),
    TERMINAL_ERROR(88002, "终端类型错误！"),
    ROLE_ERROR(88003, "角色不正确！"),

    /**
     * Mqtt消息错误
     */
    MQTT_ERROR(50001, "Mqtt消息错误！"),

    /**
     * 数据库相关错误
     */
    SQL_ERROR(60001, "数据库操作异常！"),
    SQL_DUPLICATE_ERROR(60002, "违反数据库唯一约束"),
    ;
    private int code;
    private String msg;


}
