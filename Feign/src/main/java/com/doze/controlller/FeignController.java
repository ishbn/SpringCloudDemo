package com.doze.controlller;

import com.doze.entity.Student;
import com.doze.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.controlller
 * @Author: hbn
 * @CreateTime: 2019-08-24 16:23
 * @Description:
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
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
