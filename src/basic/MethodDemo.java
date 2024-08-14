package basic;

public class MethodDemo {
  public static void main(String[] args) {
    System.out.println(sum(1, 10)); // ==> 55
    System.out.println(sum(10, 100)); // ==>5005
    System.out.println(sum(100, 1000)); // ==> 495550
  }

//    sum = 0;
//    for (int i = 1; i <= 10; i++) {
//      sum = sum +i;
//      System.out.println(sum);
//    }
//    System.out.println("1부터 10까지의 합은 "+sum);
//
//    sum = 0;
//    for (int i = 10; i <= 100; i++) {
//      sum = sum +i;
//      System.out.println(sum);
//    }
//    System.out.println("10부터 100까지의 합은"+sum);
//
//    sum = 0;
//    for (int i = 100; i <= 1000; i++) {
//      sum = sum +i;
//      System.out.println(sum);
//    }
//    System.out.println("100부터 1000까지의 합은"+sum);
//  }
  public static int sum(int start ,int end){
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum = sum + i;
    }
    return sum;
  }
}
