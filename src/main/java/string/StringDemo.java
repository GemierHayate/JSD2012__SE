package string;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间 用于缓存所有使用字面量形式
 * 创建的字符串对象，当再次使用相同字面量创建字符串是会直接重用常量池中的对象而不会再次
 * 创建新对象减少内存开销。
 *
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "aakis";
        System.out.println("s1:"+s1);

        String s2= "aakis";
        System.out.println("s2:"+s2);

        System.out.println(s1==s2);//s1==s2为true，说明保存地址一样 使用同一个对象

        String s3=new String("aakis");
        System.out.println("s3:"+s3);
        System.out.println(s2==s3);//s2==s3为false new为强制，一定创建新对象

        //比较字符串内容用equals！
        System.out.println(s2.equals(s3));//true  比较的是字符串对象的内容是否相同 常用equals

        s1+="!";
        System.out.println(s1);
        System.out.println(s1==s2);
        /*
        编译器特性：
        当编译器在编译一段代码是发现一个计算表达式可以在编译期间确定结果时就会进行计算，
        并将结果编译到class文件中。这样一来虚拟机运行该程序时就不必每次都进行计算了。
        下面代码会被编译器改为：
        String s4=”aakis“
         */
        String s4="aa"+"kis";
        System.out.println("s4:"+s4);
        System.out.println(s4==s1);

        String s="aa";
        String s5=s+"kis";
        System.out.println("s5:"+s5);
        System.out.println(s5==s1);



    }







}
