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

/** 落地页类型 */
@JsonAdapter(PageType.Adapter.class)
public enum PageType {
  UNKNOWN("PAGE_TYPE_UNKNOWN"),

  ANDROID_APP("PAGE_TYPE_ANDROID_APP"),

  IOS_APP("PAGE_TYPE_IOS_APP"),

  XJ_ANDROID_APP_H5("PAGE_TYPE_XJ_ANDROID_APP_H5"),

  XJ_IOS_APP_H5("PAGE_TYPE_XJ_IOS_APP_H5"),

  XJ_WEB_H5("PAGE_TYPE_XJ_WEB_H5"),

  FENGYE_ECOMMERCE("PAGE_TYPE_FENGYE_ECOMMERCE"),

  XJ_QUICK("PAGE_TYPE_XJ_QUICK"),

  QQ_APP_MINI_PROGRAM("PAGE_TYPE_QQ_APP_MINI_PROGRAM"),

  QQ_MINI_GAME("PAGE_TYPE_QQ_MINI_GAME"),

  APP_DEEP_LINK("PAGE_TYPE_APP_DEEP_LINK"),

  APP_MARKET("PAGE_TYPE_APP_MARKET"),

  ANDROID_QUICK_APP("PAGE_TYPE_ANDROID_QUICK_APP"),

  WECHAT_CANVAS("PAGE_TYPE_WECHAT_CANVAS"),

  WECHAT_OFFICIAL_ACCOUNT_DETAIL("PAGE_TYPE_WECHAT_OFFICIAL_ACCOUNT_DETAIL"),

  WECHAT_SIMPLE_CANVAS("PAGE_TYPE_WECHAT_SIMPLE_CANVAS"),

  WECHAT_MINI_GAME("PAGE_TYPE_WECHAT_MINI_GAME"),

  WECHAT_CANVAS_MINI_PROGRAM("PAGE_TYPE_WECHAT_CANVAS_MINI_PROGRAM"),

  WECHAT_FOCUS_DAILOG("PAGE_TYPE_WECHAT_FOCUS_DAILOG"),

  WECHAT_MINI_PROGRAM("PAGE_TYPE_WECHAT_MINI_PROGRAM"),

  WECHAT_CHANNELS_FEED("PAGE_TYPE_WECHAT_CHANNELS_FEED"),

  WECHAT_CHANNELS_WATCH_LIVE("PAGE_TYPE_WECHAT_CHANNELS_WATCH_LIVE"),

  WECHAT_CHANNELS_RESERVE_LIVE("PAGE_TYPE_WECHAT_CHANNELS_RESERVE_LIVE"),

  WECHAT_APPOINTMENT_CARD("PAGE_TYPE_WECHAT_APPOINTMENT_CARD"),

  WECHAT_CONSULT("PAGE_TYPE_WECHAT_CONSULT"),

  WECOM_CONSULT("PAGE_TYPE_WECOM_CONSULT"),

  ANDROID_DIRECT_DOWNLOAD("PAGE_TYPE_ANDROID_DIRECT_DOWNLOAD"),

  H5_PROFILE("PAGE_TYPE_H5_PROFILE"),

  SEARCH_BRAND_AREA("PAGE_TYPE_SEARCH_BRAND_AREA"),

  WECHAT_CHANNELS_PROFILE("PAGE_TYPE_WECHAT_CHANNELS_PROFILE"),

  H5("PAGE_TYPE_H5"),

  WECHAT_CHANNELS_FOLLOW_ACCOUNT("PAGE_TYPE_WECHAT_CHANNELS_FOLLOW_ACCOUNT"),

  WECHAT_CHANNELS_SHOP_PRODUCT("PAGE_TYPE_WECHAT_CHANNELS_SHOP_PRODUCT"),

  OFFICIAL("PAGE_TYPE_OFFICIAL"),

  NOT_USED("PAGE_TYPE_NOT_USED");

  private String value;

  PageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PageType fromValue(String text) {
    for (PageType b : PageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PageType.fromValue(String.valueOf(value));
    }
  }
}