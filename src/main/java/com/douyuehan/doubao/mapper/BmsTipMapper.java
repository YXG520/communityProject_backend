package com.douyuehan.doubao.mapper;

import com.douyuehan.doubao.entity.BmsTip;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 每日赠言 Mapper 接口
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@Repository
public interface BmsTipMapper extends BaseMapper<BmsTip> {
    BmsTip getRandomTip();
}
