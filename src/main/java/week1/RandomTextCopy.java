package week1;

import java.io.*;
import java.util.UUID;

/**
 * @author zw_w
 */
public class RandomTextCopy {
    public static void main(String[] args) {
       try {
           //指定源文件
           File startFile = new File("D:/java_test/randomText.txt");
           String startFileName = startFile.getName();
           int position = startFileName.indexOf(".");
           //取得文件扩展名
           String suffixName = startFileName.substring(position+1);
           //新的文件名
           String endName = UUID.randomUUID().toString();
           //指定文件复制到的路径
           File endFile = new File("D:/java_test/"+endName+"."+suffixName);
           byte[] bytes = new byte[(int) startFile.length()];
           //字节输入流
           InputStream a  = new FileInputStream(startFile);
           int write = a.read(bytes);
           a.close();
           //字节输出流
           OutputStream b = new FileOutputStream(endFile);
           b.write(bytes);
           b.close();
           System.out.println("复制成功");
       } catch (IOException e){
           System.out.println("复制失败");
       }
    }

}
