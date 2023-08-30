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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GameFeatureGetResponseData */
public class GameFeatureGetResponseData {
  @SerializedName("promoted_object_type")
  private PromotedObjectType promotedObjectType = null;

  @SerializedName("promoted_object_id")
  private String promotedObjectId = null;

  @SerializedName("profit_mode_id")
  private Long profitModeId = null;

  @SerializedName("game_type_id")
  private Long gameTypeId = null;

  @SerializedName("gameplay_id_list")
  private List<Long> gameplayIdList = null;

  @SerializedName("game_theme_id")
  private Long gameThemeId = null;

  @SerializedName("game_sub_theme_id")
  private Long gameSubThemeId = null;

  @SerializedName("game_marketing_lifecycle_list")
  private List<GameMarketingLifecycleStruct> gameMarketingLifecycleList = null;

  public GameFeatureGetResponseData promotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
    return this;
  }

  /**
   * Get promotedObjectType
   *
   * @return promotedObjectType
   */
  @ApiModelProperty(value = "")
  public PromotedObjectType getPromotedObjectType() {
    return promotedObjectType;
  }

  public void setPromotedObjectType(PromotedObjectType promotedObjectType) {
    this.promotedObjectType = promotedObjectType;
  }

  public GameFeatureGetResponseData promotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
    return this;
  }

  /**
   * Get promotedObjectId
   *
   * @return promotedObjectId
   */
  @ApiModelProperty(value = "")
  public String getPromotedObjectId() {
    return promotedObjectId;
  }

  public void setPromotedObjectId(String promotedObjectId) {
    this.promotedObjectId = promotedObjectId;
  }

  public GameFeatureGetResponseData profitModeId(Long profitModeId) {
    this.profitModeId = profitModeId;
    return this;
  }

  /**
   * Get profitModeId
   *
   * @return profitModeId
   */
  @ApiModelProperty(value = "")
  public Long getProfitModeId() {
    return profitModeId;
  }

  public void setProfitModeId(Long profitModeId) {
    this.profitModeId = profitModeId;
  }

  public GameFeatureGetResponseData gameTypeId(Long gameTypeId) {
    this.gameTypeId = gameTypeId;
    return this;
  }

  /**
   * Get gameTypeId
   *
   * @return gameTypeId
   */
  @ApiModelProperty(value = "")
  public Long getGameTypeId() {
    return gameTypeId;
  }

  public void setGameTypeId(Long gameTypeId) {
    this.gameTypeId = gameTypeId;
  }

  public GameFeatureGetResponseData gameplayIdList(List<Long> gameplayIdList) {
    this.gameplayIdList = gameplayIdList;
    return this;
  }

  public GameFeatureGetResponseData addGameplayIdListItem(Long gameplayIdListItem) {
    if (this.gameplayIdList == null) {
      this.gameplayIdList = new ArrayList<Long>();
    }
    this.gameplayIdList.add(gameplayIdListItem);
    return this;
  }

  /**
   * Get gameplayIdList
   *
   * @return gameplayIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getGameplayIdList() {
    return gameplayIdList;
  }

  public void setGameplayIdList(List<Long> gameplayIdList) {
    this.gameplayIdList = gameplayIdList;
  }

  public GameFeatureGetResponseData gameThemeId(Long gameThemeId) {
    this.gameThemeId = gameThemeId;
    return this;
  }

  /**
   * Get gameThemeId
   *
   * @return gameThemeId
   */
  @ApiModelProperty(value = "")
  public Long getGameThemeId() {
    return gameThemeId;
  }

  public void setGameThemeId(Long gameThemeId) {
    this.gameThemeId = gameThemeId;
  }

  public GameFeatureGetResponseData gameSubThemeId(Long gameSubThemeId) {
    this.gameSubThemeId = gameSubThemeId;
    return this;
  }

  /**
   * Get gameSubThemeId
   *
   * @return gameSubThemeId
   */
  @ApiModelProperty(value = "")
  public Long getGameSubThemeId() {
    return gameSubThemeId;
  }

  public void setGameSubThemeId(Long gameSubThemeId) {
    this.gameSubThemeId = gameSubThemeId;
  }

  public GameFeatureGetResponseData gameMarketingLifecycleList(
      List<GameMarketingLifecycleStruct> gameMarketingLifecycleList) {
    this.gameMarketingLifecycleList = gameMarketingLifecycleList;
    return this;
  }

  public GameFeatureGetResponseData addGameMarketingLifecycleListItem(
      GameMarketingLifecycleStruct gameMarketingLifecycleListItem) {
    if (this.gameMarketingLifecycleList == null) {
      this.gameMarketingLifecycleList = new ArrayList<GameMarketingLifecycleStruct>();
    }
    this.gameMarketingLifecycleList.add(gameMarketingLifecycleListItem);
    return this;
  }

  /**
   * Get gameMarketingLifecycleList
   *
   * @return gameMarketingLifecycleList
   */
  @ApiModelProperty(value = "")
  public List<GameMarketingLifecycleStruct> getGameMarketingLifecycleList() {
    return gameMarketingLifecycleList;
  }

  public void setGameMarketingLifecycleList(
      List<GameMarketingLifecycleStruct> gameMarketingLifecycleList) {
    this.gameMarketingLifecycleList = gameMarketingLifecycleList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameFeatureGetResponseData gameFeatureGetResponseData = (GameFeatureGetResponseData) o;
    return Objects.equals(this.promotedObjectType, gameFeatureGetResponseData.promotedObjectType)
        && Objects.equals(this.promotedObjectId, gameFeatureGetResponseData.promotedObjectId)
        && Objects.equals(this.profitModeId, gameFeatureGetResponseData.profitModeId)
        && Objects.equals(this.gameTypeId, gameFeatureGetResponseData.gameTypeId)
        && Objects.equals(this.gameplayIdList, gameFeatureGetResponseData.gameplayIdList)
        && Objects.equals(this.gameThemeId, gameFeatureGetResponseData.gameThemeId)
        && Objects.equals(this.gameSubThemeId, gameFeatureGetResponseData.gameSubThemeId)
        && Objects.equals(
            this.gameMarketingLifecycleList, gameFeatureGetResponseData.gameMarketingLifecycleList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        promotedObjectType,
        promotedObjectId,
        profitModeId,
        gameTypeId,
        gameplayIdList,
        gameThemeId,
        gameSubThemeId,
        gameMarketingLifecycleList);
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
