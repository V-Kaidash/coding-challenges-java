package com.coding.challenges.concurrency.rateLimiter;

import java.time.Instant;

public class UserRequestInfo {
  int requestCount;
  Instant windowStart;

  UserRequestInfo(int requestCount, Instant windowStart) {
    this.requestCount = requestCount;
    this.windowStart = windowStart;
  }
}
