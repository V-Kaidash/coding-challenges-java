package com.coding.challenges.datastructure.stack;

public class CustomStackWithArray<T> {
  private T[] array;
  private int top;
  private int capacity;

  public CustomStackWithArray(int capacity) {
    array = (T[]) new Object[capacity];
    top = -1;
    this.capacity = capacity;
  }

  public void push(T value) {
    if (top == capacity - 1) {
      throw new RuntimeException("Stack is full");
    }
    array[++top] = value;
  }

  public T pop() {
    if (top == -1) {
      return null;
    }
    return array[top--];
  }

  public T peek() {
    return array[top];
  }
}
