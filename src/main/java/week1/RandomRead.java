package week1;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * 使用随机读写流RandomAccessFile类，实现对长文本文件的随机读写
 * @author  weizhewu
 */
public class RandomRead {
    public static void main(String[] args) {
        String path = "E:/QQ文件下载/MobileFile/data.txt";
        int point = 0;
        RandomAccessFile raf;

        {
            try {
                raf = new RandomAccessFile(path,"r");
                //获取RandomAccessFile对象文件指针的位置，初始位置是0
                System.out.println("RandomAccessFile文件指针的初始位置:"+raf.getFilePointer());
                //移动文件指针位置
                raf.seek(point);
                byte[] buff = new byte[1024];
                //用于保存实际读取的字节数
                int hasRead = 0;
                //循环读取
                while ((hasRead=raf.read(buff))>0){
                    System.out.println(new String(buff,0,hasRead));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}