package com.kuang._06TCP通信方式三;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xinman.kuang
 * @date 2021/8/10 21:45
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);

        while (true){
            Socket socket = serverSocket.accept();
            System.out.println("有客户端上线");
            new ServerThread(socket).start();
        }

    }
}

class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
