package com.kuang._00字符流的使用;

import java.io.FileReader;


/**
 *    1. FileReader：文件字符输入流
 *        -- 作用：以内存为基准，把磁盘文件的数据以字符的形式读入到内存。
 *           简单来说，读取文本文件内容到内存中去
 *        -- 构造器：
 *           public FileReader(File file)：创建一个字符输入流与源文件对象接通
 *           public FileReader(String filePath)：创建一个字符输入流与源文件路径接通
 *        -- 方法：
 *           public int read()：读取一个字符的编号返回！读取完毕返回-1
 *           public int read(char[] buffer)：读取一个字符数组，读取多少个字符就返回多少个数量。
 *   小结：
 *      字符流一个一个字符的读取文本内容输出，可以解决中文读取输出乱码的问题
 *      字符流很适合操作文本文件内容
 *      但是：一个一个字符的读取文本内容，性能较差
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个字符的编号返回
        FileReader fr = new FileReader("Day10Demo/src/dlei01.txt");
        // 2.按照字符读取，每次读取一个字符的编号返回
        // int code = fr.read();
        // System.out.println((char) code);

        // 使用while循环一个一个字符读取
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }
    }
}
