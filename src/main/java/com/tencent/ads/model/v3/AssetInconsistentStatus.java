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

/** 推广内容资产与落地页一致性状态 */
@JsonAdapter(AssetInconsistentStatus.Adapter.class)
public enum AssetInconsistentStatus {
  ALL_CONSISTENT("ALL_CONSISTENT"),

  PARTIALLY_CONSISTENT("PARTIALLY_CONSISTENT"),

  ALL_INCONSISTENT("ALL_INCONSISTENT"),

  IDENTIFYING("IDENTIFYING");

  private String value;

  AssetInconsistentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AssetInconsistentStatus fromValue(String text) {
    for (AssetInconsistentStatus b : AssetInconsistentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AssetInconsistentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AssetInconsistentStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AssetInconsistentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AssetInconsistentStatus.fromValue(String.valueOf(value));
    }
  }
}
