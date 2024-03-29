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

/** 行为对象的类型，仅支持 APP 类目 */
@JsonAdapter(AppActionObjectType.Adapter.class)
public enum AppActionObjectType {
  CLASS("APP_CLASS"),

  ID("APP_ID");

  private String value;

  AppActionObjectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AppActionObjectType fromValue(String text) {
    for (AppActionObjectType b : AppActionObjectType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AppActionObjectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AppActionObjectType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AppActionObjectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AppActionObjectType.fromValue(String.valueOf(value));
    }
  }
}
