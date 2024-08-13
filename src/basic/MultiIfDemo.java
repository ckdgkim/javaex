package basic;

import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    //점수를 입력받아서 해당 점수의 학점을 매기는 프로그램
    //90~100 ==> "A", 80~89 ==> "B" , 70~79==>"C", 1~69 ==>"D"
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력하세요 (1~100) : ");
    int score = in.nextInt();
    String grade = "";
    if (score > 100) {
      System.out.println("100이하의 정수를 입력하세요");
    }
    else if (score >= 90 ) {
      if (score >= 95){
        grade = "A+";
      }
      else {
        grade = "A0";
      }
    }
    else if (score >= 80  ) {
      grade = "B";
    }
    else if (score >= 70 ) {
      grade = "C";
    }
    else  {
      grade = "D";
    }
    System.out.printf("당신의 점수는 %d 이고, 학점은 %s 입니다.", score, grade);
  }
}
