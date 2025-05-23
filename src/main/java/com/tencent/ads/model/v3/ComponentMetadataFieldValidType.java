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

/** 创意组件字段校验类型 */
@JsonAdapter(ComponentMetadataFieldValidType.Adapter.class)
public enum ComponentMetadataFieldValidType {
  UNKNOWN("UNKNOWN"),

  TEXT("TEXT"),

  IMAGE("IMAGE"),

  VIDEO("VIDEO"),

  BARRAGE("BARRAGE"),

  ENUM("ENUM"),

  URL("URL"),

  LEADS("LEADS");

  private String value;

  ComponentMetadataFieldValidType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ComponentMetadataFieldValidType fromValue(String text) {
    for (ComponentMetadataFieldValidType b : ComponentMetadataFieldValidType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ComponentMetadataFieldValidType> {
    @Override
    public void write(
        final JsonWriter jsonWriter, final ComponentMetadataFieldValidType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ComponentMetadataFieldValidType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ComponentMetadataFieldValidType.fromValue(String.valueOf(value));
    }
  }
}
