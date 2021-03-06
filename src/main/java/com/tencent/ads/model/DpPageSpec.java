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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 落地页信息 */
@ApiModel(description = "落地页信息")
public class DpPageSpec {
  @SerializedName("mini_program_spec")
  private DpMiniProgramSpec miniProgramSpec = null;

  @SerializedName("alita_page_spec")
  private DpAlitaPageSpec alitaPageSpec = null;

  public DpPageSpec miniProgramSpec(DpMiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
    return this;
  }

  /**
   * Get miniProgramSpec
   *
   * @return miniProgramSpec
   */
  @ApiModelProperty(value = "")
  public DpMiniProgramSpec getMiniProgramSpec() {
    return miniProgramSpec;
  }

  public void setMiniProgramSpec(DpMiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
  }

  public DpPageSpec alitaPageSpec(DpAlitaPageSpec alitaPageSpec) {
    this.alitaPageSpec = alitaPageSpec;
    return this;
  }

  /**
   * Get alitaPageSpec
   *
   * @return alitaPageSpec
   */
  @ApiModelProperty(value = "")
  public DpAlitaPageSpec getAlitaPageSpec() {
    return alitaPageSpec;
  }

  public void setAlitaPageSpec(DpAlitaPageSpec alitaPageSpec) {
    this.alitaPageSpec = alitaPageSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpPageSpec dpPageSpec = (DpPageSpec) o;
    return Objects.equals(this.miniProgramSpec, dpPageSpec.miniProgramSpec)
        && Objects.equals(this.alitaPageSpec, dpPageSpec.alitaPageSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniProgramSpec, alitaPageSpec);
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
