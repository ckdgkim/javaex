package advancedJava2;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> printX = System.out::println;
//        s -> System.out.println(s); {
//      @Override
//      public void accept(String s) {
//        System.out.println(s);
//      }
//    };
//    printX.accept("t");
    printX.accept("hello world");
    ObjIntConsumer<String> lengthCheck = (s, value) ->{
    for (int i = 0; i < value; i++) {
          System.out.println(s);
        }
    };
//        new ObjIntConsumer<String>() {
//      @Override
//      public void accept(String s, int value) {
//        for (int i = 0; i < value; i++) {
//          System.out.println(s);
//        }
//      }
//    };
    lengthCheck.accept("test", 5);
  }
}
