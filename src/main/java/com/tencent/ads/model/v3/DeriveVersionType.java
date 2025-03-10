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

/** 动态创意类型 */
@JsonAdapter(DeriveVersionType.Adapter.class)
public enum DeriveVersionType {
  UNKNOWN("DERIVE_VERSION_TYPE_UNKNOWN"),

  V2("DERIVE_VERSION_TYPE_V2"),

  V3("DERIVE_VERSION_TYPE_V3");

  private String value;

  DeriveVersionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeriveVersionType fromValue(String text) {
    for (DeriveVersionType b : DeriveVersionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeriveVersionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeriveVersionType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeriveVersionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeriveVersionType.fromValue(String.valueOf(value));
    }
  }
}
