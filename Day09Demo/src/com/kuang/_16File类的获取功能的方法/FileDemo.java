package com.kuang._16File类的获取功能的方法;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("E:" + File.separator + "Python代码" + File.separator + "javaStudy" + File.separator + "Day09Demo" + File.separator + "src" + File.separator + "com" + File.separator + "kuang" + File.separator + "_15File类的概述" + File.separator + "FileDemo01.java");
        // 获取它的绝对路径
        System.out.println(f1.getAbsoluteFile());
        // 获取文件定义的时候使用的路径
        System.out.println(f1.getPath());
        // 获取文件名称 带后缀
        System.out.println(f1.getName());
        // 获取文件大小 字节数
        System.out.println(f1.length());
    }
}
