package week1;

import java.io.*;
import java.util.Scanner;

/**
 * @author weizhewu
 */
public class StudentDemo {
    public static void main(String[] args) {
        final int yes =1,no=2;
        System.out.println("序列化请选择输入1，反序列化请输入2");
        Scanner scanner = new Scanner(System.in);
        String name ="D:/java_test/student.txt";
        int a = scanner.nextInt();
        if (a==yes){
            Student student = new Student();
            student.setId("1802343317");
            student.setAge("18");
            student.setName("测试");
            System.out.println("name："+student.getName());
            System.out.println("age："+student.getAge());
            System.out.println("id："+student.getId());
            try {
                FileOutputStream outputStream = new FileOutputStream(name);
                ObjectOutputStream out = new ObjectOutputStream(outputStream);
                out.writeObject(student);
                out.close();
                outputStream.close();
                Thread.sleep(1000);
                System.out.println("序列化成功，被储存在"+name);
            } catch (Exception e) {
                System.out.println("序列化失败");
            }
        }
        if (a==no){
            System.out.println("路径为:"+name+"的反序列化结果为：");
            try {
                FileInputStream inputStream = new FileInputStream(name);
                ObjectInputStream in = new ObjectInputStream(inputStream);
                Student student = (Student) in.readObject();
                Thread.sleep(1000);
                System.out.println("name："+student.getName());
                System.out.println("age："+student.getAge());
                System.out.println("id："+student.getId());
                in.close();
                inputStream.close();
            } catch (Exception e) {
                System.out.println("反序列化失败");
            }
        }
        if (a!=yes&&a!=no){
            System.out.println("输入无效");
        }
    }

}
