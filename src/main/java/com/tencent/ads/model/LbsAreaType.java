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

/** LBS自定义区域类型 */
@JsonAdapter(LbsAreaType.Adapter.class)
public enum LbsAreaType {
  CIRCLE("CIRCLE");

  private String value;

  LbsAreaType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LbsAreaType fromValue(String text) {
    for (LbsAreaType b : LbsAreaType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LbsAreaType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LbsAreaType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LbsAreaType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LbsAreaType.fromValue(String.valueOf(value));
    }
  }
}
