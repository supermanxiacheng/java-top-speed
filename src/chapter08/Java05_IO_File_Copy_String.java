package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Java05_IO_File_Copy_String {
    public static void main(String[] args){

        // TODO Java IO - 文件复制 - 字符串

        // TODO 数据源文件对象
        File srcFile = new File("D:\\idea2022\\java-top-speed\\data\\word.txt");
        // TODO 数据目的地文件对象(自动生成)
        File destFilt = new File("D:\\idea2022\\java-top-speed\\data\\word.txt.copy");

        // TODO 文件输入流（管道对象）
        FileInputStream in = null;
        // TODO 文件输出流（管道对象）
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFilt);

            // TODO 打开阀门，流转数据（输入）
            //
            int data = -1;

            StringBuilder ss = new StringBuilder();

            while ( (data = in.read()) != -1 ) {
                //System.out.println(data + 1);
                //out.write(data + 1);
                ss.append((char)data);
            }

            ss.append(" zhangsan");
            System.out.println(ss);
            // 可以讲字符串转换成字节数组，再讲数组中的每一个字节写入到文件中

            // Unicode编码
            // byte => -128 ~ 127
            // asc => 0 ~ 127

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if ( in != null ) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if ( out != null ) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
