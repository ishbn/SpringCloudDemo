package com.doze.feign.Impl;

import com.doze.entity.Student;
import com.doze.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.feign.Impl
 * @Author: hbn
 * @CreateTime: 2019-08-24 16:58
 * @Description:
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public String index() {
        return "维护中";
    }
}
