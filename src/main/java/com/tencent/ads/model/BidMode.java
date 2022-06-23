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
 * 出价方式，&lt;br/&gt; 1. bid_mode为billing_event升级字段，不可同时输入，升级后直接写入bid_mode字段即可；&lt;br/&gt; 2.
 * 当投放智能出价广告，可写入BID_MODE_OCPC/BID_MODE_OCPM。此时，optimization_goal优化目标字段必填；&lt;br/&gt; 3.
 * 当投放非智能出价广告，可写入BID_MODE_CPC/BID_MODE_CPM/BID_MODE_CPA。此时，optimization_goal优化目标字段不可填；&lt;br/&gt; 4.
 * 针对非微信流量，BID_MODE_CPC可编辑修改为BID_MODE_OCPC，BID_MODE_CPM可编辑修改为BID_MODE_OCPM，其他修改不可操作。针对微信流量，bid_mode字段不可修改；&lt;br/&gt;
 * 5. 可通过adcreative_templates/get接口查询不同情况下支持的出价方式;
 */
@JsonAdapter(BidMode.Adapter.class)
public enum BidMode {
  CPC("BID_MODE_CPC"),

  CPA("BID_MODE_CPA"),

  CPM("BID_MODE_CPM"),

  OCPC("BID_MODE_OCPC"),

  OCPA("BID_MODE_OCPA"),

  OCPM("BID_MODE_OCPM"),

  CPT("BID_MODE_CPT");

  private String value;

  BidMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BidMode fromValue(String text) {
    for (BidMode b : BidMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BidMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final BidMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BidMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BidMode.fromValue(String.valueOf(value));
    }
  }
}
