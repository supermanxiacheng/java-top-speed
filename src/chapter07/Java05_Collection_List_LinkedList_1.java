package chapter07;

import java.util.LinkedList;

public class Java05_Collection_List_LinkedList_1 {
    public static void main(String[] args) {

        // TODO 集合 - Collection - List
        // LinkedList : Linked(连接) + List
        // 构建集合对象
        LinkedList list = new LinkedList();

        // 追加数据
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

//        // 想指定的位置增加数据
//        list.add(1, "zhaoliu");
//        list.addFirst("1");
//        list.addLast("2");
//
//        LinkedList list1 = new LinkedList();
//        list1.add("zhangsan1");
//        list1.add("lisi2");
//        list1.add("wangwu3");
//        list.addAll(list1);

//        System.out.println(list.remove("1"));
//        System.out.println(list.remove()); // 删除第一个
//        list.removeFirst();
//        list.removeLast();
//        list.remove(1);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        list.clear();
//        list.contains("1");
//        list.element(); // 获取第一个数据
//        list.indexOf("");
//        list.lastIndexOf("");
        list.push("aaa"); // 添加数据
        System.out.println(list.pop()); // 弹出数据

        System.out.println(list);



    }
}
