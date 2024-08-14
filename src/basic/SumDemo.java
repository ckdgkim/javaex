package basic;

public class SumDemo {
  public static void main(String[] args) {
    int sum = 0;
//    for (int i = 1; i <= 10; i++) {
//      sum = sum +i;
//      System.out.println(sum);
//    }
//    System.out.println("1부터 10까지의 합은 "+sum);
    for (int i = 10; i <= 100; i++) {
      sum = sum +i;
      System.out.println(sum);
    }
    System.out.println("10부터 100까지의 합은"+sum);

  }
}
