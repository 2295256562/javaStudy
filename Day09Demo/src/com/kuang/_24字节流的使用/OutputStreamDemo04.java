package com.kuang._24字节流的使用;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 *   1.FileOutputStream文件字节输出流
 *      -- 作用：已内存为基准，把内存的数据，按照字节的形式写出到磁盘文件中
 *
 *      -- 构造器：
 *          public FileOutputStream(File file): 创建一个字节输出流管道通向目标文件对象。
 *          public FileOutputStream(String name): 创建一个字节输出流管道通向目标文件路径。
 *          public FileOutputStream(File file, boolean append): 创建一个追加数据的字节输出流管道通向目标文件对象。
 *          public FileOutputStream(String name, boolean append): 创建一个追加数据的字节输出流管道通向目标文件对象。
 *     -- 方法：
 *          public void write(int a):写一个字节出去。
 *          public void write(byte[] buffer):写一个字节数组出去。
 *          public void write(byte[] buffer, int pos, int len):写一个字节数组的一部分出去，
 *                          参数一：字节数组，参数二:起始字节索引位置，参数三：写多少个字节出去
 *     小结：
 *          字节输出流可以写字节数据到文件中去
 *          写一个字节，写一个字节数组，写一个字节数组的一部分出去
 *          管道用完需要关闭，数据要生效需要刷新，关闭包含刷新；刷新后可以继续使用流，关闭后不能继续使用流
 *          字节输出流默认是覆盖数据管道，启动管道写数据前会清空数据：
 *               FileOutputStream os = new FileOutputStream("Day09Demo/src/dlei02.txt");
 *          最佳数据管道，第二个参数是true即可！
 *               FileOutputStream os = new FileOutputStream("Day09Demo/src/dlei02.txt", true);
 */
public class OutputStreamDemo04 {
    public static void main(String[] args) throws Exception {
        // 简化写法：创建一个字节输出流管道与目标文件路径接通，默认是数据覆盖管道！！
        // 追加数据管道，第二个参数设置为ture
        FileOutputStream os = new FileOutputStream("Day09Demo/src/dlei02.txt", true);
        // 写数据出去
        os.write(97);
        os.write("\r\n".getBytes());

        // 写一个字节数组出去
        byte[] bytes = new byte[]{98,99,100,120};
        os.write(bytes);
        os.write("\r\n".getBytes());

        byte[] bytes1 = "java是最优美的语言".getBytes();
        os.write(bytes1);
        os.write("\r\n".getBytes());

        // 写一个字节数组的一部分出去
        byte[] bytes2 = "java是最优美的语言".getBytes();
        os.write(bytes2, 0, 19);
        os.write("\r\n".getBytes());


        os.flush();  // 立即刷新数据到文件中去，刷新后管道可以继续使用
        os.close();  // 关闭资源管道，关闭包含了刷新，关闭后管道不能使用了
    }
}
