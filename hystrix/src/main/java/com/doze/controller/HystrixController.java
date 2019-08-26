package com.doze.controller;

import com.doze.entity.Student;
import com.doze.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.controller
 * @Author: hbn
 * @CreateTime: 2019-08-23 17:12
 * @Description:
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @PostMapping("/save")
    public void  save(@RequestBody Student student){
        feignProviderClient.save(student);
    }

}
