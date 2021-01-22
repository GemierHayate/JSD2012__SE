package string;

import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.bcel.internal.generic.ISUB;

public class Test {
    public static void main(String[] args) {
                                     //01234567890
        String s1= getHostName("www.tedu.cn");
        String s2= getHostName("http://www.tarena.com");
        String s3= getHostName("doc.canglaoshi.com.cn");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static String getHostName(String address){
        int start= address.indexOf(".");
        int  end = address.indexOf(".",start+=1);
        String k=address.substring(start,end);
        return k;
    }
}

