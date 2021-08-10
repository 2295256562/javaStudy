package com.kuang._05TCP通信方式二;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author xinman.kuang
 * @date 2021/8/10 21:05
 *
 *      目前存在的问题：
 *          目前服务端只能接收一个客户端
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.创建socket对象，搭建socket管道
        Socket socket = new Socket("127.0.0.1", 6666);
        // 2.获取socket字节输出流管道，用于与服务器通信
        OutputStream os = socket.getOutputStream();
        // 3.将字节输入流管道变为打印流管道
        PrintStream ps = new PrintStream(os);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入：");
            ps.println(sc.nextLine());
        }
    }
}
