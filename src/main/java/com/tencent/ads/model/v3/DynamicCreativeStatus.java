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

/** 动态创意在系统中的状态 */
@JsonAdapter(DynamicCreativeStatus.Adapter.class)
public enum DynamicCreativeStatus {
  PENDING("DYNAMIC_CREATIVE_STATUS_PENDING"),

  DENIED("DYNAMIC_CREATIVE_STATUS_DENIED"),

  ACTIVE("DYNAMIC_CREATIVE_STATUS_ACTIVE"),

  SUSPEND("DYNAMIC_CREATIVE_STATUS_SUSPEND"),

  PREPARE_FAILED("DYNAMIC_CREATIVE_STATUS_PREPARE_FAILED"),

  DELETED("DYNAMIC_CREATIVE_STATUS_DELETED"),

  CREATING("DYNAMIC_CREATIVE_STATUS_CREATING");

  private String value;

  DynamicCreativeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DynamicCreativeStatus fromValue(String text) {
    for (DynamicCreativeStatus b : DynamicCreativeStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DynamicCreativeStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final DynamicCreativeStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DynamicCreativeStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DynamicCreativeStatus.fromValue(String.valueOf(value));
    }
  }
}
