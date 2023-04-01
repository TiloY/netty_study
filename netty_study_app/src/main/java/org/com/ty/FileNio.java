package org.com.ty;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Description :
 * @Author : 田迎
 * @Date : 2023/4/1 15:37
 * @Version : 1.0.0
 **/
public class FileNio {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File("file path"));
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer readerBuffer = ByteBuffer.allocate(1); // 读缓冲区
        ByteBuffer writerBuffer = ByteBuffer.wrap("1".getBytes());// 写缓冲区
        channel.read(readerBuffer);
        channel.write(writerBuffer);
    }
    /**
     * nio 适合的场景:
     * --
     * --
     * -- 
     */
}
