package com.douyuehan.doubao.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 全站公告
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("bms_billboard")//表明BmsBillboard类与数据库中的bms_billboard表对应
@Accessors(chain = true)
@Builder//类似于Accessors的功能，只不过对构建类有效
@AllArgsConstructor
@NoArgsConstructor
public class BmsBillboard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公告
     */
    private String content;

    /**
     * 公告时间
     */
    //fill= FieldFill.INSERT表示在数据进行更新时才更新时间
    @TableField(value="create_time",fill= FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 1：展示中，0：过期
     */
    @Builder.Default//设置默认值为false
    @TableField(value="`show`")//show，type是mysql中的关键字，必须加上反引号,此外数据库的tinyint字段默认映射boolean类型
    private Boolean show=false;


}
