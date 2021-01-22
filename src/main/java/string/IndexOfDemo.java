package string;

/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串的位置，如果当前字符串不包含给定内容则返回值为—1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";
        int index= str.indexOf("in");//检索str中第一次出现in的位置
        System.out.println(index);//2

        index = str.indexOf("in",2);//从下表2开始寻找第一次出现in的位置
        System.out.println(index);//2
        index = str.indexOf("in",6);//从下表6开始讯号第一次出现in的位置
        System.out.println(index);//9

        index =str.lastIndexOf("a");
        System.out.println(index);
    }
}
