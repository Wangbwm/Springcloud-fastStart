package com.morewen.projectfeign.client;

import com.morewen.projectcommon.utils.AjaxResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Wangbw
 */
@FeignClient(value = "testService")
public interface TestClient {
    @PostMapping("/test/index")
    AjaxResult index(@RequestParam("name") String name);
}
