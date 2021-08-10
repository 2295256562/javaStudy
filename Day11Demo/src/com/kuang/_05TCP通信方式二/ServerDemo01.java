package com.kuang._05TCP通信方式二;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xinman.kuang
 * @date 2021/8/10 21:11
 */
public class ServerDemo01 {
    public static void main(String[] args) throws IOException {
        System.out.println("启动客户端");
        // 1.创建socket服务器,并设置服务器端口
        ServerSocket serve = new ServerSocket(6666);
        // 2.接收客户端连接
        Socket socket = serve.accept();
        // 3.获取socket输入流管道
        InputStream is = socket.getInputStream();

        // 4.把字节输入流通过转换流转换为字符流，再包装成成为缓冲字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String msg;
        while ((msg = br.readLine()) != null){
            System.out.println(msg);
        }
    }
}
