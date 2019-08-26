package com.doze.feign;

import com.doze.entity.Student;
import com.doze.feign.Impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.feign
 * @Author: hbn
 * @CreateTime: 2019-08-24 16:20
 * @Description:
 */
@FeignClient(value = "provider",fallback = FeignError.class )
public interface FeignProviderClient {

    @GetMapping("/provider/findAll")
    Collection<Student> findAll();

    @PostMapping("/provider/save")
    void save(Student student);

    @GetMapping("/provider/index")
    String index();
}
