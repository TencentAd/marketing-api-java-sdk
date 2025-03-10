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

/** 排除天数 */
@JsonAdapter(ExcludedDay.Adapter.class)
public enum ExcludedDay {
  SEVEN_DAY("EXCLUDED_DAY_SEVEN_DAY"),

  ONE_MONTH("EXCLUDED_DAY_ONE_MONTH"),

  TWO_MONTH("EXCLUDED_DAY_TWO_MONTH"),

  THREE_MONTH("EXCLUDED_DAY_THREE_MONTH"),

  SIX_MONTH("EXCLUDED_DAY_SIX_MONTH"),

  ONE_DAY("EXCLUDED_DAY_ONE_DAY");

  private String value;

  ExcludedDay(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExcludedDay fromValue(String text) {
    for (ExcludedDay b : ExcludedDay.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExcludedDay> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExcludedDay enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExcludedDay read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExcludedDay.fromValue(String.valueOf(value));
    }
  }
}
