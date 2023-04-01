package org.com.ty;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description :
 * @Author : 田迎
 * @Date : 2023/4/1 14:52
 * @Version : 1.0.0
 **/
public class ServerDemo {

    public static void main(String[] args) throws Exception {
        int serverPort = 80;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("服务器已经启动...");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        Socket socket = null;
        while (true) {
            socket = serverSocket.accept();// 发生线程阻塞 接受客户端请求
            System.out.println("收到client 的请求 .... "+ socket);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        }
    }
}
