package com.kuang._07TCP通信方式四;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xinman.kuang
 * @date 2021/8/10 21:45
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);

        // 一个服务端只需要对应一个线程池
        HandlerSocketThreadPool handlerSocketThreadPool = new HandlerSocketThreadPool(5, 100);

        while (true){
            Socket socket = serverSocket.accept();
            System.out.println("有客户端上线");
            handlerSocketThreadPool.execute(new ReaderClientRunnable(socket));
        }

    }
}