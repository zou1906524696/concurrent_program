package setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {
    public static void main(String[] args) {
        //Set 集合存和取的顺序不一致。
        Set<String> hs = new HashSet<>();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        System.out.println(hs);
        // [舰船知识, 世界军事, 兵器知识, 汉和防务]
        Iterator it = hs.iterator();
        if (hs.contains("世界军事")){
            System.out.println("我有世界军事");
        }
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
