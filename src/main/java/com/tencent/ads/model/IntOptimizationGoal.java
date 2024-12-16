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

/**
 * 优化目标类型，支持的优化目标及对应的深度优化目标可通过“&lt;a target&#x3D;&#39;_blank&#39;
 * href&#x3D;&#39;/docs/api/tools/capabilities/optimization_goal_permissions_get&#39;
 * &gt;查询优化目标权限&lt;/a&gt;”接口进行查询
 */
@JsonAdapter(IntOptimizationGoal.Adapter.class)
public enum IntOptimizationGoal {
  NONE("OPTIMIZATIONGOAL_NONE"),

  BRAND_CONVERSION("OPTIMIZATIONGOAL_BRAND_CONVERSION"),

  FOLLOW("OPTIMIZATIONGOAL_FOLLOW"),

  CLICK("OPTIMIZATIONGOAL_CLICK"),

  IMPRESSION("OPTIMIZATIONGOAL_IMPRESSION"),

  APP_DOWNLOAD("OPTIMIZATIONGOAL_APP_DOWNLOAD"),

  APP_ACTIVATE("OPTIMIZATIONGOAL_APP_ACTIVATE"),

  APP_REGISTER("OPTIMIZATIONGOAL_APP_REGISTER"),

  ONE_DAY_RETENTION("OPTIMIZATIONGOAL_ONE_DAY_RETENTION"),

  APP_PURCHASE("OPTIMIZATIONGOAL_APP_PURCHASE"),

  ECOMMERCE_ORDER("OPTIMIZATIONGOAL_ECOMMERCE_ORDER"),

  ECOMMERCE_CHECKOUT("OPTIMIZATIONGOAL_ECOMMERCE_CHECKOUT"),

  LEADS("OPTIMIZATIONGOAL_LEADS"),

  ECOMMERCE_CART("OPTIMIZATIONGOAL_ECOMMERCE_CART"),

  PROMOTION_CLICK_KEY_PAGE("OPTIMIZATIONGOAL_PROMOTION_CLICK_KEY_PAGE"),

  VIEW_COMMODITY_PAGE("OPTIMIZATIONGOAL_VIEW_COMMODITY_PAGE"),

  ONLINE_CONSULTATION("OPTIMIZATIONGOAL_ONLINE_CONSULTATION"),

  TELEPHONE_CONSULTATION("OPTIMIZATIONGOAL_TELEPHONE_CONSULTATION"),

  PAGE_RESERVATION("OPTIMIZATIONGOAL_PAGE_RESERVATION"),

  DELIVERY("OPTIMIZATIONGOAL_DELIVERY"),

  MESSAGE_AFTER_FOLLOW("OPTIMIZATIONGOAL_MESSAGE_AFTER_FOLLOW"),

  CLICK_MENU_AFTER_FOLLOW("OPTIMIZATIONGOAL_CLICK_MENU_AFTER_FOLLOW"),

  PAGE_EFFECTIVE_ONLINE_CONSULT("OPTIMIZATIONGOAL_PAGE_EFFECTIVE_ONLINE_CONSULT"),

  CONFIRM_EFFECTIVE_LEADS_CONSULT("OPTIMIZATIONGOAL_CONFIRM_EFFECTIVE_LEADS_CONSULT"),

  CONFIRM_EFFECTIVE_LEADS_PHONE("OPTIMIZATIONGOAL_CONFIRM_EFFECTIVE_LEADS_PHONE"),

  LEADS_COLLECT("OPTIMIZATIONGOAL_LEADS_COLLECT"),

  FIRST_PURCHASE("OPTIMIZATIONGOAL_FIRST_PURCHASE"),

  APPLY("OPTIMIZATIONGOAL_APPLY"),

  PRE_CREDIT("OPTIMIZATIONGOAL_PRE_CREDIT"),

  CREDIT("OPTIMIZATIONGOAL_CREDIT"),

  WITHDRAW_DEPOSITS("OPTIMIZATIONGOAL_WITHDRAW_DEPOSITS"),

  PROMOTION_VIEW_KEY_PAGE("OPTIMIZATIONGOAL_PROMOTION_VIEW_KEY_PAGE"),

  MOBILE_APP_CREATE_ROLE("OPTIMIZATIONGOAL_MOBILE_APP_CREATE_ROLE"),

  CANVAS_CLICK("OPTIMIZATIONGOAL_CANVAS_CLICK"),

  PROMOTION_CLAIM_OFFER("OPTIMIZATIONGOAL_PROMOTION_CLAIM_OFFER"),

  ECOMMERCE_ADD_TO_WISHLIST("OPTIMIZATIONGOAL_ECOMMERCE_ADD_TO_WISHLIST"),

  CONFIRM_EFFECTIVE_LEADS_RESERVATION("OPTIMIZATIONGOAL_CONFIRM_EFFECTIVE_LEADS_RESERVATION"),

  PAGE_RECEIPT("OPTIMIZATIONGOAL_PAGE_RECEIPT"),

  PAGE_SCAN_CODE("OPTIMIZATIONGOAL_PAGE_SCAN_CODE"),

  SELECT_COURSE("OPTIMIZATIONGOAL_SELECT_COURSE"),

  CONFIRM_POTENTIAL_CUSTOMER_PHONE("OPTIMIZATIONGOAL_CONFIRM_POTENTIAL_CUSTOMER_PHONE"),

  MOBILE_APP_AD_INCOME("OPTIMIZATIONGOAL_MOBILE_APP_AD_INCOME"),

  MOBILE_APP_ACCREDIT("OPTIMIZATIONGOAL_MOBILE_APP_ACCREDIT"),

  PURCHASE_MEMBER_CARD("OPTIMIZATIONGOAL_PURCHASE_MEMBER_CARD"),

  PAGE_CONFIRM_EFFECTIVE_LEADS("OPTIMIZATIONGOAL_PAGE_CONFIRM_EFFECTIVE_LEADS"),

  ADD_DESKTOP("OPTIMIZATIONGOAL_ADD_DESKTOP"),

  RESERVATION("OPTIMIZATIONGOAL_RESERVATION"),

  FIRST_ECOMMERCE_ORDER("OPTIMIZATIONGOAL_FIRST_ECOMMERCE_ORDER"),

  FIRST_TWENTY_FOUR_HOUR_ECOMMERCE_ORDER("OPTIMIZATIONGOAL_FIRST_TWENTY_FOUR_HOUR_ECOMMERCE_ORDER"),

  ECOMMERCE_SCANCODE_WX("OPTIMIZATIONGOAL_ECOMMERCE_SCANCODE_WX"),

  CLASS_PARTICIPATED("OPTIMIZATIONGOAL_CLASS_PARTICIPATED"),

  INSURANCE_PURCHASE("OPTIMIZATIONGOAL_INSURANCE_PURCHASE"),

  MOBILE_APP_SEVEN_DAYS_RETENTION("OPTIMIZATIONGOAL_MOBILE_APP_SEVEN_DAYS_RETENTION"),

  LIKE("OPTIMIZATIONGOAL_LIKE"),

  EXTERNAL_LINK_CLICK("OPTIMIZATIONGOAL_EXTERNAL_LINK_CLICK"),

  BUY_COUPONS("OPTIMIZATIONGOAL_BUY_COUPONS"),

  LEAVE_INFORMATION("OPTIMIZATIONGOAL_LEAVE_INFORMATION"),

  CORE_ACTION("OPTIMIZATIONGOAL_CORE_ACTION"),

  ONE_DAY_RETENTION_RATIO("OPTIMIZATIONGOAL_ONE_DAY_RETENTION_RATIO"),

  PROMOTION_READ_ARTICLE("OPTIMIZATIONGOAL_PROMOTION_READ_ARTICLE"),

  RESERVATION_CHECK("OPTIMIZATIONGOAL_RESERVATION_CHECK"),

  OPEN_ACCOUNT("OPTIMIZATIONGOAL_OPEN_ACCOUNT"),

  SEVEN_DAY_ECOMMERCE_ORDER("OPTIMIZATIONGOAL_SEVEN_DAY_ECOMMERCE_ORDER"),

  ADD_WECHAT("OPTIMIZATIONGOAL_ADD_WECHAT"),

  WECOM_CONSULT("OPTIMIZATIONGOAL_WECOM_CONSULT"),

  ADD_GROUP("OPTIMIZATIONGOAL_ADD_GROUP"),

  QUICK_ORDER("OPTIMIZATIONGOAL_QUICK_ORDER"),

  PRE_PAY("OPTIMIZATIONGOAL_PRE_PAY"),

  PAGE_ONLINE_CONSULT_ACTIVE_ONE_MSG("OPTIMIZATIONGOAL_PAGE_ONLINE_CONSULT_ACTIVE_ONE_MSG"),

  CALL_DURATION_THIRTY_SECONDS("OPTIMIZATIONGOAL_CALL_DURATION_THIRTY_SECONDS"),

  CLAIM_COURSE("OPTIMIZATIONGOAL_CLAIM_COURSE"),

  QUIT_GROUP("OPTIMIZATIONGOAL_QUIT_GROUP"),

  VIEW_ACQUISITION_CONTENT("OPTIMIZATIONGOAL_VIEW_ACQUISITION_CONTENT"),

  BACK_FLOW("OPTIMIZATIONGOAL_BACK_FLOW"),

  PAGE_ONLINE_CONSULT_THREE_MSG("OPTIMIZATIONGOAL_PAGE_ONLINE_CONSULT_THREE_MSG"),

  RENEWAL("OPTIMIZATIONGOAL_RENEWAL"),

  LOW_PRICE_COURSE("OPTIMIZATIONGOAL_LOW_PRICE_COURSE"),

  CONSULT_INTENTION("OPTIMIZATIONGOAL_CONSULT_INTENTION"),

  EVERY_DAY_RETENTION("OPTIMIZATIONGOAL_EVERY_DAY_RETENTION"),

  PROMOTION_VIEW_KEY_PAGE_UV("OPTIMIZATIONGOAL_PROMOTION_VIEW_KEY_PAGE_UV"),

  LIVE_STREAM_DURATION_1MIN("OPTIMIZATIONGOAL_LIVE_STREAM_DURATION_1MIN"),

  LIVE_STREAM_INTERACTION("OPTIMIZATIONGOAL_LIVE_STREAM_INTERACTION"),

  ECOMMERCE_CANCEL_ORDER("OPTIMIZATIONGOAL_ECOMMERCE_CANCEL_ORDER"),

  CLICK_LEADS_COMPONENT("OPTIMIZATIONGOAL_CLICK_LEADS_COMPONENT"),

  REGULAR_PRICE_COURSE("OPTIMIZATIONGOAL_REGULAR_PRICE_COURSE"),

  VISIT_STROE("OPTIMIZATIONGOAL_VISIT_STROE"),

  EFFECTIVE_ENTRY("OPTIMIZATIONGOAL_EFFECTIVE_ENTRY"),

  CREDIT_RATIO("OPTIMIZATIONGOAL_CREDIT_RATIO"),

  QYT_LIVE_STREAM_DEAL("OPTIMIZATIONGOAL_QYT_LIVE_STREAM_DEAL"),

  QYT_LIVE_STREAM_PRODUCT_CLICK("OPTIMIZATIONGOAL_QYT_LIVE_STREAM_PRODUCT_CLICK"),

  QYT_LIVE_STREAM_AUDIENCE("OPTIMIZATIONGOAL_QYT_LIVE_STREAM_AUDIENCE"),

  QYT_LIVE_STREAM_COMMENT("OPTIMIZATIONGOAL_QYT_LIVE_STREAM_COMMENT"),

  QYT_LIVE_STREAM_FANS("OPTIMIZATIONGOAL_QYT_LIVE_STREAM_FANS"),

  _24H_FIRSTPAY("OPTIMIZATIONGOAL_24H_FIRSTPAY"),

  STORE_STAY("OPTIMIZATIONGOAL_STORE_STAY"),

  R3("OPTIMIZATIONGOAL_R3"),

  LOW_PRICE_INSURANCE_PAYMENT("OPTIMIZATIONGOAL_LOW_PRICE_INSURANCE_PAYMENT"),

  UNDERWRITING("OPTIMIZATIONGOAL_UNDERWRITING"),

  FIRST_WITHDRAW("OPTIMIZATIONGOAL_FIRST_WITHDRAW"),

  BRIDGING_COURSE_COMPLETED("OPTIMIZATIONGOAL_BRIDGING_COURSE_COMPLETED"),

  THIRTY_SECONDS_SCANCODE_WX("OPTIMIZATIONGOAL_THIRTY_SECONDS_SCANCODE_WX"),

  FIRST_TWENTY_FOUR_HOUR_REFUND_RATE("OPTIMIZATIONGOAL_FIRST_TWENTY_FOUR_HOUR_REFUND_RATE"),

  PAGE_EFFECTIVE_PHONE_CALL("OPTIMIZATIONGOAL_PAGE_EFFECTIVE_PHONE_CALL");

  private String value;

  IntOptimizationGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IntOptimizationGoal fromValue(String text) {
    for (IntOptimizationGoal b : IntOptimizationGoal.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<IntOptimizationGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final IntOptimizationGoal enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IntOptimizationGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IntOptimizationGoal.fromValue(String.valueOf(value));
    }
  }
}
