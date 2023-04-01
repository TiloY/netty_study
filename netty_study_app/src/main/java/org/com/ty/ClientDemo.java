package org.com.ty;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Description :
 * @Author : 田迎
 * @Date : 2023/4/1 14:45
 * @Version : 1.0.0
 **/
public class ClientDemo {

    public static void main(String[] args) throws Exception {
        int port = 80;
        Socket socket = new Socket();
        String remote_address = "localhost";
        InetSocketAddress inetSocketAddress = new InetSocketAddress(remote_address, port);
        socket.connect(inetSocketAddress);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        // doSomething
        inputStream.close();
        outputStream.close();
        socket.close();
    }
    /**
     * 两台计算机通信的原理
     *  1.  ip
     *  2.  port
     *  3.  网线中传输的是  二进制  需要双方定义交互数据的格式  所以就引入了 tpc/ip 协议栈
     *  ===》 TCP / IP
     *  -- 应用层  http
     *  -- 传输层  tcp(面向连接) udp(面向数据报文)   port 也在这一层
     *  -- 网络层  与操作系统相关 - ip 协议便在这一层
     *  -- 数据链路层： 与操作系统与网卡硬件设备相关 例如：ppp帧  以太网帧
     *  对于两台计算机的硬件 只是知道 网卡之间的通信  --  所以 MAC 地址  标识通信的唯一地址
     *
     *  socket 是什么 ？ ip + port 的组合
     */


}
