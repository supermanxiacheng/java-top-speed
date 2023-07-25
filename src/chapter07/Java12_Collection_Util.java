package chapter07;

import java.util.Arrays;
import java.util.List;

public class Java12_Collection_Util {
    public static void main(String[] args) throws Exception  {

        // TODO 集合 - Arrays
        int[] is = {3,5,2,1,4};
        int[] is1 = {1,2,3,4,5};
        int[] is2 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(is));
        System.out.println(is);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        // 排序(默认为升序)
        Arrays.sort(is); // 1,2,3,4,5
        System.out.println(Arrays.toString(is));

        // 二分查找法，排序后的数组
        System.out.println(Arrays.binarySearch(is, 5));

        // 数组的比较
        System.out.println(Arrays.equals(is2, is1));
        System.out.println(Arrays.equals(is2, 0, 5, is1, 0, 5));
    }
}
