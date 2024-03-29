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

/** PropertyFileSessionsUpdateResponseData */
public class PropertyFileSessionsUpdateResponseData {
  @SerializedName("session_id")
  private Long sessionId = null;

  @SerializedName("session_status")
  private String sessionStatus = null;

  @SerializedName("success_list")
  private List<String> successList = null;

  @SerializedName("failed_list")
  private List<String> failedList = null;

  @SerializedName("uploading_list")
  private List<String> uploadingList = null;

  public PropertyFileSessionsUpdateResponseData sessionId(Long sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   *
   * @return sessionId
   */
  @ApiModelProperty(value = "")
  public Long getSessionId() {
    return sessionId;
  }

  public void setSessionId(Long sessionId) {
    this.sessionId = sessionId;
  }

  public PropertyFileSessionsUpdateResponseData sessionStatus(String sessionStatus) {
    this.sessionStatus = sessionStatus;
    return this;
  }

  /**
   * Get sessionStatus
   *
   * @return sessionStatus
   */
  @ApiModelProperty(value = "")
  public String getSessionStatus() {
    return sessionStatus;
  }

  public void setSessionStatus(String sessionStatus) {
    this.sessionStatus = sessionStatus;
  }

  public PropertyFileSessionsUpdateResponseData successList(List<String> successList) {
    this.successList = successList;
    return this;
  }

  public PropertyFileSessionsUpdateResponseData addSuccessListItem(String successListItem) {
    if (this.successList == null) {
      this.successList = new ArrayList<String>();
    }
    this.successList.add(successListItem);
    return this;
  }

  /**
   * Get successList
   *
   * @return successList
   */
  @ApiModelProperty(value = "")
  public List<String> getSuccessList() {
    return successList;
  }

  public void setSuccessList(List<String> successList) {
    this.successList = successList;
  }

  public PropertyFileSessionsUpdateResponseData failedList(List<String> failedList) {
    this.failedList = failedList;
    return this;
  }

  public PropertyFileSessionsUpdateResponseData addFailedListItem(String failedListItem) {
    if (this.failedList == null) {
      this.failedList = new ArrayList<String>();
    }
    this.failedList.add(failedListItem);
    return this;
  }

  /**
   * Get failedList
   *
   * @return failedList
   */
  @ApiModelProperty(value = "")
  public List<String> getFailedList() {
    return failedList;
  }

  public void setFailedList(List<String> failedList) {
    this.failedList = failedList;
  }

  public PropertyFileSessionsUpdateResponseData uploadingList(List<String> uploadingList) {
    this.uploadingList = uploadingList;
    return this;
  }

  public PropertyFileSessionsUpdateResponseData addUploadingListItem(String uploadingListItem) {
    if (this.uploadingList == null) {
      this.uploadingList = new ArrayList<String>();
    }
    this.uploadingList.add(uploadingListItem);
    return this;
  }

  /**
   * Get uploadingList
   *
   * @return uploadingList
   */
  @ApiModelProperty(value = "")
  public List<String> getUploadingList() {
    return uploadingList;
  }

  public void setUploadingList(List<String> uploadingList) {
    this.uploadingList = uploadingList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyFileSessionsUpdateResponseData propertyFileSessionsUpdateResponseData =
        (PropertyFileSessionsUpdateResponseData) o;
    return Objects.equals(this.sessionId, propertyFileSessionsUpdateResponseData.sessionId)
        && Objects.equals(this.sessionStatus, propertyFileSessionsUpdateResponseData.sessionStatus)
        && Objects.equals(this.successList, propertyFileSessionsUpdateResponseData.successList)
        && Objects.equals(this.failedList, propertyFileSessionsUpdateResponseData.failedList)
        && Objects.equals(this.uploadingList, propertyFileSessionsUpdateResponseData.uploadingList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, sessionStatus, successList, failedList, uploadingList);
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
