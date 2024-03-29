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

/** 文字链组件 */
@ApiModel(description = "文字链组件")
public class TextLinkStruct {
  @SerializedName("link_name_type")
  private LinkUrlLinkNameType linkNameType = null;

  @SerializedName("link_name_text")
  private String linkNameText = null;

  @SerializedName("jump_info")
  private JumpinfoStruct jumpInfo = null;

  public TextLinkStruct linkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   */
  @ApiModelProperty(value = "")
  public LinkUrlLinkNameType getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
  }

  public TextLinkStruct linkNameText(String linkNameText) {
    this.linkNameText = linkNameText;
    return this;
  }

  /**
   * Get linkNameText
   *
   * @return linkNameText
   */
  @ApiModelProperty(value = "")
  public String getLinkNameText() {
    return linkNameText;
  }

  public void setLinkNameText(String linkNameText) {
    this.linkNameText = linkNameText;
  }

  public TextLinkStruct jumpInfo(JumpinfoStruct jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  /**
   * Get jumpInfo
   *
   * @return jumpInfo
   */
  @ApiModelProperty(value = "")
  public JumpinfoStruct getJumpInfo() {
    return jumpInfo;
  }

  public void setJumpInfo(JumpinfoStruct jumpInfo) {
    this.jumpInfo = jumpInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextLinkStruct textLinkStruct = (TextLinkStruct) o;
    return Objects.equals(this.linkNameType, textLinkStruct.linkNameType)
        && Objects.equals(this.linkNameText, textLinkStruct.linkNameText)
        && Objects.equals(this.jumpInfo, textLinkStruct.jumpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkNameType, linkNameText, jumpInfo);
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
