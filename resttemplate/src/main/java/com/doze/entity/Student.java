package com.doze.entity;

/**
 * @BelongsProject: clouddemo
 * @BelongsPackage: com.doze.entity
 * @Author: hbn
 * @CreateTime: 2019-08-23 17:13
 * @Description:
 */

public class Student {

    private long id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
