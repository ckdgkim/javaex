package datastructure;

import org.w3c.dom.Node;

import java.util.EmptyStackException;

public class ListStack<E> {
  Node<E> top;
  int size;

  public ListStack(Node<E> top, int size) {
    top = null;
    size = 0;
  }

  boolean isEmpty(){
//    if (size == 0) return true;
//    return false;
    return (size == 0) ? true : false;
  }

  int size() {
    return size;
  }
  //push,pop,peek 구현
  E peek() {
    if (isEmpty()){
      throw new EmptyStackException();
    }
    return top.e;
  }

  private class Node<E> {
    E e;
    Node<E> next;
  }
}
