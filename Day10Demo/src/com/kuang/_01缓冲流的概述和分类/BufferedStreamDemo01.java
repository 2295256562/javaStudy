package com.kuang._01缓冲流的概述和分类;

/**
 *     缓冲流的概述和分类
 *
 *                  字节流                                                                 字符流
 *   字节输入流                  字节输出流                                   字符输入流                  字符输出流
 *   InputStream                 OutputStream                                Reader                     Writer
 *   FileInputStream             FileOutputStream                            FileReader                 FileWriter
 *   BufferedInputStream         BufferedOutputStream                        BufferedReader             BufferedWriter
 *
 *
 *   什么是缓冲流：缓冲流可以提升字节流和字符流的读写数据的性能
 *   缓冲流分为四类：
 *         1.BufferedInputStream：字节缓冲输入流，可以提升字节输入流读数据的性能
 *         2.BufferedOutputStream：字节缓冲输出流，可以提升字节输出流写数据的性能
 *         3.BufferedReader：字符缓冲输入流，可以提升字符输入流读数据的性能
 *         4.BufferedWriter：字符缓冲输出流，可以提升字符输出流写数据的性能
 */
public class BufferedStreamDemo01 {
}
