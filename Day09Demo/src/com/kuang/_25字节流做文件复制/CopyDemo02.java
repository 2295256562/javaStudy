package com.kuang._25字节流做文件复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 目标：JDK 1.7开始之后释放资源新方式
 *
 * try-with-resources:
 *      try(
 *          // 这里只能放置资源对象，用完会自动调用close()关闭
 *      ){
 *
 *      }catch(Exception e){
 *          e.printStackTrace();
 *      }
 *
 * 什么是资源：
 *      资源类一定是实现了Closeable接口，实现这个接口的类就是资源
 *      有close()方法：try-with-resources会自动调用它的close()关闭资源
 */
public class CopyDemo02 {
    public static void main(String[] args) {
        try (
                // 创建一个字节输入流管道与源文件接通
                FileInputStream is = new FileInputStream("Day09Demo/src/dlei02.txt");
                // 创建一个字节输出流管道与目标文件接通
                FileOutputStream os = new FileOutputStream("Day09Demo/src/copy.txt");
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
