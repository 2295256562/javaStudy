package com.kuang._02字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *    字节缓冲输入流：BufferedInputStream
 *          -- 作用：可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高字节输入流读数据的性能
 *    -- 构造器：public BufferedInputStream(InputStream in)
 *    -- 原理：缓冲字节输入流管道自带一个8kb缓冲池，每次可以直接借用操作系统的功能提取8kb的数据到缓冲池中去，以后我们直接从缓冲池读取数据，所以性能较好
 */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        InputStream fs = new FileInputStream("Day10Demo/src/dlei01.txt");

        BufferedInputStream bis = new BufferedInputStream(fs);

        byte[] bytes = new byte[3];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes, 0, len));
        }
    }
}
