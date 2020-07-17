package com.tencent.ads.utils;

public final class LangUtils {

  public static final int HASH_SEED = 17;
  public static final int HASH_OFFSET = 37;

  /** Disabled default constructor. */
  private LangUtils() {
  }

  public static int hashCode(final int seed, final int hashcode) {
    return seed * HASH_OFFSET + hashcode;
  }

  public static int hashCode(final int seed, final boolean b) {
    return hashCode(seed, b ? 1 : 0);
  }

  public static int hashCode(final int seed, final Object obj) {
    return hashCode(seed, obj != null ? obj.hashCode() : 0);
  }

  public static boolean equals(final Object obj1, final Object obj2) {
    return obj1 == null ? obj2 == null : obj1.equals(obj2);
  }

  public static boolean equals(final Object[] a1, final Object[] a2) {
    if (a1 == null) {
      if (a2 == null) {
        return true;
      } else {
        return false;
      }
    } else {
      if (a2 != null && a1.length == a2.length) {
        for (int i = 0; i < a1.length; i++) {
          if (!equals(a1[i], a2[i])) {
            return false;
          }
        }
        return true;
      } else {
        return false;
      }
    }
  }

}