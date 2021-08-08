package com.kuang._24字节流的使用;

import java.io.File;
import java.io.FileInputStream;

/**
 *  public int read(byte[] buffer):从字节输入流中读取字节到字节数组中去，返回读取的字节数量，没有字节可读返回-1
 *
 *  小结：
 *      使用字节数组读取内容，效率可以
 *      但是使用字节数组读取文本内容输出，也无法避免中文读取输出乱码问题
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个字符输入流管道与源文件接通
        FileInputStream stream = new FileInputStream("Day09Demo/src/dlei01.txt");
        // 2.定义一个字节数组读取数据（定义一个桶）
        // byte[] buffer = new byte[3];
        // // 3.从Stream管道中读取字节装入到字节数组中去，返回读取字节数据
        // int len = stream.read(buffer);
        // System.out.println("读取了字节数：" + len);
        // // 读取了多少就倒出多少
        // String rs = new String(buffer, 0, len);
        // System.out.println(rs);

        // 读法优化，必须使用循环
        // 1.定义一个字节数组代表桶
        byte[] buffer = new byte[3];
        int len;
        while ((len = stream.read(buffer)) != -1){
            String s = new String(buffer, 0, len);
            System.out.print(s);
        }
    }
}
