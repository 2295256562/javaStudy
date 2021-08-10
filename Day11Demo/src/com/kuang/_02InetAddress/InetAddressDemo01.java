package com.kuang._02InetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xinman.kuang
 * @date 2021/8/10 19:33
 *
 *
 *  目标：InetAddress类概述：一个该类的对象就代表一个IP地址对象
 *
 *  InetAddress类成员方法：
 *      static InetAddress getLocalHost()：获取本机主机ip地址对象
 *      static InetAddress getByName(String name)：根据ip地址字符串或主机名获得对应的ip地址对象
 *      String getHostName()：获取主机名
 *      String getHostAddress()：获取ip地址字符串
 */
public class InetAddressDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.获取本机地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        // 2.获取局域网ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        // 3.获取公网ip对象
        InetAddress ip3 = InetAddress.getByName("180.101.49.12");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());


        // 4.判断是否能通：ping
        System.out.println(ip2.isReachable(5000));
    }
}
