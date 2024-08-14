package basic;

public class MethodDemo4 {
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

    //method의 이름은 double multiply , 매개변수는 2개이고 데이터타입은 int
    //첫번째 매개변수에서 두번째 매개변수를 곱해서 그 결과를 반환하는 매서드를 만들어라
    //메서드의 반환타입은 long
    //multiply(2000000*1000000)출력; ==>2조
    //minus(2,3) 출력 ; minus(20,10) 출력; minus(200,100) 출력
    int a = 1_000_000 , b = 2_000_000;
    long long1 = 1_000_000L, long2 = 2_000_000L;
    System.out.println(longAdd(long1,long2));
    System.out.println(add(a, b));
    System.out.println(minus(a, b));
    System.out.println(multiply(a, b));
    System.out.println(longMultiply(a,b));
    System.out.println(divide(a, b));
    System.out.printf("%.4f \n" ,doubledivide(a,b));
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
  public static long longMultiply(long num1, long num2){
    return (long)num1 * num2;}
  public static long longAdd(long num1, long num2){ return num1 + num2;}
  public static double doubledivide (double num1, double num2){
    return (double)num1 / num2;
  }
  public static int divide(int num1, int num2) {
    if (num2 == 0) return 0;
    return num1 / num2;
  }
  public static long doubledivide(int num1, int num2){
      if(num2 == 0) return 0;
      return num1 / num2;
  }

}

