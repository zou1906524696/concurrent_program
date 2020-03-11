package setdemo;

import java.util.*;

public class CountVowel {
    public static void main(String[] args){
        Set<String> vowel = new TreeSet<>();
        Collections.addAll(vowel,"a","e","i","o","u");

        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new TreeSet<>();
        set.add("aueqiujkad");
        set.add("ewqewdsad");
        set.add("iaiokfe");
        set.add("osferfc");
        set.add("uerxfsd");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (set.contains(it.next())){
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }

        System.out.println(map);
    }
}
