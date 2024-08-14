package basic;

import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("요일을 입력하세요.(mon,tue,wed,thu,fri,sat,sun");
    String day = in.nextLine();
    switch (day){
      case"mon" :
      case"tue" :
      case"wed" :
      case"thu" :
      case"fri" :
        System.out.println("평일입니다.");
        break;
      case"sat" :
      case"sun" :
        System.out.println("주말입니다.");
        break;
      default:
        System.out.println("알 수 없는 문자가 입력되었습니다.");
    }
  }
}
