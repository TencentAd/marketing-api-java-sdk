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

/** 营销目标 */
@JsonAdapter(MarketingScene.Adapter.class)
public enum MarketingScene {
  DEFAULT("DEFAULT"),

  GAME_RESERVATION("GAME_RESERVATION"),

  GAME_PROMOTION("GAME_PROMOTION"),

  APP_ACTIVE_PROMOTION("APP_ACTIVE_PROMOTION"),

  ECOMMERCE_GOODS_DIRECT_PURCHASE_DAILY("ECOMMERCE_GOODS_DIRECT_PURCHASE_DAILY"),

  ECOMMERCE_GOODS_LIVE_PURCHASE_DAILY("ECOMMERCE_GOODS_LIVE_PURCHASE_DAILY"),

  ECOMMERCE_CONSUMER_COLLECT_CLUES_DAILY("ECOMMERCE_CONSUMER_COLLECT_CLUES_DAILY"),

  ECOMMERCE_CONSUMER_ADD_FOLLOWERS_DAILY("ECOMMERCE_CONSUMER_ADD_FOLLOWERS_DAILY"),

  ECOMMERCE_CONSUMER_OFFICIAL_ACCOUNTS_DAILY("ECOMMERCE_CONSUMER_OFFICIAL_ACCOUNTS_DAILY"),

  ECOMMERCE_CONSUMER_CHANNELS_DAILY("ECOMMERCE_CONSUMER_CHANNELS_DAILY"),

  ECOMMERCE_CONSUMER_ANDROID_NEW_DAILY("ECOMMERCE_CONSUMER_ANDROID_NEW_DAILY"),

  ECOMMERCE_CONSUMER_IOS_NEW_DAILY("ECOMMERCE_CONSUMER_IOS_NEW_DAILY"),

  ECOMMERCE_CONTENT_BRAND_DAILY("ECOMMERCE_CONTENT_BRAND_DAILY");

  private String value;

  MarketingScene(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MarketingScene fromValue(String text) {
    for (MarketingScene b : MarketingScene.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MarketingScene> {
    @Override
    public void write(final JsonWriter jsonWriter, final MarketingScene enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MarketingScene read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MarketingScene.fromValue(String.valueOf(value));
    }
  }
}
