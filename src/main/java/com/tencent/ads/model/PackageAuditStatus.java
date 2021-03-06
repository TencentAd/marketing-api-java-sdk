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

/** 渠道包审核结果状态 */
@JsonAdapter(PackageAuditStatus.Adapter.class)
public enum PackageAuditStatus {
  DIRTY_WORD("AUDIT_STATUS_DIRTY_WORD"),

  PIRATED_SIGNATURE("AUDIT_STATUS_PIRATED_SIGNATURE"),

  VIRUS("AUDIT_STATUS_VIRUS"),

  ADMINISTRATOR_DELETE("AUDIT_STATUS_ADMINISTRATOR_DELETE"),

  MISS_RESOURCE("AUDIT_STATUS_MISS_RESOURCE"),

  REJECT("AUDIT_STATUS_REJECT"),

  GO_ILLEGAL("AUDIT_STATUS_GO_ILLEGAL"),

  OFFLINE("AUDIT_STATUS_OFFLINE"),

  INTERNAL_SERVER_ERROR("AUDIT_STATUS_INTERNAL_SERVER_ERROR"),

  ONLINE("AUDIT_STATUS_ONLINE"),

  NEW_VERSION("AUDIT_STATUS_NEW_VERSION");

  private String value;

  PackageAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PackageAuditStatus fromValue(String text) {
    for (PackageAuditStatus b : PackageAuditStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PackageAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PackageAuditStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PackageAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PackageAuditStatus.fromValue(String.valueOf(value));
    }
  }
}
