package com.doze.controller;

import com.doze.entity.Student;
import com.doze.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.controller
 * @Author: hbn
 * @CreateTime: 2019-08-23 17:12
 * @Description:
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private IStudentRepository iStudentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return port;
    }

    @GetMapping("/findAll")
    public Object findAll() {
        return iStudentRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        iStudentRepository.save(student);
    }
}
