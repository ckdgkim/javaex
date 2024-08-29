package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
  public static void main(String[] args) {
//    Collection<Integer> c = new ArrayList<>();
//    c.add(10);
//    System.out.println(c.size());
//    c.add(20);
//    System.out.println(c.size());
//    boolean contains = c.contains(10);
//    System.out.println(contains);
////    c.clear();
////    System.out.println(c.isEmpty());
//    Integer[] iarray = c.toArray(new Integer[c.size()]);
//    System.out.println(Arrays.toString(iarray));
//
//    c.remove(10);
//    System.out.println(c);
    Collection<String> s = new ArrayList<>();
    s.add("A");
    s.add("B");
    s.add("C");
    System.out.println(s);
    Iterator<String> iterator = s.iterator();
    System.out.println(iterator.next());
    System.out.println(iterator.next());
    System.out.println(iterator.next());
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    iterator = s.iterator();
    System.out.println(s.iterator());
  }
}
