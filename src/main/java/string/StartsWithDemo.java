package string;

/**
 * boolean startsWith(String str)
 * 判断字符串是否适宜给定的字符串开始的
 *
 * boolean endWith(String str)
 * 判断字符串是否适宜给定的字符串结尾的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";

        boolean starts = str.startsWith("www");
        System.out.println("stars:"+starts);

        boolean ends = str.endsWith(".com");
        System.out.println("ends:"+ends);
    }
}

