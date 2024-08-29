package test;

public class ChildExample {
  public static void main(String[] args) {
    Parent parent = new Child();
//    Parent parent = new Parent();

    parent.field1 = "부모 field1";
    System.out.println(parent.field1);
    parent.method1();
    parent.method2();

//    parent.field2 = "자식 field2";
//    parent.method3();
    System.out.println("==자식==");
    Child child = new Child();
//    Child child = (Child) parent;
    child.field1 = "부모 field1";
    child.field2 = "자식 field2";
    System.out.println(child.field1);
    System.out.println(child.field2);
    child.method1();
    child.method2();
    child.method3();
  }
}
