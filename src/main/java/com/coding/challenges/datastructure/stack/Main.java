package com.coding.challenges.datastructure.stack;

// Implement a stack in Java
public class Main {
  public static void main(String[] args) {
    CustomStack<Integer> stackImplementation = new CustomStack<>();
    stackImplementation.push(1);
    stackImplementation.push(2);
    stackImplementation.push(3);
    System.out.println(stackImplementation.peek());
    System.out.println(stackImplementation.pop());
    System.out.println(stackImplementation.pop());

    CustomStackWithArray<Integer> stackImplementationV2 = new CustomStackWithArray<>(5);
    stackImplementationV2.push(1);
    stackImplementationV2.push(2);
    stackImplementationV2.push(3);
    System.out.println(stackImplementationV2.peek());
    System.out.println(stackImplementationV2.pop());
    System.out.println(stackImplementationV2.pop());
  }
}
