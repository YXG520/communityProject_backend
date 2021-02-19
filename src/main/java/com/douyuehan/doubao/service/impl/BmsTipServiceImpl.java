package com.douyuehan.doubao.service.impl;

import com.douyuehan.doubao.entity.BmsTip;
import com.douyuehan.doubao.mapper.BmsTipMapper;
import com.douyuehan.doubao.service.BmsTipService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 每日赠言 服务实现类
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@Service
@Slf4j//注解
public class BmsTipServiceImpl extends ServiceImpl<BmsTipMapper, BmsTip> implements BmsTipService {

    @Override
    public BmsTip getRamdomTip() {

        BmsTip bmsTip=null;
        try{
            bmsTip=this.baseMapper.getRandomTip();
        }catch (Exception e){
            log.info("转化失败");
        }
     return bmsTip;
    }
}
