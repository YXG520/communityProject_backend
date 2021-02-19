package com.douyuehan.doubao.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户昵称
     */
    private String alias;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 积分
     */
    private Integer score;

    /**
     * token
     */
    private String token;

    /**
     * 个人简介
     */
    private String bio;

    /**
     * 是否激活，1：是，0：否
     */
    private Boolean active;

    /**
     * 状态，1：使用，0：停用
     */
    private Boolean status;

    /**
     * 用户角色
     */
    private Integer roleId;

    /**
     * 加入时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


}
