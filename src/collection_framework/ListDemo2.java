package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
  public static void main(String[] args) {
    List<Integer> l = List.of(10,20,30);
    System.out.println(l);
    List<Integer> integers = new ArrayList<>(l);
    integers.add(40);
    integers.add(1,15);
    System.out.println(integers);
  }
}