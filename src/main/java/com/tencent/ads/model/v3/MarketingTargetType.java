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

/** 推广内容资产类型 */
@JsonAdapter(MarketingTargetType.Adapter.class)
public enum MarketingTargetType {
  UNKNOWN("MARKETING_TARGET_TYPE_UNKNOWN"),

  APP_ANDROID("MARKETING_TARGET_TYPE_APP_ANDROID"),

  APP_IOS("MARKETING_TARGET_TYPE_APP_IOS"),

  WECHAT_OFFICIAL_ACCOUNT("MARKETING_TARGET_TYPE_WECHAT_OFFICIAL_ACCOUNT"),

  PRODUCT("MARKETING_TARGET_TYPE_PRODUCT"),

  TRAFFIC("MARKETING_TARGET_TYPE_TRAFFIC"),

  HOUSE_PROPERTY("MARKETING_TARGET_TYPE_HOUSE_PROPERTY"),

  LOCAL_STORE("MARKETING_TARGET_TYPE_LOCAL_STORE"),

  WECHAT_MINI_GAME("MARKETING_TARGET_TYPE_WECHAT_MINI_GAME"),

  CONSUMER_PRODUCT("MARKETING_TARGET_TYPE_CONSUMER_PRODUCT"),

  WECHAT_CHANNELS("MARKETING_TARGET_TYPE_WECHAT_CHANNELS"),

  WECHAT_CHANNELS_LIVE("MARKETING_TARGET_TYPE_WECHAT_CHANNELS_LIVE"),

  WECHAT_CHANNELS_LIVE_RESERVATION("MARKETING_TARGET_TYPE_WECHAT_CHANNELS_LIVE_RESERVATION"),

  MINI_PROGRAM_WECHAT("MARKETING_TARGET_TYPE_MINI_PROGRAM_WECHAT"),

  APP_QUICK_APP("MARKETING_TARGET_TYPE_APP_QUICK_APP"),

  CONSUME_MEDICAL("MARKETING_TARGET_TYPE_CONSUME_MEDICAL"),

  COMPREHENSIVE_HOUSEKEEPING("MARKETING_TARGET_TYPE_COMPREHENSIVE_HOUSEKEEPING"),

  FICTION("MARKETING_TARGET_TYPE_FICTION"),

  SHORT_DRAMA("MARKETING_TARGET_TYPE_SHORT_DRAMA"),

  AUDIOVISUAL_ENTERTAINMENT("MARKETING_TARGET_TYPE_AUDIOVISUAL_ENTERTAINMENT"),

  BEAUTY_AND_PERSONAL_CARE("MARKETING_TARGET_TYPE_BEAUTY_AND_PERSONAL_CARE"),

  WEDDING_AND_PORTRAIT_PHOTOGRAPHY("MARKETING_TARGET_TYPE_WEDDING_AND_PORTRAIT_PHOTOGRAPHY"),

  FRANCHISE_BRAND("MARKETING_TARGET_TYPE_FRANCHISE_BRAND"),

  ENTERPRISE_SERVICES("MARKETING_TARGET_TYPE_ENTERPRISE_SERVICES"),

  EXHIBITION_BOOTH_DESIGN("MARKETING_TARGET_TYPE_EXHIBITION_BOOTH_DESIGN"),

  INSURANCE("MARKETING_TARGET_TYPE_INSURANCE"),

  BANK("MARKETING_TARGET_TYPE_BANK"),

  CREDIT("MARKETING_TARGET_TYPE_CREDIT"),

  INVESTMENT_CONSULTING("MARKETING_TARGET_TYPE_INVESTMENT_CONSULTING"),

  REAL_ESTATE("MARKETING_TARGET_TYPE_REAL_ESTATE"),

  TELECOMMUNICATIONS_OPERATOR("MARKETING_TARGET_TYPE_TELECOMMUNICATIONS_OPERATOR"),

  TOURIST_ATTRACTIONS_TICKETS("MARKETING_TARGET_TYPE_TOURIST_ATTRACTIONS_TICKETS"),

  RENOVATION_SERVICES("MARKETING_TARGET_TYPE_RENOVATION_SERVICES"),

  FURNITURE_AND_BUILDING_MATERIALS("MARKETING_TARGET_TYPE_FURNITURE_AND_BUILDING_MATERIALS"),

  EXHIBITION_SALES("MARKETING_TARGET_TYPE_EXHIBITION_SALES"),

  MEDICINE_INDUSTRY_COMMERCIAL("MARKETING_TARGET_TYPE_MEDICINE_INDUSTRY_COMMERCIAL"),

  FINANCE("MARKETING_TARGET_TYPE_FINANCE"),

  LOCAL_STORE_PACKAGE("MARKETING_TARGET_TYPE_LOCAL_STORE_PACKAGE"),

  CATERING_AND_LEISURE("MARKETING_TARGET_TYPE_CATERING_AND_LEISURE"),

  CHAIN_RESTAURANT("MARKETING_TARGET_TYPE_CHAIN_RESTAURANT"),

  COMMODITY_SET("MARKETING_TARGET_TYPE_COMMODITY_SET"),

  TOURIST_TRAVEL_ROUTE("MARKETING_TARGET_TYPE_TOURIST_TRAVEL_ROUTE"),

  TOURIST_CRUISE_LINE("MARKETING_TARGET_TYPE_TOURIST_CRUISE_LINE"),

  TOURIST_HOTEL_SERVICE("MARKETING_TARGET_TYPE_TOURIST_HOTEL_SERVICE"),

  TOURIST_AIRLINE_TICKETS("MARKETING_TARGET_TYPE_TOURIST_AIRLINE_TICKETS");

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
