package aggregate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * 测试Vector集合，他是线程安全的，但是同步在方法上，效率很低
 * */

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> strings = new Vector<>();
        strings.add(16);
        strings.add(2);
        System.out.println(strings.toString());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(15);
        integers.add(15);
        System.out.println(integers);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(30);
        System.out.println(list.get(0));

    }

}
