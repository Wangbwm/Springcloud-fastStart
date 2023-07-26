package com.morewen.api.test;

import com.morewen.api.test.factory.RemoteTestFallbackFactory;
import com.morewen.common.core.constant.ServiceNameConstants;
import com.morewen.common.core.utils.AjaxResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Wangbw
 */
@FeignClient(contextId = "remoteTestService", value = ServiceNameConstants.TEST_SERVICE, fallbackFactory = RemoteTestFallbackFactory.class)
public interface RemoteTestService {
    @PostMapping(value = "/test/index/{name}")
    AjaxResult index(@PathVariable("name") String name);
}
