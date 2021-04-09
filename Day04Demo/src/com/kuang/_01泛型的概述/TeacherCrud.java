package com.kuang._01泛型的概述;

public class TeacherCrud implements CRUD<Teacher>{
    @Override
    public Teacher add(Teacher entity) {
        System.out.println("新增一个老师");
        return null;
    }

    @Override
    public Teacher delete(Teacher entity) {
        System.out.println("删除一个老师");
        return null;
    }

    @Override
    public Teacher update(Teacher entity) {
        return null;
    }

    @Override
    public Teacher query(int id) {
        return null;
    }
}
