package com.doze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze
 * @Author: hbn
 * @CreateTime: 2019-08-27 16:26
 * @Description:
 */
@SpringBootApplication
public class RemoteConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(RemoteConfigClientApplication.class,args);
    }
}
