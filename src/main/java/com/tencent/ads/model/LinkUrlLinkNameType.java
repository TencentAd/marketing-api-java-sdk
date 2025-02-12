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

/** 转化引导文案 */
@JsonAdapter(LinkUrlLinkNameType.Adapter.class)
public enum LinkUrlLinkNameType {
  NOT_USED("NOT_USED"),

  VIEW_DETAILS("VIEW_DETAILS"),

  GET_COUPONS("GET_COUPONS"),

  MAKE_AN_APPOINTMENT("MAKE_AN_APPOINTMENT"),

  BUY_NOW("BUY_NOW"),

  GO_SHOPPING("GO_SHOPPING"),

  ENTER_MINI_PROGRAM("ENTER_MINI_PROGRAM"),

  ENTER_MINI_GAME("ENTER_MINI_GAME"),

  APPLY_NOW("APPLY_NOW"),

  BOOK_NOW("BOOK_NOW"),

  RESERVATION_BUY("RESERVATION_BUY"),

  CONSULT_NOW("CONSULT_NOW"),

  BOOK_DRIVE("BOOK_DRIVE"),

  ENTER_OFFICIAL_ACCOUNTS("ENTER_OFFICIAL_ACCOUNTS"),

  PLAY_NOW("PLAY_NOW"),

  OPEN_MINI_GAME("OPEN_MINI_GAME"),

  DOWNLOAD_APP("DOWNLOAD_APP"),

  DOWNLOAD_GAME("DOWNLOAD_GAME"),

  GET_SAMPLES("GET_SAMPLES"),

  TRY_NOW("TRY_NOW"),

  GET_IT_NOW("GET_IT_NOW"),

  BUY_ASAP("BUY_ASAP"),

  DOWNLOAD_NOW("DOWNLOAD_NOW"),

  VIEW_APPS("VIEW_APPS"),

  MORE_INFO("MORE_INFO"),

  GET_VOUCHERS("GET_VOUCHERS"),

  FOLLOW_OFFICIAL_ACCOUNT("FOLLOW_OFFICIAL_ACCOUNT"),

  READ_NOVELS("READ_NOVELS"),

  GO_TO_JD("GO_TO_JD"),

  GO_TO_PDD("GO_TO_PDD"),

  GO_TO_SUNING("GO_TO_SUNING"),

  GO_TO_VIP("GO_TO_VIP"),

  GO_TO_XIAOHONGSHU("GO_TO_XIAOHONGSHU"),

  GO_TO_KUAISHOU("GO_TO_KUAISHOU"),

  WATCH_LIVE("WATCH_LIVE"),

  RESERVE_NOW("RESERVE_NOW"),

  OPEN_APP("OPEN_APP"),

  ALREADY_INSTALL("ALREADY_INSTALL"),

  RESERVE_LIVE("RESERVE_LIVE"),

  FOLLOW_CHANNELS("FOLLOW_CHANNELS"),

  MORE_ABOUT_CHANNELS("MORE_ABOUT_CHANNELS"),

  SETUP_NOW("SETUP_NOW"),

  SECKILL_NOW("SECKILL_NOW"),

  TRY_PLAY_NOW("TRY_PLAY_NOW"),

  INSTALL_NOW("INSTALL_NOW"),

  MORE_ABOUT_OFFICIAL_ACCOUNT_CHT("MORE_ABOUT_OFFICIAL_ACCOUNT_CHT"),

  FOLLOW_OFFICIAL_ACCOUNT_CHT("FOLLOW_OFFICIAL_ACCOUNT_CHT"),

  GET_FOR_FREE("GET_FOR_FREE"),

  CARNIVAL_618("CARNIVAL_618"),

  SURPRISE_618("SURPRISE_618"),

  DISCOUNT_618("DISCOUNT_618"),

  GO_618_VENUE("GO_618_VENUE"),

  GET_618_WELFARE("GET_618_WELFARE"),

  CHECK_IT_OUT("CHECK_IT_OUT"),

  WATCH_VIDEO("WATCH_VIDEO"),

  CONTACT_CUSTOMER_SERVICE("CONTACT_CUSTOMER_SERVICE"),

  CONTACT_BUSINESS("CONTACT_BUSINESS"),

  GO_SCAN("GO_SCAN"),

  LINK_NAME_TEXT_TEMPLATE("LINK_NAME_TEXT_TEMPLATE"),

  PICK_GIFT("PICK_GIFT"),

  SELECT_GIFT("SELECT_GIFT"),

  GIVING_GIFT("GIVING_GIFT"),

  GIVE_FRIEND("GIVE_FRIEND");

  private String value;

  LinkUrlLinkNameType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkUrlLinkNameType fromValue(String text) {
    for (LinkUrlLinkNameType b : LinkUrlLinkNameType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<LinkUrlLinkNameType> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkUrlLinkNameType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkUrlLinkNameType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LinkUrlLinkNameType.fromValue(String.valueOf(value));
    }
  }
}
