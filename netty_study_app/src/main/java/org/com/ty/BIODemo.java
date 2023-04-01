package org.com.ty;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description :
 * @Author : 田迎
 * @Date : 2023/4/1 15:24
 * @Version : 1.0.0
 **/
public class BIODemo {


    public static void main(String[] args) throws Exception{
        int serverPort = 80 ;
        ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("启动服务器。。");
        while (true){
            Socket socket = serverSocket.accept();
            byte[] buffer = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            inputStream.read(buffer);
            //BufferedWriter bufferedWriter = buildBufferedWriter(socket.getOutputStream());
        }
    }

}
