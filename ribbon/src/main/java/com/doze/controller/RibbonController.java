package com.doze.controller;

import com.doze.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.controller
 * @Author: hbn
 * @CreateTime: 2019-08-23 21:52
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForEntity("http://provider/provider/index",String.class).getBody();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){

        return restTemplate.getForEntity("http://provider/provider/findAll",Collection.class).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://provider/provider/save",student,null);
    }
 }
