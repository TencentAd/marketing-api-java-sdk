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

/** 社交能力 */
@ApiModel(description = "社交能力")
public class SocialSkillSpec {
  @SerializedName("social_skill_first_comment_switch")
  private Boolean socialSkillFirstCommentSwitch = null;

  @SerializedName("social_skill_first_comment")
  private String socialSkillFirstComment = null;

  public SocialSkillSpec socialSkillFirstCommentSwitch(Boolean socialSkillFirstCommentSwitch) {
    this.socialSkillFirstCommentSwitch = socialSkillFirstCommentSwitch;
    return this;
  }

  /**
   * Get socialSkillFirstCommentSwitch
   *
   * @return socialSkillFirstCommentSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isSocialSkillFirstCommentSwitch() {
    return socialSkillFirstCommentSwitch;
  }

  public void setSocialSkillFirstCommentSwitch(Boolean socialSkillFirstCommentSwitch) {
    this.socialSkillFirstCommentSwitch = socialSkillFirstCommentSwitch;
  }

  public SocialSkillSpec socialSkillFirstComment(String socialSkillFirstComment) {
    this.socialSkillFirstComment = socialSkillFirstComment;
    return this;
  }

  /**
   * Get socialSkillFirstComment
   *
   * @return socialSkillFirstComment
   */
  @ApiModelProperty(value = "")
  public String getSocialSkillFirstComment() {
    return socialSkillFirstComment;
  }

  public void setSocialSkillFirstComment(String socialSkillFirstComment) {
    this.socialSkillFirstComment = socialSkillFirstComment;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialSkillSpec socialSkillSpec = (SocialSkillSpec) o;
    return Objects.equals(
            this.socialSkillFirstCommentSwitch, socialSkillSpec.socialSkillFirstCommentSwitch)
        && Objects.equals(this.socialSkillFirstComment, socialSkillSpec.socialSkillFirstComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(socialSkillFirstCommentSwitch, socialSkillFirstComment);
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