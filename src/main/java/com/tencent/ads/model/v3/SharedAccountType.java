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

/** 被共享账号类型 */
@JsonAdapter(SharedAccountType.Adapter.class)
public enum SharedAccountType {
  INVALID("INVALID"),

  ADVERTISER("ADVERTISER"),

  ORGANIZATION("ORGANIZATION");

  private String value;

  SharedAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SharedAccountType fromValue(String text) {
    for (SharedAccountType b : SharedAccountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SharedAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SharedAccountType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SharedAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SharedAccountType.fromValue(String.valueOf(value));
    }
  }
}
