package objectpackage;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    p1.model = "갤럭시 Z 폴드 6";
    p1.price = 2_586_000;
    p1.print();
    Phone p2 = new Phone();
    p2.model = "iPhone 15 Pro";
    p2.price = 2_320_000;
    p2.print();
  }
}
