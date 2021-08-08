package com.kuang._15File类的概述;

import java.io.File;

/**
 * File类的创建文件对象的API：
 *      包：java.io.File
 *      (1) 构造器
 *          -- public File(String pathname): 根据路径获取文件对象
 *          -- public File(String parent, String child): 根据父路径和文件对象获取
 *          -- public File(File parent, String child)
 *
 *      File类创建文件对象的格式：
 *          1. File f = new File("绝对路径/相对路径");
 *              绝对路径：
 *                   -- 从磁盘的盘符一路走到目的位置的路径。绝对路径依赖具体的环境，一旦脱离环境，代码块可能出错
 *                   -- 一般是定位某个操作系统中的某个文件对象
 *              相对路径：不带盘符的
 *                   -- 默认是直接相对到工程目录下寻找文件的
 *                   -- 相对路径是只能用于寻找工程下的文件
 *                   -- 能用相对路径就应该尽量使用，可以跨平台
 *         2. File f = new File("文件对象/文件夹对象");
 *              广义来说：文件是包含文件和文件夹的
 *
 *
 *    小结：
 *          创建文件对象可以用绝对路径也可以用相对路径
 *          相对路径只能用于寻找工程下的文件
 *          文件对象可以表示文件也可以表示文件夹
 */
public class FileDemo01 {
    public static void main(String[] args) {
        // 1.创建文件对象，先使用绝对路径
        // 文件路径分隔符：
        //      1. 使用正斜杠: /
        //      2. 使用反斜杠：\
        //      3. 使用分隔符API：File.separator
        // new File("E:/Python代码/javaStudy/Day09Demo/src/com/kuang/_15File类的概述");
        // new File("E:\\Python代码\\javaStudy\\Day09Demo\\src\\com\\kuang\\_15File类的概述");
        File f = new File("E:"+File.separator+"Python代码"+File.separator+"javaStudy"+File.separator+"Day09Demo"+File.separator+"src"+File.separator+"com"+File.separator+"kuang"+File.separator+"_15File类的概述" + File.separator + "FileDemo01.java");
        System.out.println(f.length());

        // 2. 创建文件对象：使用相对路径
        File f2 = new File("Day09Demo/src/dlei01.txt");
        System.out.println(f2.length());

        // 3. 创建文件对象：代表文件夹
        File f3 = new File("E:\\Python代码\\javaStudy\\Day09Demo\\src\\com\\kuang\\_15File类的概述");
        System.out.println(f3.exists());   // 判断文件夹是否存在
    }
}
