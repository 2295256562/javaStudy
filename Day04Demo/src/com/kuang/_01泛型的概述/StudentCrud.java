package com.kuang._01泛型的概述;

public class StudentCrud implements CRUD<Student>{
    @Override
    public Student add(Student entity) {
        System.out.println("新增一个学生");
        return null;
    }

    @Override
    public Student delete(Student entity) {
        System.out.println("删除一个学生");
        return null;
    }

    @Override
    public Student update(Student entity) {
        return null;
    }

    @Override
    public Student query(int id) {
        return null;
    }
}
