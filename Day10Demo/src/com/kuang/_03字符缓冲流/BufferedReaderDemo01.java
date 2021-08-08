package com.kuang._03字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 *    字符缓冲输入流：BufferedReader
 *          -- 作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高字节输入流读数据的性能
 *    -- 构造器：public BufferedInputStream(InputStream in)
 *    -- 原理：缓冲字节输入流管道自带一个8kb缓冲池，每次可以直接借用操作系统的功能提取8kb的数据到缓冲池中去，以后我们直接从缓冲池读取数据，所以性能较好
 */
public class BufferedReaderDemo01 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("Day10Demo/src/dlei05.txt");

        // 吧低级的字符输入流包装成为一个高级的缓冲字符输入流
        BufferedReader bfr = new BufferedReader(fr);
        // 定义一个字符串变量存储每行数据
        String line;
        // 使用一个循环读取数据（经典代码）
        while ((line = bfr.readLine()) != null){
            System.out.println(line);
        }

        // char[] buffer = new char[1024];
        // int len;
        // while ((len = bfr.read(buffer)) != -1){
        //     System.out.println(new String(buffer, 0, len));
        // }
    }
}
