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
import java.util.Objects;

/** 转化-关注视频号配置 */
@ApiModel(description = "转化-关注视频号配置")
public class ConvertInfoConfigFollowVideo {
  @SerializedName("convert_type")
  private String convertType = null;

  @SerializedName("nick_name")
  private String nickName = null;

  @SerializedName("one_click")
  private Boolean oneClick = null;

  public ConvertInfoConfigFollowVideo convertType(String convertType) {
    this.convertType = convertType;
    return this;
  }

  /**
   * Get convertType
   *
   * @return convertType
   */
  @ApiModelProperty(value = "")
  public String getConvertType() {
    return convertType;
  }

  public void setConvertType(String convertType) {
    this.convertType = convertType;
  }

  public ConvertInfoConfigFollowVideo nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * Get nickName
   *
   * @return nickName
   */
  @ApiModelProperty(value = "")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public ConvertInfoConfigFollowVideo oneClick(Boolean oneClick) {
    this.oneClick = oneClick;
    return this;
  }

  /**
   * Get oneClick
   *
   * @return oneClick
   */
  @ApiModelProperty(value = "")
  public Boolean isOneClick() {
    return oneClick;
  }

  public void setOneClick(Boolean oneClick) {
    this.oneClick = oneClick;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertInfoConfigFollowVideo convertInfoConfigFollowVideo = (ConvertInfoConfigFollowVideo) o;
    return Objects.equals(this.convertType, convertInfoConfigFollowVideo.convertType)
        && Objects.equals(this.nickName, convertInfoConfigFollowVideo.nickName)
        && Objects.equals(this.oneClick, convertInfoConfigFollowVideo.oneClick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertType, nickName, oneClick);
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
