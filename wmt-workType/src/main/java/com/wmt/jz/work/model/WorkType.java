package com.wmt.jz.work.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "tb_work")
public class WorkType implements Serializable {
    private static final long serialVersionUID = 6116708535994442207L;

    @Id
    @Column
    @ApiModelProperty(value = "id")
    private int id;

    @Column(name = "user_id")
    @ApiModelProperty(value = "用户id")
    private int userId;

    @Column(name = "user_account")
    @ApiModelProperty(value = "用户账号")
    private String userAccount;

}
