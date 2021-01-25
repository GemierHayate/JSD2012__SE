package string;

/**
 * String的优化导致其为不变对象，这会存在利于重用但是不利于修改操作
 * 频繁修改String会降低性能并有较多的系统开销
 *
 * java.lang.StringBuilder是专门设计用来修改String的API，其内部维护一个
 * 可变的char数组，并提供可多种修改字符串内容的 方法，例如：增删改插，和
 * String原有的相关方法：indexOf，length等等
 * StringBuilder修改String内容速度快，开销小
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str ="好好学习java";

        //内部表示空字符串
        //StringBuilder builder = new StringBuilder();

        //基于给定的字符串内容进行修改
        //StringBuilder builder = new StringBuilder(str);
        //StringBuilder builder非线程安全 StringBuffer线程安全
        StringBuffer builder= new StringBuffer(str);

        /*
        好好学习java
        好好学习java，为了找个好工作！
        append:将给定内容追加到字符串末尾
         */
        builder.append(",就是为了找个好工作！");
        str = builder.toString();
        System.out.println(str);

        /*
        好好学习java，就是为了找个好工作！
        好好学习java，就是为了改变世界！
        replace：替换当前字符串的部分内容为制定的内容（含头不含尾）
         */
        builder.replace(13,18,"改变世界");
        // System.out.println(builder.toString());
        //直接输出builder也是输出toString范湖的字符
        System.out.println(builder);


        /*
        好好学习java，就是为了改变世界！
        ，就是为了改变世界！
        delete：删除当前字符串中的部分内容

         */
        builder.delete(0,8);
        System.out.println(builder);

        /*
        ，就是为了改变世界！
        活着，就是为了改变世界！
        insert:将给定内容插入到指定位置
         */
        builder.insert(0,"活着");
        System.out.println(builder);


        //反转
        builder.reverse();
        System.out.println(builder);




    }
}