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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ProgrammedTemplateGetRequest */
public class ProgrammedTemplateGetRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("material_derive_id")
  private Long materialDeriveId = null;

  @SerializedName("material_preview_id")
  private Long materialPreviewId = null;

  @SerializedName("template_id_list")
  private List<Long> templateIdList = null;

  @SerializedName("key_word")
  private String keyWord = null;

  @SerializedName("sort_by")
  private List<SortByStruct> sortBy = null;

  @SerializedName("page_info")
  private PageInfoStruct pageInfo = null;

  public ProgrammedTemplateGetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ProgrammedTemplateGetRequest materialDeriveId(Long materialDeriveId) {
    this.materialDeriveId = materialDeriveId;
    return this;
  }

  /**
   * Get materialDeriveId
   *
   * @return materialDeriveId
   */
  @ApiModelProperty(value = "")
  public Long getMaterialDeriveId() {
    return materialDeriveId;
  }

  public void setMaterialDeriveId(Long materialDeriveId) {
    this.materialDeriveId = materialDeriveId;
  }

  public ProgrammedTemplateGetRequest materialPreviewId(Long materialPreviewId) {
    this.materialPreviewId = materialPreviewId;
    return this;
  }

  /**
   * Get materialPreviewId
   *
   * @return materialPreviewId
   */
  @ApiModelProperty(value = "")
  public Long getMaterialPreviewId() {
    return materialPreviewId;
  }

  public void setMaterialPreviewId(Long materialPreviewId) {
    this.materialPreviewId = materialPreviewId;
  }

  public ProgrammedTemplateGetRequest templateIdList(List<Long> templateIdList) {
    this.templateIdList = templateIdList;
    return this;
  }

  public ProgrammedTemplateGetRequest addTemplateIdListItem(Long templateIdListItem) {
    if (this.templateIdList == null) {
      this.templateIdList = new ArrayList<Long>();
    }
    this.templateIdList.add(templateIdListItem);
    return this;
  }

  /**
   * Get templateIdList
   *
   * @return templateIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getTemplateIdList() {
    return templateIdList;
  }

  public void setTemplateIdList(List<Long> templateIdList) {
    this.templateIdList = templateIdList;
  }

  public ProgrammedTemplateGetRequest keyWord(String keyWord) {
    this.keyWord = keyWord;
    return this;
  }

  /**
   * Get keyWord
   *
   * @return keyWord
   */
  @ApiModelProperty(value = "")
  public String getKeyWord() {
    return keyWord;
  }

  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }

  public ProgrammedTemplateGetRequest sortBy(List<SortByStruct> sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public ProgrammedTemplateGetRequest addSortByItem(SortByStruct sortByItem) {
    if (this.sortBy == null) {
      this.sortBy = new ArrayList<SortByStruct>();
    }
    this.sortBy.add(sortByItem);
    return this;
  }

  /**
   * Get sortBy
   *
   * @return sortBy
   */
  @ApiModelProperty(value = "")
  public List<SortByStruct> getSortBy() {
    return sortBy;
  }

  public void setSortBy(List<SortByStruct> sortBy) {
    this.sortBy = sortBy;
  }

  public ProgrammedTemplateGetRequest pageInfo(PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  @ApiModelProperty(value = "")
  public PageInfoStruct getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgrammedTemplateGetRequest programmedTemplateGetRequest = (ProgrammedTemplateGetRequest) o;
    return Objects.equals(this.accountId, programmedTemplateGetRequest.accountId)
        && Objects.equals(this.materialDeriveId, programmedTemplateGetRequest.materialDeriveId)
        && Objects.equals(this.materialPreviewId, programmedTemplateGetRequest.materialPreviewId)
        && Objects.equals(this.templateIdList, programmedTemplateGetRequest.templateIdList)
        && Objects.equals(this.keyWord, programmedTemplateGetRequest.keyWord)
        && Objects.equals(this.sortBy, programmedTemplateGetRequest.sortBy)
        && Objects.equals(this.pageInfo, programmedTemplateGetRequest.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId, materialDeriveId, materialPreviewId, templateIdList, keyWord, sortBy, pageInfo);
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
