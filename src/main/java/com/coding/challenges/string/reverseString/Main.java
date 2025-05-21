package com.coding.challenges.string.reverseString;

// Given a String, write code that returns the reversed String either with using
// the reverse method of StringBuilder - or without using the reverse method.
public class Main {
  public static void main(String[] args) {
    String input = "some string for checking";

    System.out.println("Easy solution: " + reverseStringWithStringBuilder(input));
    System.out.println("Manual algorithm: " + reverseStringManually(input));
  }

  private static String reverseStringManually(String string) {
    char[] reversedCharArray = string.toCharArray();
    String reversedString = "";
    for (int i = reversedCharArray.length - 1; i >= 0; i--) {
      reversedString += reversedCharArray[i];
    }
    return reversedString;
  }

  private static String reverseStringWithStringBuilder(String string) {
    return new StringBuilder(string).reverse().toString();
  }
}
