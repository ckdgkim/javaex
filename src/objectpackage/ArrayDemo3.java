package objectpackage;

import java.util.Arrays;

public class ArrayDemo3 {
  public static void main(String[] args) {
    int[] num = {10,20,30};
    System.out.println(num);
    System.out.println(Arrays.toString(num));

    for (int i = 0; i < num.length; i++) {
      if(i != num.length - 1)
        System.out.print(num[i] + ",");
      else
        System.out.println(num[i]);
    }
    int[] newNum = new int[5];
    //1. step 1 : 크기를 3 -->5 로 증가
    for (int i = 0; i < num.length; i++) {
      if(i != newNum.length - 1)
        System.out.print(newNum[i] + ",");
      else
        System.out.println(newNum[i]);
    }
    //2. step 2 : num 배열의 요소들을 newNum 으로 복사
    for (int i = 0; i < num.length; i++) {
      newNum[i] = num[i];
    }
    //3. step 3 : newNum을 num이 참조하도록 한다.
    num = newNum;
    for (int i = 0; i < num.length; i++) {
      if(i != newNum.length - 1)
        System.out.print(num[i] + ",");
      else
        System.out.println(num[i]);
    }
    System.out.println(Arrays.toString(newNum));
  }
}
