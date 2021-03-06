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

/** 动态商品模板类型 */
@JsonAdapter(DynamicAdTemplateType.Adapter.class)
public enum DynamicAdTemplateType {
  IMAGE_TEMPLATE("DYNAMIC_AD_IMAGE_TEMPLATE"),

  VIDEO_TEMPLATE("DYNAMIC_AD_VIDEO_TEMPLATE");

  private String value;

  DynamicAdTemplateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DynamicAdTemplateType fromValue(String text) {
    for (DynamicAdTemplateType b : DynamicAdTemplateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DynamicAdTemplateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DynamicAdTemplateType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DynamicAdTemplateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DynamicAdTemplateType.fromValue(String.valueOf(value));
    }
  }
}
