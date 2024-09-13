package com.tencent.ads;

public class Context {
  private static final ThreadLocal<String> trace = new ThreadLocal<>();

  static void setTraceId(String traceId) {
    trace.set(traceId);
  }

  public static String getTraceId() {
    return trace.get();
  }

  public static void clean() {
    trace.remove();
  }
}
