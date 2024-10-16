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

/** 节点链路化应用类型 */
@JsonAdapter(ConversionLinkNodeApplicationType.Adapter.class)
public enum ConversionLinkNodeApplicationType {
  AIDED_MODELING("AIDED_MODELING"),

  PREFACE_MODELING("PREFACE_MODELING"),

  TIER_COLD_BOOT("TIER_COLD_BOOT"),

  TIER_REACH("TIER_REACH"),

  OG_MODELING("OG_MODELING"),

  ATTRIBUTION_NODE("ATTRIBUTION_NODE");

  private String value;

  ConversionLinkNodeApplicationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionLinkNodeApplicationType fromValue(String text) {
    for (ConversionLinkNodeApplicationType b : ConversionLinkNodeApplicationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionLinkNodeApplicationType> {
    @Override
    public void write(
        final JsonWriter jsonWriter, final ConversionLinkNodeApplicationType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionLinkNodeApplicationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionLinkNodeApplicationType.fromValue(String.valueOf(value));
    }
  }
}