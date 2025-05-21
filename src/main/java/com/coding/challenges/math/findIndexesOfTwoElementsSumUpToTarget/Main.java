package com.coding.challenges.math.findIndexesOfTwoElementsSumUpToTarget;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array and an expected sum, you are required to find the index of the two numbers
// in the array whose sum adds up to the number
public class Main {
  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 13};
    int target = 90;

    System.out.println(Arrays.toString(findIndexesOfTwoElementsSumUpToTarget(numbers, target)));
  }

  private static int[] findIndexesOfTwoElementsSumUpToTarget(int[] numbers, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();
    int[] indexes = new int[2];

    for (int i = 0; i < numbers.length; i++) {
      int currentNumber = numbers[i];
      int delta = target - currentNumber;
      if (numToIndex.containsKey(delta)) {
        indexes[0] = numToIndex.get(delta);
        indexes[1] = i;
        return indexes;
      }
      numToIndex.put(currentNumber, i);
    }

    return new int[]{-1, -1};
  }
}
