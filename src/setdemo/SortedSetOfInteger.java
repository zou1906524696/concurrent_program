package setdemo;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetOfInteger {
    public static void main(String[] args){
        Random random = new Random();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        //System.out.println(sortedSet.getClass());
        for (int i = 0; i < 100; i++) {
            sortedSet.add(random.nextInt(30));
        }
        System.out.println(sortedSet);
    }
}
