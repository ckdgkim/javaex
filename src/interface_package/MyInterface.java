package interface_package;

interface MyInterface {
  int Max = 10; // 상수, public static final이 생략됨
  void sayHello(); // abstract 매서드, public abstract 생략
  default void sayGoodBye(){
    System.out.println("상수 값은" + getMax());
    System.out.println("GoodBye");
  }
  static void method(){
    System.out.println("static method 입니다.");
  }
  private int getMax(){
    return Max;
  }
}
