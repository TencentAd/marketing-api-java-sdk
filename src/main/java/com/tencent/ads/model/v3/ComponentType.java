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

/** 创意组件类型 */
@JsonAdapter(ComponentType.Adapter.class)
public enum ComponentType {
  UNKNOWN("UNKNOWN"),

  TITLE("TITLE"),

  DESCRIPTION("DESCRIPTION"),

  IMAGE("IMAGE"),

  IMAGE_LIST("IMAGE_LIST"),

  JUMP_INFO("JUMP_INFO"),

  VIDEO("VIDEO"),

  BRAND("BRAND"),

  CONSULT("CONSULT"),

  PHONE("PHONE"),

  FORM("FORM"),

  ACTION_BUTTON("ACTION_BUTTON"),

  CHOSEN_BUTTON("CHOSEN_BUTTON"),

  LABEL("LABEL"),

  SHOW_DATA("SHOW_DATA"),

  MARKETING_PENDANT("MARKETING_PENDANT"),

  APP_GIFT_PACK_CODE("APP_GIFT_PACK_CODE"),

  SHOP_IMAGE("SHOP_IMAGE"),

  COUNT_DOWN("COUNT_DOWN"),

  BARRAGE("BARRAGE"),

  FLOATING_ZONE("FLOATING_ZONE"),

  TEXT_LINK("TEXT_LINK"),

  END_PAGE("END_PAGE"),

  LIVING_DESC("LIVING_DESC"),

  WECHAT_CHANNELS("WECHAT_CHANNELS"),

  SHORT_VIDEO("SHORT_VIDEO"),

  ELEMENT_STORY("ELEMENT_STORY"),

  WXGAME_PLAYABLE_PAGE("WXGAME_PLAYABLE_PAGE"),

  APP_PROMOTION_VIDEO("APP_PROMOTION_VIDEO"),

  VIDEO_SHOWCASE("VIDEO_SHOWCASE"),

  IMAGE_SHOWCASE("IMAGE_SHOWCASE"),

  SOCIAL_SKILL("SOCIAL_SKILL"),

  MINI_CARD_LINK("MINI_CARD_LINK"),

  SUBLINK("SUBLINK"),

  CONSULT_LINK("CONSULT_LINK"),

  SHOP_PRODUCT_CARD("SHOP_PRODUCT_CARD"),

  DYNAMIC_SHOWCASE("DYNAMIC_SHOWCASE"),

  UNVEIL_CARD("UNVEIL_CARD"),

  HOT_TOPIC("HOT_TOPIC"),

  VIDEO_CHANNELS_CONTENT("VIDEO_CHANNELS_CONTENT"),

  V2_TITLE("V2_TITLE"),

  V2_DESCRIPTION("V2_DESCRIPTION"),

  V2_LONG_SUBLINK("V2_LONG_SUBLINK"),

  V2_SHORT_SUBLINK("V2_SHORT_SUBLINK"),

  V2_LONG_SUBLINK_LIST("V2_LONG_SUBLINK_LIST"),

  V2_SHORT_SUBLINK_LIST("V2_SHORT_SUBLINK_LIST"),

  V2_APP_DOWNLOAD("V2_APP_DOWNLOAD"),

  V2_IMAGE_1X1("V2_IMAGE_1X1"),

  V2_IMAGE_LIST_1X1("V2_IMAGE_LIST_1X1"),

  V2_IMAGE_TEXT_1X1("V2_IMAGE_TEXT_1X1"),

  V2_IMAGE_BIG_20X7("V2_IMAGE_BIG_20X7"),

  V2_VIDEO_16X9_IMAGE_16X9("V2_VIDEO_16X9_IMAGE_16X9"),

  V2_VIDEO_16X9_IMAGE_4X3("V2_VIDEO_16X9_IMAGE_4X3"),

  V2_VIDEO_16X9_IMAGE_1X1("V2_VIDEO_16X9_IMAGE_1X1"),

  V2_QUICK_CONSULT("V2_QUICK_CONSULT"),

  V2_PHONE("V2_PHONE"),

  V2_FORM("V2_FORM"),

  V2_BRAND("V2_BRAND"),

  V2_LANDING_PAGE("V2_LANDING_PAGE"),

  V2_HOLIDAY_LOGO("V2_HOLIDAY_LOGO"),

  V2_ACTION_BUTTON("V2_ACTION_BUTTON"),

  V2_CHOSEN_BUTTON("V2_CHOSEN_BUTTON"),

  V2_VIDEO_9X16_IMAGE_9X16("V2_VIDEO_9X16_IMAGE_9X16"),

  V2_IMAGE_16X9("V2_IMAGE_16X9"),

  V2_LABEL("V2_LABEL"),

  V2_PROMOTION_SUBLINK("V2_PROMOTION_SUBLINK"),

  V2_IMAGE_LIST_3X2("V2_IMAGE_LIST_3X2"),

  V2_IMAGE_LIST_9X16("V2_IMAGE_LIST_9X16"),

  V2_LIST_SUBLINK("V2_LIST_SUBLINK"),

  V2_MDPA_TITLE("V2_MDPA_TITLE"),

  V2_MDPA_DESCRIPTION("V2_MDPA_DESCRIPTION"),

  SEARCH_ALGORITHM_GEN("SEARCH_ALGORITHM_GEN"),

  SEARCH_DERIVATIVE_TITLE("SEARCH_DERIVATIVE_TITLE"),

  SMART_DELIVERY_AIGC("SMART_DELIVERY_AIGC"),

  MARKETING_ASSET_PLAYLET("MARKETING_ASSET_PLAYLET");

  private String value;

  ComponentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ComponentType fromValue(String text) {
    for (ComponentType b : ComponentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ComponentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ComponentType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ComponentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ComponentType.fromValue(String.valueOf(value));
    }
  }
}
