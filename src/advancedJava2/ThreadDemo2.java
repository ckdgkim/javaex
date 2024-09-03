//package advancedJava2;
//
//public class ThreadDemo2 {
//  public static void main(String[] args) throws InterruptedException {
//    System.out.println(Thread.currentThread().getName());
//
//
//    Thread thread = new Thread(new Runnable() {
//
//      public void run(){ new Task());
//     for (int i = 0; i < 5; i++) {
//        System.out.println(Thread.currentThread().getName());
//        try {
//          Thread.sleep(500);
//        } catch (InterruptedException e) {
//      }
//     }
//    }
//  }
//}
//}
//
//class Task implements Runnable{
//  @Override
//  public void run() {
//    for (int i = 0; i < 5; i++) {
//      System.out.println(Thread.currentThread().getName());
//      try {
//        Thread.sleep(500);
//      } catch (InterruptedException e) {
//      }
//    }
//  }
//}