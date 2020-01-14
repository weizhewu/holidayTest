package week1;

import java.io.*;
import java.util.UUID;

/**
 * @author zw_w
 */
public class RandomTextCopy {
    public static void main(String[] args) {
        final String choose = "txt";
        //要复制文件的路径
        File startFile = new File("D:/java_test/1.png");
        //这个取出来的就是1.png
        String startFileName = startFile.getName();
        //取出来文件路径
        String start = startFile.getPath();
        //得到.的位置
        int position = startFileName.indexOf(".");
        //取得文件扩展名
        String suffixName = startFileName.substring(position+1);
        try {
            if (suffixName.equals(choose)){
                BufferedReader br = new BufferedReader(new FileReader(start));
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:/java_test/randomTextCopy2"+"."+suffixName));
                String line;
                while ((line = br.readLine())!=null){
                    bw.write(line);
                }
                bw.close();
                br.close();
            } else{
                BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(start));
                BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream("D:/java_test/6"+"."+suffixName));
                int len;
                while ((len = fileInputStream.read())!=-1){
                    fileOutputStream.write(len);
                }
                fileOutputStream.close();
                fileInputStream.close();
            }
            System.out.println("拷贝成功");
        } catch (IOException e){
            System.out.println("拷贝失败");
        }
    }

}
