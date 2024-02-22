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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 返回信息 */
@ApiModel(description = "返回信息")
public class ResponseStruct {
  @SerializedName("http_code")
  private Long httpCode = null;

  @SerializedName("headers")
  private List<HeaderStruct> headers = null;

  @SerializedName("body")
  private String body = null;

  public ResponseStruct httpCode(Long httpCode) {
    this.httpCode = httpCode;
    return this;
  }

  /**
   * Get httpCode
   *
   * @return httpCode
   */
  @ApiModelProperty(value = "")
  public Long getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Long httpCode) {
    this.httpCode = httpCode;
  }

  public ResponseStruct headers(List<HeaderStruct> headers) {
    this.headers = headers;
    return this;
  }

  public ResponseStruct addHeadersItem(HeaderStruct headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<HeaderStruct>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * Get headers
   *
   * @return headers
   */
  @ApiModelProperty(value = "")
  public List<HeaderStruct> getHeaders() {
    return headers;
  }

  public void setHeaders(List<HeaderStruct> headers) {
    this.headers = headers;
  }

  public ResponseStruct body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   *
   * @return body
   */
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseStruct responseStruct = (ResponseStruct) o;
    return Objects.equals(this.httpCode, responseStruct.httpCode)
        && Objects.equals(this.headers, responseStruct.headers)
        && Objects.equals(this.body, responseStruct.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpCode, headers, body);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
