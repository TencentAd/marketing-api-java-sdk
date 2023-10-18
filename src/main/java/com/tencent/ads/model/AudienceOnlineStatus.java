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

/** 人群包在线状态，如果人群包一段时间不更新或者不使用于广告定向，人群包会被下线处理。下线后的人群无法用于广告定向，但是洞察等不受影响。该字段仅在人群包处理状态为成功可用返回和生效 */
@JsonAdapter(AudienceOnlineStatus.Adapter.class)
public enum AudienceOnlineStatus {
  ONLINE("ONLINE"),

  LOADING("LOADING"),

  OFFLINE("OFFLINE");

  private String value;

  AudienceOnlineStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceOnlineStatus fromValue(String text) {
    for (AudienceOnlineStatus b : AudienceOnlineStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudienceOnlineStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudienceOnlineStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudienceOnlineStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudienceOnlineStatus.fromValue(String.valueOf(value));
    }
  }
}
