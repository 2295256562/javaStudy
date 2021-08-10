package com.kuang._07TCP通信方式四;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author xinman.kuang
 * @date 2021/8/10 21:45
 *
 *  使用多线程处理多个客户端连接问题
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 6666);

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("请说：");
            ps.println(sc.nextLine());
            ps.flush();
        }
    }
}
