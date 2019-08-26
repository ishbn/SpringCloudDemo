package com.doze.repository.Impl;

import com.doze.entity.Student;
import com.doze.repository.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.repository.Impl
 * @Author: hbn
 * @CreateTime: 2019-08-23 17:22
 * @Description:
 */
@Repository
public class StudentRepositoryImpl implements IStudentRepository {

    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"小明",18));
        studentMap.put(2L,new Student(2L,"小黄",20));
        studentMap.put(3L,new Student(3L,"小宁",24));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public void save(Student student) {
        studentMap.put(student.getId(),student);
    }
}
