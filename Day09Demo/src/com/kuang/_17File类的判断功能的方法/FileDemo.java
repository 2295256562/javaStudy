package com.kuang._17File类的判断功能的方法;

import java.io.File;


/***
 * public boolean exists() {}：判断文件是否存在
 * public boolean isFile() {}：判断是否为文件
 * public boolean isDirectory() {}：判断是否为文件夹
 */
public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("E:" + File.separator + "Python代码" + File.separator + "javaStudy" + File.separator + "Day09Demo" + File.separator + "src" + File.separator + "com" + File.separator + "kuang" + File.separator + "_15File类的概述" + File.separator + "FileDemo01.java");
        // 判断文件是否存在
        System.out.println(f1.exists());
        // 判断是否为文件，如果是文件返回true，反之
        System.out.println(f1.isFile());
        // 判断是否为文件夹，如果是返回true，反之
        System.out.println(f1.isDirectory());
    }
}
