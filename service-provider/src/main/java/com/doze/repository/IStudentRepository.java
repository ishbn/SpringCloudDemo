package com.doze.repository;

import com.doze.entity.Student;

import java.util.Collection;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.repository
 * @Author: hbn
 * @CreateTime: 2019-08-23 17:19
 * @Description:
 */

public interface IStudentRepository {

    Collection<Student> findAll();

    void save(Student student);
}
