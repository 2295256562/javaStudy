package com.kuang._03字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *   字符缓冲输出流：BufferedWriter
 *       -- 作用：把字符输出流包装成一个高级的缓冲字符输出流，提高写字符数据的性能
 *       -- 构造器：public BufferedWriter(Writer writer)
 *       -- 原理：高级的字符缓冲输出流多了一个8k的字符缓冲池，写数据性能极大提高了！
 *       -- 字符缓冲输出流除了提高字符输出流写数据的性能，还多了一个换行的特有功能：
 *            public void newLine()：新建一行
 */
public class BufferedWriterDemo02 {
    public static void main(String[] args) throws Exception {
        // 创建一个低级的字符写入流管道
        Writer fw = new FileWriter("Day10Demo/src/dlei06.txt");
        // 提升低级字符写入流管道为字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("我爱中国");
        bw.newLine();
        bw.newLine();
        bw.write(97);
        bw.close();
    }
}
