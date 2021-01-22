package string;

/**
 * static String valueOf(XXX xxx)
 * String提供了一组重载的静态方法：valueOf,作用是讲java中其他类型转换为String
 * 最常使用
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int i = 123;
        String str =String.valueOf(i);
        System.out.println(str);

        double dou = 123.456;
        String str2=String.valueOf(dou);
        System.out.println(str2);

        String s3 = i+"";//任何内容与字符串连接结果都是字符串
        System.out.println(s3);

    }
}
