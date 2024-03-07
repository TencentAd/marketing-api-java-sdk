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

/** 直播间组件类型 */
@JsonAdapter(CreativeComponentType.Adapter.class)
public enum CreativeComponentType {
  IMAGE_UNKNOWN("LIVE_IMAGE_UNKNOWN"),

  IMAGE_COMPONENT("LIVE_IMAGE_COMPONENT"),

  CONV_COMPONENT("LIVE_CONV_COMPONENT");

  private String value;

  CreativeComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreativeComponentType fromValue(String text) {
    for (CreativeComponentType b : CreativeComponentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CreativeComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreativeComponentType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreativeComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreativeComponentType.fromValue(String.valueOf(value));
    }
  }
}
