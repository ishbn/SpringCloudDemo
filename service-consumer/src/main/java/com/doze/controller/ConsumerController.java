package com.doze.controller;

import com.doze.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Collections;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.controller
 * @Author: hbn
 * @CreateTime: 2019-08-23 21:52
 * @Description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){

        return restTemplate.getForEntity("http://localhost:8201/provider/findAll",Collection.class).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8201/provider/save",student,null);
    }
 }
