package basic;

public class MethodDemo3 {
  public static void main(String[] args) {
    //method의 이름은 add , 매개변수는 2개이고 데이터 타입은 int
    //2개의 숫자를 더해서 그 결과를 반환하는 매서드를 만들어라.
    // 매서드의 반환타입은 int
    // add(2,3) 출력 ; add(10,20) 출력; add(100,200) 출력

//    System.out.println(add(2,3));
//    System.out.println(add(10,20));
//    System.out.println(add(100,200));
//    int result = add(10, 20);
//    System.out.println(result);
//
//    result = 10 + 20;
//    System.out.println(result);
//
//    result = 100 + 200;
//    System.out.println(result);
//  }
//  public static int add (int num1 , int num2){
//    return num1 + num2;
//  }

    //method의 이름은 minus , 매개변수는 2개이고 데이터타입은 int
    //첫번째 매개변수에서 두번째 매개변수를 빼서 그 결과를 반환하는 매서드를 만들어라
    //메서드의 반환타입은 int
    //minus(2,3) 출력 ; minus(20,10) 출력; minus(200,100) 출력
    int a =2 , b = 10;
    System.out.println(add(a, b));
    System.out.println(minus(a, b));
    System.out.println(multiply(a, b));
    System.out.println(divide(a, b));
  }

  public static int add(int num1, int num2) {
    return num1 + num2;
  }

  public static int minus(int num1, int num2) {
    return num1 - num2;
  }
  public static int multiply(int num1, int num2){
    return num1 * num2;
  }
  public static int divide(int num1, int num2){
    if(num2 == 0) return 0;
    return num1 / num2;
  }

}

