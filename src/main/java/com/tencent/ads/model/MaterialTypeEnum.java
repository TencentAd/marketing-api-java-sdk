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

/** 素材类型，视频或图片 */
@JsonAdapter(MaterialTypeEnum.Adapter.class)
public enum MaterialTypeEnum {
  IMAGE("IMAGE"),

  VIDEO("VIDEO");

  private String value;

  MaterialTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MaterialTypeEnum fromValue(String text) {
    for (MaterialTypeEnum b : MaterialTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MaterialTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final MaterialTypeEnum enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MaterialTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MaterialTypeEnum.fromValue(String.valueOf(value));
    }
  }
}