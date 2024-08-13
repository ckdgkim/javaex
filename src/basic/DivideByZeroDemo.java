package basic;

import java.util.Scanner;

public class DivideByZeroDemo {
  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
////    double result = 5 / 0.0 ;
//    double result = 5 % 0.0;
//    System.out.printf("5 나머지연산 2.0는 %.2f입니다.", result);



//    System.out.print("양수를 입력해주세요 : ");
//    int i = in.nextInt();
//
//    if (i == 0) {
//      System.out.println("0으로 나눌 수 업습니다.");
//    }
//    if (i > 0){
//      int result = 5/i;
//      System.out.printf("5 나누기 %d 는 %d입니다.", i, result);
//    }
    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    System.out.println("in과 in2가 동등합니까?" + (in2 == in));
    in2 = in;
    System.out.println("in과 in2가 동등합니까?" + (in2 == in));
  }
}
