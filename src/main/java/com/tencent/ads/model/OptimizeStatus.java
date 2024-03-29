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

/** 优化状态 */
@JsonAdapter(OptimizeStatus.Adapter.class)
public enum OptimizeStatus {
  NONE("OPTIMIZE_STATUS_NONE"),

  PENDING("OPTIMIZE_STATUS_PENDING"),

  FINISHED("OPTIMIZE_STATUS_FINISHED");

  private String value;

  OptimizeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OptimizeStatus fromValue(String text) {
    for (OptimizeStatus b : OptimizeStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OptimizeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OptimizeStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OptimizeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OptimizeStatus.fromValue(String.valueOf(value));
    }
  }
}
