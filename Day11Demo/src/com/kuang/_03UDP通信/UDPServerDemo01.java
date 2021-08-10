package com.kuang._03UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author xinman.kuang
 * @date 2021/8/10 20:09
 */
public class UDPServerDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");

        // 1.创建一个接收客户端的数据包对象（集装箱）
        /**
         * public DatagramPacket(byte buf[], int length) {}：
         * 参数1：接收数据的数组
         * 参数2：接收数据的数组的长度
         */
        byte[] buffer = new byte[1024 * 6];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 2.创建一个接收端的码头对象
        DatagramSocket socket = new DatagramSocket(6666);

        // 3.开始接受
        socket.receive(packet);

        // 4.从集装箱中获取本次读取的数据
        int len = packet.getLength();

        // 5.输出数据
        String rs = new String(buffer, 0 , len);
        System.out.println(rs);

        // 6.服务端还可以获取发来信息的客户端的ip和端口
        String address = packet.getAddress().getHostAddress();
        int port = packet.getPort();
        System.out.println("客户端地址：" + address);
        System.out.println("客户端IP：" + port);
        socket.close();
    }
}
