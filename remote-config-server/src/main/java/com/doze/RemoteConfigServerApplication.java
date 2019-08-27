package com.doze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze
 * @Author: hbn
 * @CreateTime: 2019-08-27 16:15
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class RemoteConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigServerApplication.class,args);
    }
}
