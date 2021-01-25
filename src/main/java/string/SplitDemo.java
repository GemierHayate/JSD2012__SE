package string;

import com.sun.scenario.animation.shared.ClipEnvelope;

/**
 * String支持政策表达式方法之二：
 *
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以
 * 一个String数组形式返回
 *
 * 删掉你限定的部分 其他部分即为所得
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "ass231asd321wjs345kuc";

        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }

        str = "nau,lci,ooas";

        arr = str.split(",");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        /*
           当遇到连续出现可拆分项时，中间会拆分出一个空字符串。
           如果字符串最开始就是可拆分项，则拆分后的第一项是空字符串

           注意：如果字符串末尾连续出现可拆分项，所有拆分出来的空字符串会被忽略！
         */
        str = ",231,,,412,65342,,,,,";
        //
        arr = str.split(",");
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
