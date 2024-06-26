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

/** 营销链路二级分类 */
@JsonAdapter(ConversionLinkSecondCategoryType.Adapter.class)
public enum ConversionLinkSecondCategoryType {
  ANDROID("ANDROID"),

  IOS("IOS"),

  QUICK_APP("QUICK_APP"),

  WEB("WEB"),

  WECHAT_OFFICIAL_ACCOUNT("WECHAT_OFFICIAL_ACCOUNT"),

  WECHAT_CHANNELS("WECHAT_CHANNELS"),

  WECHAT_MINI_PROGRAM("WECHAT_MINI_PROGRAM"),

  WECOM("WECOM"),

  WECHAT_MINI_GAME("WECHAT_MINI_GAME"),

  QQ_MINI_GAME("QQ_MINI_GAME");

  private String value;

  ConversionLinkSecondCategoryType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionLinkSecondCategoryType fromValue(String text) {
    for (ConversionLinkSecondCategoryType b : ConversionLinkSecondCategoryType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionLinkSecondCategoryType> {
    @Override
    public void write(
        final JsonWriter jsonWriter, final ConversionLinkSecondCategoryType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionLinkSecondCategoryType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionLinkSecondCategoryType.fromValue(String.valueOf(value));
    }
  }
}
