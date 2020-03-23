package aggregate;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 测试Hashtable集合，他也是线程安全的，不推荐使用
 * **/
public class HashtableDemo {
    public static void main(String[] args){
        Hashtable<String,Integer> map = new Hashtable<>();
        map.put("cc",2);
        System.out.println(map.get("cc"));
        HashMap<String,Integer> map1 = new HashMap<String, Integer>();
        map1.put("dd",3);
    }
}
