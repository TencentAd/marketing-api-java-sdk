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

/** 上传方式 */
@JsonAdapter(ImageUploadType.Adapter.class)
public enum ImageUploadType {
  FILE("UPLOAD_TYPE_FILE"),

  BYTES("UPLOAD_TYPE_BYTES");

  private String value;

  ImageUploadType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImageUploadType fromValue(String text) {
    for (ImageUploadType b : ImageUploadType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImageUploadType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImageUploadType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImageUploadType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImageUploadType.fromValue(String.valueOf(value));
    }
  }
}
