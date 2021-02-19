package com.douyuehan.doubao.service;

import com.douyuehan.doubao.entity.BmsTip;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 每日赠言 服务类
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */

public interface BmsTipService extends IService<BmsTip> {
BmsTip getRamdomTip();
}
