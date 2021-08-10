package com.kuang._03UDP通信;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author xinman.kuang
 * @date 2021/8/10 19:47
 *
 *
 *    UDP协议的特点
 *      * 面向无连接的协议
 *      * 发送端只管发送，不确认对象是否能接收
 *      * 基于数据包进行数据传输
 *      * 发送数据的包的大小限制64kb以内
 *      * 因为面向无连接，速度快，但是不可靠。会丢失数据
 *
 *    UDP协议的使用场景
 *      * 在线视频
 *      * 网络语音电话
 *
 *    UDP协议相关的两个类
 *      * DatagramPacket
 *          * 数据包对象
 *          * 作用：用来封装要发送或者接收的数据，比如集装箱
 *      * DatagramSocket
 *          * 发送对象
 *          * 作用：用来发送或者接收数据包，比如：码头
 *
 *    DatagramPacket类构造器
 *      发送端用：
 *          new
 */
public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端启动成功");
        // 1.创建一个集装箱对象，用于封装需要发送的数据包

        /**
         * public DatagramPacket(byte buf[], int offset, int length,InetAddress address, int port) {}
         * 参数一：封装数据的字节数组
         * 参数二：发送数据的长度
         * 参数三：服务端的IP地址
         * 参数四：服务端程序的端口号码
         */
        byte[] buffer = "今晚学习了吗？".getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 6666);

        // 创建一个码头对象
        // 参数可以申明客户端端口，可以有也可以没有，默认会给一个端口
        DatagramSocket socket = new DatagramSocket();

        // 开始发送数据包对象
        socket.send(datagramPacket);

        socket.close();

    }
}
