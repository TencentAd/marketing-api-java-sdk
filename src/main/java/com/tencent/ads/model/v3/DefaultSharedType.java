/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model.v3;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 默认共享类型 */
@JsonAdapter(DefaultSharedType.Adapter.class)
public enum DefaultSharedType {
  NONE("DEFAULT_SHARED_NONE"),

  ALL_ORGANIZATION("DEFAULT_SHARED_ALL_ORGANIZATION");

  private String value;

  DefaultSharedType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DefaultSharedType fromValue(String text) {
    for (DefaultSharedType b : DefaultSharedType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DefaultSharedType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DefaultSharedType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DefaultSharedType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DefaultSharedType.fromValue(String.valueOf(value));
    }
  }
}
