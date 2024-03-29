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

/** 聚合类型 */
@JsonAdapter(AggregationType.Adapter.class)
public enum AggregationType {
  SUM("SUM"),

  MAX("MAX"),

  MIN("MIN"),

  COUNT("COUNT");

  private String value;

  AggregationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AggregationType fromValue(String text) {
    for (AggregationType b : AggregationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AggregationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AggregationType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AggregationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AggregationType.fromValue(String.valueOf(value));
    }
  }
}
