package basic;

import java.util.Scanner;

public class TernaryDemo {
  public static void main(String[] args) {
    //x 값을 입력받는다. x가 0보다 크면 양수입니다. 0보다 크거나 같으면 양수,
    //0보다 작으면 음수입니다. 출력하도록 조건연산자를 이용해서 작성하시오.
    Scanner in = new Scanner(System.in);
    System.out.println("정수형 숫자를 입력하세요(양수,0,음수 관계 없음) :");
    int i = in.nextInt();
    String result = "";
    if (i >=0){
      result = "양수";
    }else {
      result = "음수";
    }
    //result = (i >= 0) ? "양수" : "음수" ;
    System.out.printf("%d 는 %s 입니다.",i,result);


//    int i = 2;
//    int res = i % 2 ;
//    String name = "";
////    if (res == 0) {
////      name = "짝수";
////      }else{
////        name = "홀수";
////      }
//      System.out.printf("%d 는 %s 입니다.", i,name);
    }
  }

