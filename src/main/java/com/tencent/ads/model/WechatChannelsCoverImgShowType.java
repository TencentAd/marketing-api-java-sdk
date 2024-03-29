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

/** 视频号封面图显示类型 */
@JsonAdapter(WechatChannelsCoverImgShowType.Adapter.class)
public enum WechatChannelsCoverImgShowType {
  DEFAULT("COVER_IMG_SHOW_TYPE_DEFAULT"),

  TITLE("COVER_IMG_SHOW_TYPE_TITLE"),

  CENTER("COVER_IMG_SHOW_TYPE_CENTER");

  private String value;

  WechatChannelsCoverImgShowType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WechatChannelsCoverImgShowType fromValue(String text) {
    for (WechatChannelsCoverImgShowType b : WechatChannelsCoverImgShowType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WechatChannelsCoverImgShowType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WechatChannelsCoverImgShowType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WechatChannelsCoverImgShowType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WechatChannelsCoverImgShowType.fromValue(String.valueOf(value));
    }
  }
}
