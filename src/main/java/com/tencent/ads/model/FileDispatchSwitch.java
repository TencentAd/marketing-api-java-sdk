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

/** 是否开启自动分发，如打开开关，文件上传后会自动分发给所选应用场景 */
@JsonAdapter(FileDispatchSwitch.Adapter.class)
public enum FileDispatchSwitch {
  ON("SWITCH_ON"),

  OFF("SWITCH_OFF");

  private String value;

  FileDispatchSwitch(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FileDispatchSwitch fromValue(String text) {
    for (FileDispatchSwitch b : FileDispatchSwitch.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<FileDispatchSwitch> {
    @Override
    public void write(final JsonWriter jsonWriter, final FileDispatchSwitch enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FileDispatchSwitch read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FileDispatchSwitch.fromValue(String.valueOf(value));
    }
  }
}