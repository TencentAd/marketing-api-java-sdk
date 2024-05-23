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

/** 视频号动态 */
@ApiModel(description = "视频号动态")
public class FinderObjectStruct {
  @SerializedName("finder_username")
  private String finderUsername = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("medias")
  private Medias medias = null;

  @SerializedName("flag")
  private Long flag = null;

  public FinderObjectStruct finderUsername(String finderUsername) {
    this.finderUsername = finderUsername;
    return this;
  }

  /**
   * Get finderUsername
   *
   * @return finderUsername
   */
  @ApiModelProperty(value = "")
  public String getFinderUsername() {
    return finderUsername;
  }

  public void setFinderUsername(String finderUsername) {
    this.finderUsername = finderUsername;
  }

  public FinderObjectStruct description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FinderObjectStruct medias(Medias medias) {
    this.medias = medias;
    return this;
  }

  /**
   * Get medias
   *
   * @return medias
   */
  @ApiModelProperty(value = "")
  public Medias getMedias() {
    return medias;
  }

  public void setMedias(Medias medias) {
    this.medias = medias;
  }

  public FinderObjectStruct flag(Long flag) {
    this.flag = flag;
    return this;
  }

  /**
   * Get flag
   *
   * @return flag
   */
  @ApiModelProperty(value = "")
  public Long getFlag() {
    return flag;
  }

  public void setFlag(Long flag) {
    this.flag = flag;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinderObjectStruct finderObjectStruct = (FinderObjectStruct) o;
    return Objects.equals(this.finderUsername, finderObjectStruct.finderUsername)
        && Objects.equals(this.description, finderObjectStruct.description)
        && Objects.equals(this.medias, finderObjectStruct.medias)
        && Objects.equals(this.flag, finderObjectStruct.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finderUsername, description, medias, flag);
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