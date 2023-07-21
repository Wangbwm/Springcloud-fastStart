package com.morewen.projectfeign.handler;


import com.morewen.projectcommon.utils.AjaxResult;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;


/**
 * 全局异常处理器
 * 
 * @author Wangbw
 */
@RestControllerAdvice
@Slf4j
public class FeignExceptionHandler
{
    /**
     * feign调用异常
     */
    @ExceptionHandler(FeignException.class)
    public AjaxResult handleFeignException(HttpRequestMethodNotSupportedException e,
                                                          HttpServletRequest request)
    {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}',发生feign调用异常.", requestURI, e);
        return AjaxResult.error(e.getMessage());
    }

}
