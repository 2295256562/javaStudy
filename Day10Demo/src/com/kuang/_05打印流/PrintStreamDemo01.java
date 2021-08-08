package com.kuang._05打印流;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *   目标：打印流PrintStream / PrintWriter
 *
 *  打印流的作用：
 *      1.可以方便，快速的写数据出去
 *      2.可以实现打印啥出去，就是啥出去
 *  打印流的构造器：
 *      public PrintStream(OutputStream os);
 *      public PrintStream(String filePath);
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        // ByteArrayOutputStream baoStream = new ByteArrayOutputStream();
        // PrintStream stream = new PrintStream(baoStream);
        // PrintStream oldStream = System.out;
        // System.setOut(stream);
        // System.out.println(111);
        // String message = baoStream.toString();
        // System.setOut(oldStream);
        // System.out.println(message);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(System.getProperties().get("os.name"));
        System.out.println(System.getProperties().getProperty("java.specification.version"));
        System.out.println(System.getProperties().getProperty("user.name"));
        System.out.println(System.getProperties());
    }
}
