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

/** 优化 ROI 目标 */
@JsonAdapter(DeepConversionWorthGoal.Adapter.class)
public enum DeepConversionWorthGoal {
  _7DAY_PURCHASE_ROAS("GOAL_7DAY_PURCHASE_ROAS"),

  _30DAY_PURCHASE_ROAS("GOAL_30DAY_PURCHASE_ROAS"),

  _30DAY_MONETIZATION_ROAS("GOAL_30DAY_MONETIZATION_ROAS"),

  _30DAY_ORDER_ROAS("GOAL_30DAY_ORDER_ROAS"),

  _1DAY_PURCHASE_ROAS("GOAL_1DAY_PURCHASE_ROAS"),

  _1DAY_MONETIZATION_ROAS("GOAL_1DAY_MONETIZATION_ROAS"),

  _7DAY_MONETIZATION_ROAS("GOAL_7DAY_MONETIZATION_ROAS"),

  _7DAY_RETENTION_TIMES("GOAL_7DAY_RETENTION_TIMES"),

  _7DAY_LONGTERM_PURCHASE_ROAS("GOAL_7DAY_LONGTERM_PURCHASE_ROAS"),

  _14DAY_LONGTERM_PURCHASE_ROAS("GOAL_14DAY_LONGTERM_PURCHASE_ROAS"),

  _30DAY_LONGTERM_PURCHASE_ROAS("GOAL_30DAY_LONGTERM_PURCHASE_ROAS"),

  QYT_7DAY_LIVE_STREAM_DEAL_ROAS("GOAL_QYT_7DAY_LIVE_STREAM_DEAL_ROAS"),

  WITHDRAW_DEPOSITS_ROAS("GOAL_WITHDRAW_DEPOSITS_ROAS"),

  FULL_PRICE_COURSE_CONVERSION_ROAS("GOAL_FULL_PRICE_COURSE_CONVERSION_ROAS"),

  _1DAY_PURCHASE_MONETIZATION_ROAS("GOAL_1DAY_PURCHASE_MONETIZATION_ROAS");

  private String value;

  DeepConversionWorthGoal(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeepConversionWorthGoal fromValue(String text) {
    for (DeepConversionWorthGoal b : DeepConversionWorthGoal.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeepConversionWorthGoal> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeepConversionWorthGoal enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeepConversionWorthGoal read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeepConversionWorthGoal.fromValue(String.valueOf(value));
    }
  }
}
