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
 *       字符流按照字符数组循环读取数据，可以解决中文读取输出乱码的问题，而且性能比较好
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("Day10Demo/src/dlei02.txt");

        // char[] buffer = new char[3];
        // int len = fr.read(buffer);
        // System.out.println("字符数：" + len);
        //
        // String rs = new String(buffer);
        // System.out.println(rs);

        // 创建char数组接收读取到字符流编号
        char[] buffer = new char[1024];
        // 定义读取到
        int len;
        while ((len = fr.read(buffer)) != -1){
            System.out.print(new String(buffer, 0, len));
        }
    }
}
