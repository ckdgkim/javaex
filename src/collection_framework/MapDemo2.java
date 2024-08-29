package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();
    Fruit f1 = new Fruit("사과");
    Fruit f2 = new Fruit("딸기");
    fruits.put(f1,5);
    fruits.put(f2,3);
    fruits.put(f1,10);
//    fruits.put(new Fruit("사과"),5);
//    fruits.put(new Fruit("딸기"),3);
//    fruits.put(new Fruit("사과"),10);
    System.out.println(fruits.size());
    System.out.println(fruits.get(f2));
  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "name='" + name + '\'' +
        '}';
  }
}