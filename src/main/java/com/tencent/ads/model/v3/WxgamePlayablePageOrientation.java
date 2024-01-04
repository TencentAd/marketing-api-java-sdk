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

/** 小游戏试玩页横竖屏标记信息 */
@JsonAdapter(WxgamePlayablePageOrientation.Adapter.class)
public enum WxgamePlayablePageOrientation {
  PORTRAIT("PORTRAIT"),

  LANDSCAPE("LANDSCAPE");

  private String value;

  WxgamePlayablePageOrientation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WxgamePlayablePageOrientation fromValue(String text) {
    for (WxgamePlayablePageOrientation b : WxgamePlayablePageOrientation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WxgamePlayablePageOrientation> {
    @Override
    public void write(final JsonWriter jsonWriter, final WxgamePlayablePageOrientation enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WxgamePlayablePageOrientation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WxgamePlayablePageOrientation.fromValue(String.valueOf(value));
    }
  }
}
