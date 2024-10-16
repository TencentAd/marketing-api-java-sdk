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

/** 企微客服集类型 */
@JsonAdapter(GroupType.Adapter.class)
public enum GroupType {
  DEFAULT("GROUP_TYPE_DEFAULT"),

  GROUP_LBS("GROUP_TYPE_GROUP_LBS"),

  GROUP_RANDOM("GROUP_TYPE_GROUP_RANDOM");

  private String value;

  GroupType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupType fromValue(String text) {
    for (GroupType b : GroupType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<GroupType> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupType.fromValue(String.valueOf(value));
    }
  }
}