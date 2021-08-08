package com.kuang._00字符流的使用;

import java.io.FileWriter;

/**
 *  字符输出流可以写字符数据出去，总共有5个方法写字符
 *
 *  覆盖管道：
 *     FileWriter fw = new FileWriter("Day10Demo/src/dlei03.txt");
 *  追加管道：
 *     FileWriter fw = new FileWriter("Day10Demo/src/dlei03.txt", true);
 */
public class FileWriterDemo03 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个字符输出流管道通向文件路径
        FileWriter fw = new FileWriter("Day10Demo/src/dlei03.txt", true);

        // 2.写一个字符出去
        fw.write(97);
        fw.write('b');
        fw.write('雷');
        fw.write("\r\n");

        // 3.写一个字符串
        fw.write("java是最优美的语言！");
        fw.write("\r\n");

        // 4.写一个字符数组出去
        fw.write("我爱中国".toCharArray());
        fw.write("\r\n");

        // 5.写字符串的一部分
        fw.write("java是最优美的语言", 0, 4);
        fw.write("\r\n");

        fw.close();
    }
}
