package com.coding.challenges.datastructure.stack;

import java.util.LinkedList;

public class CustomStack<T> {
  private final LinkedList<T> stackData;

  public CustomStack() {
    stackData = new LinkedList<T>();
  }

  public void push(T t) {
    if (t != null) {
      stackData.add(t);
    }
  }

  public T pop() {
    if (!stackData.isEmpty()) {
      T last = stackData.getLast();
      stackData.removeLast();
      return last;
    }
    return null;
  }

  public T peek() {
    if (!stackData.isEmpty()) {
      return stackData.getLast();
    }
    return null;
  }
}
