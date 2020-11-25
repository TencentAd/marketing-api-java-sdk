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

/** 目标尺寸：朋友圈竖版视频、微信激励视频、闪屏、9:16、4:3、16:9 */
@JsonAdapter(SizeType.Adapter.class)
public enum SizeType {
  VERTICALVERSION_750_1536("VERTICALVERSION_750_1536"),

  VERTICALVERSION_750_1334("VERTICALVERSION_750_1334"),

  VERTICALVERSION_1080_1920("VERTICALVERSION_1080_1920"),

  VERTICALVERSION("VERTICALVERSION"),

  HORIZONTALVERSION_4_3("HORIZONTALVERSION_4_3"),

  HORIZONTALVERSION("HORIZONTALVERSION");

  private String value;

  SizeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SizeType fromValue(String text) {
    for (SizeType b : SizeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SizeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SizeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SizeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SizeType.fromValue(String.valueOf(value));
    }
  }
}
