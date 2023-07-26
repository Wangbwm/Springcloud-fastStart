package com.morewen.api.test.factory;

import com.morewen.api.test.RemoteTestService;
import com.morewen.common.core.utils.AjaxResult;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Wangbw
 */
@Component
public class RemoteTestFallbackFactory implements FallbackFactory<RemoteTestService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteTestFallbackFactory.class);
    @Override
    public RemoteTestService create(Throwable throwable) {
        log.error("测试服务调用失败:{}", throwable.getMessage());
        return new RemoteTestService()
        {
            @Override
            public AjaxResult index(String name) {
                return AjaxResult.error("调用失败");
            }
        };
    }
}
