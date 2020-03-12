package setdemo;

import java.util.*;

/**
 *     // Dummy value to associate with an Object in the backing Map
 *     private transient HashMap<E,Object> map;
 *     private static final Object PRESENT = new Object();
 *
 *     public boolean add(E e) {
 *         return map.put(e, PRESENT)==null;
 *     }
 *
 *
 *    public V put(K key, V value) {
 *         return putVal(hash(key), key, value, false, true);
 *     }
 *    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
 *                    boolean evict) {
 *         Node<K,V>[] tab; Node<K,V> p; int n, i;
 *         if ((tab = table) == null || (n = tab.length) == 0)
 *             n = (tab = resize()).length;
 *         if ((p = tab[i = (n - 1) & hash]) == null)
 *             tab[i] = newNode(hash, key, value, null);
 *         else {
 *             Node<K,V> e; K k;
 *             if (p.hash == hash &&
 *                 ((k = p.key) == key || (key != null && key.equals(k))))
 *                 e = p;
 *             else if (p instanceof TreeNode)
 *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
 *             else {
 *                 for (int binCount = 0; ; ++binCount) {
 *                     if ((e = p.next) == null) {
 *                         p.next = newNode(hash, key, value, null);
 *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
 *                             treeifyBin(tab, hash);
 *                         break;
 *                     }
 *                     if (e.hash == hash &&
 *                         ((k = e.key) == key || (key != null && key.equals(k))))
 *                         break;
 *                     p = e;
 *                 }
 *             }
 *             if (e != null) { // existing mapping for key
 *                 V oldValue = e.value;
 *                 if (!onlyIfAbsent || oldValue == null)
 *                     e.value = value;
 *                 afterNodeAccess(e);
 *                 return oldValue;
 *             }
 *         }
 *         ++modCount;
 *         if (++size > threshold)
 *             resize();
 *         afterNodeInsertion(evict);
 *         return null;
 *     }
 * **/
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(20);
            intSet.add(a + 131050);
        }
        Iterator it = intSet.iterator();
        while (it.hasNext()) {
            Integer integer = (Integer) it.next();
            System.out.print(integer-131050 + " ");
        }
        //System.out.println(intSet);
    }
}