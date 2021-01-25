package string;

/**
 * String支持正则表达式的方法之三
 *
 * String replaceAllDemo(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 */
public class replaceAllDemo {
    public static void main(String[] args) {
        String str ="asjh1234jkasjkd412jajkdhk213123";
        //将字符串中的数字部分替换为“#NUMBER#"
        str =str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(str);
        str=str.replaceAll("[a-z]+","#AKAMI#");
       System.out.println(str);

       //和谐用语
       String regex= "(wqnmlgb|dsb|mdzz|cnm|nmsl|nc|nt|fk|djb|wcnm)";
       String message="cnm!nmsl，wqnmlgb的！";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
