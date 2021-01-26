package raf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
        复制原理：从原文件中顺序读取每一个字节并写入到另一个文件中
         */
        RandomAccessFile scr
                 = new RandomAccessFile("./hay.jpg","r");
        RandomAccessFile desc
                 = new RandomAccessFile("./hey_cp.jpg","rw");
        /*

         */
        //用来记录每次读到的字节
        int d=-1;
        long start = System.currentTimeMillis();
        while((d=scr.read())!=-1){
            desc.write(d);
        }
        long end =System.currentTimeMillis();
        System.out.println("复制完毕"+(end-start));

        scr.close();
        desc.close();
    }

}
