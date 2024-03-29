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

/** 商务管家账号类型 */
@JsonAdapter(BMAccountType.Adapter.class)
public enum BMAccountType {
  QQ("BM_ACCOUNT_TYPE_QQ"),

  WECHAT("BM_ACCOUNT_TYPE_WECHAT");

  private String value;

  BMAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BMAccountType fromValue(String text) {
    for (BMAccountType b : BMAccountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BMAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BMAccountType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BMAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BMAccountType.fromValue(String.valueOf(value));
    }
  }
}
