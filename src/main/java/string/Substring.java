package string;

/**
 * String substring(int start,int end)
 * 截取指定范围内的字符串，两个参数分别是范围对应的下标‘
 * 注：在JAVA APQ中通常使用两个数字表示范围时都是"含头不含尾“的
 */
public class Substring {
    public static void main(String[] args) {

        String  a= "jsss1.top";
        String sub=a.substring(2,5);
        System.out.println(sub);

        sub=a.substring(3);
        System.out.println(sub);
    }
}
