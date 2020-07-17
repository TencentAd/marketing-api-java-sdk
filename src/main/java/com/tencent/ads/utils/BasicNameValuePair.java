package com.tencent.ads.utils;

import java.io.Serializable;
import java.util.Locale;

public class BasicNameValuePair implements NameValuePair, Serializable {

  private static final long serialVersionUID = -6437800749411518984L;

  private final String name;
  private final String value;

  public BasicNameValuePair(final String name, final String value) {
    super();
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    // don't call complex default formatting for a simple toString

    if (this.value == null) {
      return name;
    }
    final int len = this.name.length() + 1 + this.value.length();
    final StringBuilder buffer = new StringBuilder(len);
    buffer.append(this.name);
    buffer.append("=");
    buffer.append(this.value);
    return buffer.toString();
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj instanceof BasicNameValuePair) {
      final BasicNameValuePair that = (BasicNameValuePair) obj;
      return this.name.equalsIgnoreCase(that.name) && LangUtils.equals(this.value, that.value);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = LangUtils.HASH_SEED;
    hash = LangUtils.hashCode(hash, this.name.toLowerCase(Locale.ROOT));
    hash = LangUtils.hashCode(hash, this.value);
    return hash;
  }

}