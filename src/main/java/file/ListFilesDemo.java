package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取挡圈目录中的所有子项并输出

        File dir = new File(".");
        /*
        boolean isFile()
        判断当前File标识的是否为一个文件

        Boolean isDirectory（）
        判断当前File表示的是否为一个目录
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for(int i = 0;i<subs.length;i++){
                System.out.println(subs[i]);
            }
        }





    }
}
