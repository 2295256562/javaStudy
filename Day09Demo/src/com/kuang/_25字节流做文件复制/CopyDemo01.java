package com.kuang._25字节流做文件复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 字节流很适合做文件的复制
 */
public class CopyDemo01 {
    public static void main(String[] args) {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            // 创建一个字节输入流管道与源文件接通
            is = new FileInputStream("Day09Demo/src/dlei02.txt");
            // 创建一个字节输出流管道与目标文件接通
            os = new FileOutputStream("Day09Demo/src/copy.txt");

            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
