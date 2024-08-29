package collection_framework;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> list = new Stack<>();
    Stack<String> st = new Stack<>();
    System.out.println(list.isEmpty());
    System.out.println(st.empty());
    st.push("a");//addLast와 같음
    System.out.println(st);
    st.push("b");//addLast
    st.push("c");//addLast
    System.out.println(st);
    System.out.println(st.peek());
    System.out.println(st.search("b") + "번째에서 찾음");
//    st.peek();//getLast와 같음
//    st.pop("");//removeLast와 같음
    while(!st.empty()) {
      st.pop();
      System.out.println(st);
    }
  }
}
