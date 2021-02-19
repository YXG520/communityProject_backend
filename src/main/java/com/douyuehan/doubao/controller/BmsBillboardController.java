package com.douyuehan.doubao.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.douyuehan.doubao.common.api.ApiResult;
import com.douyuehan.doubao.entity.BmsBillboard;
import com.douyuehan.doubao.service.BmsBillboardService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 全站公告 前端控制器
 * </p>
 *
 * @author yxg
 * @since 2021-02-17
 */
@RestController
@RequestMapping("/billboard")
public class BmsBillboardController {
@Resource
    private BmsBillboardService bmsBillboardService;
@GetMapping("/show")
public ApiResult<BmsBillboard> getNotices(){
    List<BmsBillboard> list= bmsBillboardService.list(new LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::getShow,true));
    System.out.println("哈哈哈哈"+list.get(list.size()-1));
    return ApiResult.success(list.get(list.size()-1));//list.get(list.size()-1)获取最后一条记录

}

}
