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

/** 轮播集 */
@ApiModel(description = "轮播集")
public class FloatingZoneListStruct {
  @SerializedName("list")
  private List<FloatingZoneStruct> list = null;

  public FloatingZoneListStruct list(List<FloatingZoneStruct> list) {
    this.list = list;
    return this;
  }

  public FloatingZoneListStruct addListItem(FloatingZoneStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<FloatingZoneStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  @ApiModelProperty(value = "")
  public List<FloatingZoneStruct> getList() {
    return list;
  }

  public void setList(List<FloatingZoneStruct> list) {
    this.list = list;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloatingZoneListStruct floatingZoneListStruct = (FloatingZoneListStruct) o;
    return Objects.equals(this.list, floatingZoneListStruct.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
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
