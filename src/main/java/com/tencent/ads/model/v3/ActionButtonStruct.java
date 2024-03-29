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

/** 行动按钮结构 */
@ApiModel(description = "行动按钮结构")
public class ActionButtonStruct {
  @SerializedName("button_text")
  private String buttonText = null;

  @SerializedName("jump_info")
  private JumpinfoStruct jumpInfo = null;

  public ActionButtonStruct buttonText(String buttonText) {
    this.buttonText = buttonText;
    return this;
  }

  /**
   * Get buttonText
   *
   * @return buttonText
   */
  @ApiModelProperty(value = "")
  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  public ActionButtonStruct jumpInfo(JumpinfoStruct jumpInfo) {
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
    ActionButtonStruct actionButtonStruct = (ActionButtonStruct) o;
    return Objects.equals(this.buttonText, actionButtonStruct.buttonText)
        && Objects.equals(this.jumpInfo, actionButtonStruct.jumpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buttonText, jumpInfo);
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
