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

/** 人群类型 */
@JsonAdapter(AudienceType.Adapter.class)
public enum AudienceType {
  CUSTOMER_FILE("CUSTOMER_FILE"),

  LOOKALIKE("LOOKALIKE"),

  USER_ACTION("USER_ACTION"),

  KEYWORD("KEYWORD"),

  AD("AD"),

  COMBINE("COMBINE"),

  LABEL("LABEL");

  private String value;

  AudienceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AudienceType fromValue(String text) {
    for (AudienceType b : AudienceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AudienceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AudienceType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AudienceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AudienceType.fromValue(String.valueOf(value));
    }
  }
}
