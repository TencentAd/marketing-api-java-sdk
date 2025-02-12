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

/** 转化场景 */
@JsonAdapter(ConversionScene.Adapter.class)
public enum ConversionScene {
  ANDROID("CONVERSION_SCENE_ANDROID"),

  IOS("CONVERSION_SCENE_IOS"),

  WEB("CONVERSION_SCENE_WEB"),

  WECHAT_MINI_PROGRAM("CONVERSION_SCENE_WECHAT_MINI_PROGRAM"),

  WECHAT_MINI_GAME("CONVERSION_SCENE_WECHAT_MINI_GAME"),

  QQ_MINI_GAME("CONVERSION_SCENE_QQ_MINI_GAME"),

  QUICK_APP("CONVERSION_SCENE_QUICK_APP"),

  WE_COM("CONVERSION_SCENE_WE_COM"),

  HARMONY("CONVERSION_SCENE_HARMONY");

  private String value;

  ConversionScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionScene fromValue(String text) {
    for (ConversionScene b : ConversionScene.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConversionScene enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionScene.fromValue(String.valueOf(value));
    }
  }
}
