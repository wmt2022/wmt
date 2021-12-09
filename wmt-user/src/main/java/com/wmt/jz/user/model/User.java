package com.wmt.jz.user.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 8769983545280782037L;

//    @Field("address")
    @Id
    @Column
    @ApiModelProperty(value = "用户id")
    private int id;

    @Column(name = "user_name")
    @ApiModelProperty(value = "用户名称")
    private String userName;

    @Column(name = "user_account")
    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @Column(name = "phone_num")
    @ApiModelProperty(value = "用户手机号")
    private String phoneNum;

    @Column(name = "profile_photo")
    @ApiModelProperty(value = "头像")
    private String profilePhoto;

    @Column(name = "gender")
    @ApiModelProperty(value = "性别")
    private Integer gender;
}
