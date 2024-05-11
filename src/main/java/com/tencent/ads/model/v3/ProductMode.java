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

/** 标明适用的动态商品广告类型 */
@JsonAdapter(ProductMode.Adapter.class)
public enum ProductMode {
  SINGLE("SINGLE"),

  MULTIPLE("MULTIPLE");

  private String value;

  ProductMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProductMode fromValue(String text) {
    for (ProductMode b : ProductMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProductMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProductMode enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProductMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProductMode.fromValue(String.valueOf(value));
    }
  }
}
