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
 * 排序条件字段，最新上传：derive_on_first_time，消耗：template_stat.cost，点击率：template_stat.click_rate，使用量：template_stat.use_cnt
 */
@JsonAdapter(FieldTypeEnum.Adapter.class)
public enum FieldTypeEnum {
  DERIVE_ON_FIRST_TIME("derive_on_first_time"),

  TEMPLATE_STAT_COST("template_stat.cost"),

  TEMPLATE_STAT_CLICK_RATE("template_stat.click_rate"),

  TEMPLATE_STAT_USE_CNT("template_stat.use_cnt");

  private String value;

  FieldTypeEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FieldTypeEnum fromValue(String text) {
    for (FieldTypeEnum b : FieldTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FieldTypeEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FieldTypeEnum.fromValue(String.valueOf(value));
    }
  }
}