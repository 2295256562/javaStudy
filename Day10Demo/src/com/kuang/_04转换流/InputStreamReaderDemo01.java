package com.kuang._04转换流;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 字节输入流转换为字符输入流 InputStreamReader
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.提取GBK文件的原始字节流
        FileInputStream is = new FileInputStream("Day10Demo01/src/dlei07.txt");
        // 2.把原始字节输入流通过转换流，转换成字符输入流 InputStreamReader
        InputStreamReader isr = new InputStreamReader(is, "GBK");
        // 3.包装成缓冲流
        BufferedReader br = new BufferedReader(isr);
        // 4.定义一个字符串变量存储每行数据
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
