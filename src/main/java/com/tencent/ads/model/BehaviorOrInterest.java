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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 行为兴趣意向定向，2022年6月30日起，该定向将无法在竞价oCPC、oCPM场景使用。 */
@ApiModel(description = "行为兴趣意向定向，2022年6月30日起，该定向将无法在竞价oCPC、oCPM场景使用。")
public class BehaviorOrInterest {
  @SerializedName("interest")
  private Interest interest = null;

  @SerializedName("behavior")
  private List<BehaviorStruct> behavior = null;

  @SerializedName("intention")
  private Intention intention = null;

  public BehaviorOrInterest interest(Interest interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   *
   * @return interest
   */
  @ApiModelProperty(value = "")
  public Interest getInterest() {
    return interest;
  }

  public void setInterest(Interest interest) {
    this.interest = interest;
  }

  public BehaviorOrInterest behavior(List<BehaviorStruct> behavior) {
    this.behavior = behavior;
    return this;
  }

  public BehaviorOrInterest addBehaviorItem(BehaviorStruct behaviorItem) {
    if (this.behavior == null) {
      this.behavior = new ArrayList<BehaviorStruct>();
    }
    this.behavior.add(behaviorItem);
    return this;
  }

  /**
   * Get behavior
   *
   * @return behavior
   */
  @ApiModelProperty(value = "")
  public List<BehaviorStruct> getBehavior() {
    return behavior;
  }

  public void setBehavior(List<BehaviorStruct> behavior) {
    this.behavior = behavior;
  }

  public BehaviorOrInterest intention(Intention intention) {
    this.intention = intention;
    return this;
  }

  /**
   * Get intention
   *
   * @return intention
   */
  @ApiModelProperty(value = "")
  public Intention getIntention() {
    return intention;
  }

  public void setIntention(Intention intention) {
    this.intention = intention;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BehaviorOrInterest behaviorOrInterest = (BehaviorOrInterest) o;
    return Objects.equals(this.interest, behaviorOrInterest.interest)
        && Objects.equals(this.behavior, behaviorOrInterest.behavior)
        && Objects.equals(this.intention, behaviorOrInterest.intention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interest, behavior, intention);
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
