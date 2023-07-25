package chapter07;

import java.util.*;

public class Java13_Collection_Exception {
    public static void main(String[] args) throws Exception  {

        // TODO 集合 - Exception
        // 容量 ：不能小于0
        ArrayList list = new ArrayList(10);
        list.add("a");
        list.add("b");
        list.add("c");

        // 如果访问的集合是数组，那么索引范围就是0 到数组长度-1
        // 如果访问的集合是List，那么索引范围就是0 到数据长度-1
//        System.out.println(list.get(3));

        // NoSuchElementException
//        LinkedList list1 = new LinkedList();
//        list1.add("a");
//        System.out.println(list1.getFirst());

        // HashMap一旦循环遍历时，那么如果修改数据，就会发生错误
        HashMap map = new HashMap();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        for (Object o : map.keySet()) {
            if ( "b".equals(o) ) {
                map.put("d", "4");
            }
            System.out.println(map.get(o));
        }

    }
}
