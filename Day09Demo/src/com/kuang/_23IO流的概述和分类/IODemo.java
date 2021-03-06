package com.kuang._23IO流的概述和分类;

/**
 *    目标：IO流读写数据
 *
 *    IO输入输出流：输入/输出流
 *          Input：输入
 *          Output：输出
 *
 *    引入：
 *      File类只能操作文件对象本身，不能读写文件对象的内容
 *      读写数据内容，应该使用IO流
 *
 *    IO流的分类：
 *      按照流的方向分为：输入流、输出流
 *          1.输出流：以内存为基准，把内存中的数据写出到磁盘文件或者网络介质中去的流称为输出流
 *                  输出流的作用：写数据到文件，或者写数据发送给别人
 *          2.输入流：以内存为基准，把磁盘文件中的数据或者网络中的数据写入到内存中去的流称为输入流。
 *                  输入流的作用：读取数据到内存
 *
 *    按照流的内容分为：字节流，字符流
 *          1.字节流：流中的数据最小单位是一个一个的字节，这个流就是字节流
 *          2.字符流：流中的数据的最小单位是一个一个的字符，这个流就是字符流
 *
 *   小结：
 *      IO流是读写传输数据的
 */
public class IODemo {
}
