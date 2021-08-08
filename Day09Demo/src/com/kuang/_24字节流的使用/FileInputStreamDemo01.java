package com.kuang._24字节流的使用;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 *
 *      1. FileInputStream文件字节输入流
 *          -- 作用：以内存为基准，把磁盘文件中的数据按照字节的形式读入到内存中的流。
 *                  简单来说，就是按照字节读取文件数据到内存
 *          -- 构造器：
 *              1.public FileInputStream(File path):创建一个字节输入流管道与源文件对象接通
 *              2.public FileInputStream(String pathName):创建一个字节输入流管道与文件路径对接
 *          -- 方法：
 *              1.public int read():每次读取一个字节返回！读取完毕会返回-1
 *
 *      小结：
 *          一个一个字节读取英文和数字没有问题。
 *          但是一个读取中文输出无法避免乱码，因为会介质中文的字节。
 *          一个一个字节的读取数据，性能比较差，所以禁止使用方案！！！
 *
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1. 创建文件对象定位dlei01.txt
        File file = new File("Day09Demo/src/dlei01.txt");
        // 2. 创建一个字符输入流管道与源文件接通
        FileInputStream stream = new FileInputStream(file);

        int code1 = stream.read();
        System.out.println((char) code1);

        int ch = 0;
        while ((ch = stream.read()) != -1){
            System.out.print((char) ch);
        }
    }
}
