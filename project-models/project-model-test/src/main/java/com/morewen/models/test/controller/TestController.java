package com.morewen.models.test.controller;

import com.morewen.api.test.RemoteTestService;
import com.morewen.common.core.anno.Log;
import com.morewen.common.core.enums.BusinessType;
import com.morewen.common.core.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wangbw
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    RemoteTestService remoteTestService;

    @PostMapping("/index/{name}")
    @Log(title = "测试服务", businessType = BusinessType.OTHER)
    AjaxResult index(@PathVariable("name") String name) {
        return AjaxResult.success("hello " + name);
    }

    @PostMapping("/api/{name}")
    @Log(title = "API测试", businessType = BusinessType.OTHER)
    AjaxResult api(@PathVariable("name") String name) {
        return remoteTestService.index(name);
    }

}
