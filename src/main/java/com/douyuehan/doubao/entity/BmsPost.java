package com.douyuehan.doubao.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 话题表
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BmsPost implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * markdown内容
     */
    private String content;

    /**
     * 作者ID
     */
    private String userId;

    /**
     * 评论统计
     */
    private Integer comments;

    /**
     * 收藏统计
     */
    private Integer collects;

    /**
     * 浏览统计
     */
    private Integer view;

    /**
     * 是否置顶，1-是，0-否
     */
    private Boolean top;

    /**
     * 是否加精，1-是，0-否
     */
    private Boolean essence;

    /**
     * 专栏ID
     */
    private Integer sectionId;

    /**
     * 发布时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


}
