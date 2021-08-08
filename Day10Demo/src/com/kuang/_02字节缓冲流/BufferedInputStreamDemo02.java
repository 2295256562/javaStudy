package com.kuang._02字节缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class BufferedInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个原始的字节输出流
        FileOutputStream os = new FileOutputStream("Day10Demo/src/dlei04.txt");
        // 2.把低级的字节输出流包装成一个高级的缓冲字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(os);

        bos.write('a');
        bos.write(100);
        bos.write('b');
        bos.write("我爱中国".getBytes(StandardCharsets.UTF_8));

        bos.close();
    }
}
