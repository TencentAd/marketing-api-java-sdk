/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 微信广告账户授权状态，当直客请求时该字段无意义，将返回UNKNOWN */
@JsonAdapter(WechatAuthStatus.Adapter.class)
public enum WechatAuthStatus {
  PRE_AUTHORIZATION("STATUS_PRE_AUTHORIZATION"),

  CONFIRM_AUTHORIZATION("STATUS_CONFIRM_AUTHORIZATION"),

  REQUEST_CANCELATION("STATUS_REQUEST_CANCELATION");

  private String value;

  WechatAuthStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WechatAuthStatus fromValue(String text) {
    for (WechatAuthStatus b : WechatAuthStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WechatAuthStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WechatAuthStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WechatAuthStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WechatAuthStatus.fromValue(String.valueOf(value));
    }
  }
}
