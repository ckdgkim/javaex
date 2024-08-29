package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> alist = new ArrayList<>();
    LinkedList<Integer> llist = new LinkedList<>();
    for (int i = 0; i < 10000000; i++) {
      alist.add(0,i);
    }
    for (int i = 0; i < 10000000; i++) {
      llist.addLast(0);
    }
  }
}
