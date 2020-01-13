package week1;

import java.io.*;
import java.util.Random;

/**
 * @author zw_w
 */
public class RandomText {
    public static void main(String[] args) throws Exception {
        final int number = 100;
        Random random = new Random();
        String[] text = new String[100];
        int content;
        for (int i = 0;i<number;i++){
            content = random.nextInt(number);
            text[i] = "第一个数为："+ content+"\n";
        }
        File file = new File("D:/java_test/randomText.txt");
        try {
            if (!file.exists()){
                boolean exist = file.createNewFile();
                if (exist){
                    System.out.println("自动创建该文件！");
                }
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : text) {
                bufferedWriter.write(s);
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e){
            System.out.println("写入失败");
        }


    }
}
