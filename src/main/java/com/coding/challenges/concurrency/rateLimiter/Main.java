package com.coding.challenges.concurrency.rateLimiter;

import java.time.Duration;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    RateLimiter rateLimiter = new RateLimiter(5, Duration.ofMinutes(1));

    for (int i = 0; i < 1000; i++) {
      System.out.println("Is request allowed: " + rateLimiter.allowRequest("user_1"));
      Thread.sleep(1000);
    }
  }
}
