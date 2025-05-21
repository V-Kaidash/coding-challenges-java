package com.coding.challenges.concurrency.rateLimiter;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {
  private final int limit;
  private final Duration window;
  private final Map<String, UserRequestInfo> userRequests = new ConcurrentHashMap<>();

  public RateLimiter(int limit, Duration window) {
    this.limit = limit;
    this.window = window;
  }

  public boolean allowRequest(String userId) {
    Instant now = Instant.now();
    userRequests.putIfAbsent(userId, new UserRequestInfo(0, now));

    UserRequestInfo info = userRequests.get(userId);

    synchronized (info) {
      if (now.isAfter(info.windowStart.plus(window))) {
        info.windowStart = now;
        info.requestCount = 1;
        return true;
      }

      if (info.requestCount < limit) {
        info.requestCount++;
        return true;
      }

      return false;
    }
  }
}
