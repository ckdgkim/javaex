package advancedJava;

public class GenericMethodDemo {
  public static void main(String[] args) {
    Integer[] arr = {1, 2, 3, 4, 5};
//    MyUtils.showArray(arr);
    System.out.println("last :" + MyUtils.getLast(arr));

    String[] arr1 = {"A","B","C"};
//    MyUtils.showArray(arr1);
    System.out.println("last :" + MyUtils.getLast(arr1));

    Double[] arr2 = {1.0, 2.0, 3.0};
//    MyUtils.showArray(arr2);
    System.out.println("last :" + MyUtils.getLast(arr2));

    Character[] arr3 = {'a','b','c'};
//    MyUtils.showArray(arr3);
    System.out.println("last :" + MyUtils.getLast(arr3));
  }
}
class MyUtils{
  public static void showArray(Integer[] iArrays){
    for (Integer iArray : iArrays) {
      System.out.println(iArray);
    }
  }
  public static void showArray(String[] sArrays){
    for (String sArray : sArrays) {
      System.out.println(sArray);
    }
  }
  public static <T> void showArray(T[] sArrays){
    for (T sArray : sArrays) {
      System.out.println(sArray);
    }
  }
  public static <T> T getLast(T[] a){
    return a[a.length -1];
  }
}
