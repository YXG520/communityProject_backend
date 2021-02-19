package com.douyuehan.doubao.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.douyuehan.doubao.common.api.ApiResult;
import com.douyuehan.doubao.entity.BmsBillboard;
import com.douyuehan.doubao.entity.BmsTip;
import com.douyuehan.doubao.service.BmsBillboardService;
import com.douyuehan.doubao.service.BmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 每日赠言 前端控制器
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@RestController
@RequestMapping("/tip")
public class BmsTipController {
    @Resource
    private BmsTipService bmsTipService;
    @GetMapping("/today")
    public ApiResult<BmsTip> getNotices(){
        BmsTip bmsTip = bmsTipService.getRamdomTip();
        return ApiResult.success(bmsTip);

    }
}
