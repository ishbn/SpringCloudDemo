package com.doze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze
 * @Author: hbn
 * @CreateTime: 2019-08-24 00:13
 * @Description:
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
