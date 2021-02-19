package com.douyuehan.doubao.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BmsTag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签ID
     */
    private String id;

    /**
     * 标签
     */
    private String name;

    /**
     * 关联话题
     */
    private Integer topicCount;


}
