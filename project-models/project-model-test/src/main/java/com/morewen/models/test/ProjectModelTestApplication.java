package com.morewen.models.test;

import com.morewen.common.core.anno.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Wangbw
 */
@EnableRyFeignClients
@SpringBootApplication
@ComponentScan(basePackages = {"com.morewen.models.test", "com.morewen.common.core", "com.morewen.api.test"})
public class ProjectModelTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectModelTestApplication.class, args);
    }

}
