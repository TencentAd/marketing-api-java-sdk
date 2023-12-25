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

/** 营销对象类型 */
@JsonAdapter(MarketingTargetType.Adapter.class)
public enum MarketingTargetType {
  UNKNOWN("MARKETING_TARGET_TYPE_UNKNOWN"),

  APP_ANDROID("MARKETING_TARGET_TYPE_APP_ANDROID"),

  APP_IOS("MARKETING_TARGET_TYPE_APP_IOS"),

  WECHAT_OFFICIAL_ACCOUNT("MARKETING_TARGET_TYPE_WECHAT_OFFICIAL_ACCOUNT"),

  PRODUCT("MARKETING_TARGET_TYPE_PRODUCT"),

  TRAFFIC("MARKETING_TARGET_TYPE_TRAFFIC"),

  HOUSE_PROPERTY("MARKETING_TARGET_TYPE_HOUSE_PROPERTY"),

  TELECOM("MARKETING_TARGET_TYPE_TELECOM"),

  WECHAT_MINI_GAME("MARKETING_TARGET_TYPE_WECHAT_MINI_GAME"),

  CONSUMER_PRODUCT("MARKETING_TARGET_TYPE_CONSUMER_PRODUCT"),

  WECHAT_CHANNELS("MARKETING_TARGET_TYPE_WECHAT_CHANNELS"),

  WECHAT_CHANNELS_LIVE("MARKETING_TARGET_TYPE_WECHAT_CHANNELS_LIVE"),

  WECHAT_CHANNELS_LIVE_RESERVATION("MARKETING_TARGET_TYPE_WECHAT_CHANNELS_LIVE_RESERVATION"),

  MINI_PROGRAM_WECHAT("MARKETING_TARGET_TYPE_MINI_PROGRAM_WECHAT"),

  APP_QUICK_APP("MARKETING_TARGET_TYPE_APP_QUICK_APP"),

  CONSUME_MEDICAL("MARKETING_TARGET_TYPE_CONSUME_MEDICAL");

  private String value;

  MarketingTargetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MarketingTargetType fromValue(String text) {
    for (MarketingTargetType b : MarketingTargetType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MarketingTargetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MarketingTargetType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MarketingTargetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MarketingTargetType.fromValue(String.valueOf(value));
    }
  }
}
