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

/** 广告投放能力 */
@JsonAdapter(Capability.Adapter.class)
public enum Capability {
  ECOMMERCE_PRODUCT("CAPABILITY_WECHAT_ECOMMERCE_PRODUCT"),

  LINK_AD("CAPABILITY_WECHAT_LINK_AD"),

  OCPA("CAPABILITY_WECHAT_OCPA");

  private String value;

  Capability(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Capability fromValue(String text) {
    for (Capability b : Capability.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Capability> {
    @Override
    public void write(final JsonWriter jsonWriter, final Capability enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Capability read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Capability.fromValue(String.valueOf(value));
    }
  }
}
