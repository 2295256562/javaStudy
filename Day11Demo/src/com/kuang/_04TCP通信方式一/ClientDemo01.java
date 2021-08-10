package com.kuang._04TCP通信方式一;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author xinman.kuang
 * @date 2021/8/10 20:21
 *
 *  目标：TCP可靠传输通信入门案例（非常重要）
 *
 *  TCP/Ip协议 ===> Transfer control Protocol ===> 传输控制协议
 *
 *  TCP/IP协议的特点
 *      * 面向连接的协议
 *      * 只能由客户端主动发送数据给服务器端，服务器端接收数据之后，可以给客户端响应数据。
 *      * 通过三次握手建立连接，连接成功形成数据传输通道
 *      * 通过四次挥手断开连接
 *      * 基于IO流进行数据传输
 *      * 传输数据大小没有限制
 *      * 因为面向连接的协议，速度慢，但是是可靠的协议
 *
 *
 *  TCP协议相关的类
 *      * Socket：一个该类的对象就代表一个客户端程序
 *      * ServerSocket：一个该类的对象就代表一个服务器程序
 *
 *  Socket类构造方法：
 *      * socket(String host, int port)
 *      *
 */
public class ClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.客户端要请求与服务端的socket管道连接
        Socket socket = new Socket("127.0.0.1", 6666);
        // 2.从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();
        // 3.把低级的字节输出流包装成高级的打印流
        PrintStream ps = new PrintStream(os);
        ps.println("我是客户端，喜欢学java");
        ps.flush();
        System.out.println("客户端发送完毕~~~~");
    }
}
