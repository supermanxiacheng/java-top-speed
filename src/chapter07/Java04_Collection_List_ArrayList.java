package chapter07;

import java.util.ArrayList;

public class Java04_Collection_List_ArrayList {
    public static void main(String[] args) {

        // TODO 集合 - Collection - List
        // ArrayList的常用方法
        ArrayList list = new ArrayList();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhangsan");
        list.add("zhangsan");

        // add方法可以传递2个参数的，第一个参数表示数据增加的位置（索引），第二个参数表示数据
        //list.add(1, "zhaoliu");

        ArrayList otherList = new ArrayList();
        otherList.add("1");
        otherList.add("2");
        otherList.add("3");
        //list.addAll( otherList );

        // size方法表示集合内部数据的数量
        //System.out.println(list.size());
        // 清空集合中的数据
        //list.clear();
        // 删除指定集合中的数据
        //list.removeAll(otherList);
        // 判断集合中的数据是否为空
        //System.out.println(list.isEmpty());

        // 用于判断集合中是否存在某条数据，返回布尔类型的值
        //System.out.println(list.contains("zhangsan123"));
        // 用于获取数据在索引中的第一个位置，如果数据不存在，那么返回-1
        //System.out.println(list.indexOf("zhangsan123"));
        System.out.println(list.indexOf("zhangsan"));
        System.out.println(list.lastIndexOf("zhangsan"));

        Object[] objects = list.toArray();

        // 复制新集合
        Object clone = list.clone();
        ArrayList list1 = (ArrayList)clone;

        System.out.println(list);
        System.out.println(list1);


    }
}
