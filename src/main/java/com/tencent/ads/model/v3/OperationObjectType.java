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

/** 操作日志对象类型 */
@JsonAdapter(OperationObjectType.Adapter.class)
public enum OperationObjectType {
  ADGROUP("OPERATION_OBJECT_TYPE_ADGROUP"),

  MARKETING_TARGET_ASSETS("OPERATION_OBJECT_TYPE_MARKETING_TARGET_ASSETS"),

  JOINT_BUDGET("OPERATION_OBJECT_TYPE_JOINT_BUDGET");

  private String value;

  OperationObjectType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OperationObjectType fromValue(String text) {
    for (OperationObjectType b : OperationObjectType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OperationObjectType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OperationObjectType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OperationObjectType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OperationObjectType.fromValue(String.valueOf(value));
    }
  }
}
