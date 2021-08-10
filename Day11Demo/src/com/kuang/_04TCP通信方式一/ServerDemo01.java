package com.kuang._04TCP通信方式一;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xinman.kuang
 * @date 2021/8/10 20:38
 *
 * ServerSocket类：
 *      构造器： public ServerSocket(int port)
 *      方法：public Socket accept()：等待接收一个客户端的socket
 */
public class ServerDemo01 {
    public static void main(String[] args) throws IOException {
        // 1. 注册端口
        ServerSocket server = new ServerSocket(6666);
        // 2.开始接受客户端的socket管道
        Socket socket = server.accept();
        // 3从socket通信管道中得到一个字节输入流
        InputStream is = socket.getInputStream();
        // 4.将字节输入流包装成为字符输入流
        InputStreamReader isr = new InputStreamReader(is);
        // 5.将字符输入流包装成为字符缓冲输入流
        BufferedReader br = new BufferedReader(isr);
        // 6.按照行读取消息
        String msg;
        while ((msg = br.readLine()) != null){
            System.out.println("服务端收到：" + socket.getRemoteSocketAddress() + msg);
        }
    }
}
