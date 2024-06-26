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

/** 节点数据回传要求 */
@JsonAdapter(ConversionLinkNodeSeqsType.Adapter.class)
public enum ConversionLinkNodeSeqsType {
  REQUIRE("NODE_SEQS_TYPE_REQUIRE"),

  RECOMMEND("NODE_SEQS_TYPE_RECOMMEND");

  private String value;

  ConversionLinkNodeSeqsType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConversionLinkNodeSeqsType fromValue(String text) {
    for (ConversionLinkNodeSeqsType b : ConversionLinkNodeSeqsType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConversionLinkNodeSeqsType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConversionLinkNodeSeqsType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConversionLinkNodeSeqsType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConversionLinkNodeSeqsType.fromValue(String.valueOf(value));
    }
  }
}
