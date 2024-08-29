package interface_package;

import java.io.LineNumberInputStream;

public class AnnonymousDemo2 {
  public static void main(String[] args) {
    Parent p = new Parent() {
      int innerField = 100;
      @Override
       public void callOnce() {
        System.out.println("딱 한번만 호출됩니다.");
        newMethod();
        System.out.println(innerField);
      }
      public void newMethod(){
        System.out.println("익명객체의 새로운 매서드입니다.");
      }
    };
    p.callOnce();
  }
}

interface Parent {
  void callOnce();
}

//class OnlyOnce implements Parent{
//  @Override
//  public void callOnce() {
//    System.out.println("딱 한번만 호출됩니다.");
//  }
//}