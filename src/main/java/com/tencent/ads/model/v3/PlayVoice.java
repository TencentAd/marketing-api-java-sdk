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

/** 作品配音 */
@JsonAdapter(PlayVoice.Adapter.class)
public enum PlayVoice {
  SYSTEM("PLAY_VOICE_SYSTEM"),

  NORMAL("PLAY_VOICE_NORMAL"),

  PROFESSIONAL("PLAY_VOICE_PROFESSIONAL");

  private String value;

  PlayVoice(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlayVoice fromValue(String text) {
    for (PlayVoice b : PlayVoice.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlayVoice> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlayVoice enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlayVoice read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlayVoice.fromValue(String.valueOf(value));
    }
  }
}