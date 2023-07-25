package chapter08;

import java.io.*;

public class Java07_IO_Object {
    public static void main(String[] args){

        // TODO Java IO - 文件复制 - 序列化 & 反序列化

        // TODO 数据文件对象
        File dataFile = new File("D:\\idea2022\\java-top-speed\\data\\obj.dat");

        // TODO 对象输出流（管道对象）
        ObjectOutputStream objectOut = null;
        FileOutputStream out = null;

        // TODO 对象输入流
        ObjectInputStream objectIn = null;
        FileInputStream in = null;
        try {
//            out = new FileOutputStream(dataFile);
//            objectOut = new ObjectOutputStream(out);

            // Java中只有增加了特殊的标记的类，才能再写文件中时进行序列化操作
            // 这里的标记其实就是一个接口
//            User user = new User();
//            objectOut.writeObject(user);
//            objectOut.flush();

            // TODO 从文件中读取数据转换成对象
            in = new FileInputStream(dataFile);
            objectIn = new ObjectInputStream(in);
            Object o = objectIn.readObject();
            System.out.println(o);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if ( objectOut != null ) {
                try {
                    objectOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
class User implements Serializable{

}