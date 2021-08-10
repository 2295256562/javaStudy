package com.kuang._07TCP通信方式四;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author xinman.kuang
 * @date 2021/8/10 22:05
 */
public class ReaderClientRunnable implements Runnable{
    private Socket socket;

    public ReaderClientRunnable(Socket socket) {
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
