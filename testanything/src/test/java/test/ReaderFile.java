package test;

import accesoty.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
    public static void main(String[] args) {
        String path="src/main/java/accesoty/Student.txt";
     //   String path ="classpath:/accesoty/Student.txt";
        FileReader fr;

        {
            try {
                fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                String line;
                //网友推荐更加简洁的写法
                try {
                    Student st=new Student();
                    String []a=new String[3];
                    while ((line = br.readLine()) != null) {
                        // 一次读入一行数据
                        a=line.split(" ");
                        st.setName(a[0]);
                        st.setClassname(a[1]);
                        st.setFenshu(a[2]);
                        System.out.println(st);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
