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

/** 创意来源 */
@JsonAdapter(AdCreativeSource.Adapter.class)
public enum AdCreativeSource {
  SOURCE_NORMAL("AD_CREATIVE_SOURCE_NORMAL"),

  AUTO_DERIVE("AD_CREATIVE_AUTO_DERIVE"),

  AUTO_GENERATE("AD_CREATIVE_AUTO_GENERATE"),

  PAGE_DERIVE("AD_CREATIVE_PAGE_DERIVE"),

  SEARCH_EXPANSION("AD_CREATIVE_SEARCH_EXPANSION");

  private String value;

  AdCreativeSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdCreativeSource fromValue(String text) {
    for (AdCreativeSource b : AdCreativeSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdCreativeSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdCreativeSource enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdCreativeSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdCreativeSource.fromValue(String.valueOf(value));
    }
  }
}
