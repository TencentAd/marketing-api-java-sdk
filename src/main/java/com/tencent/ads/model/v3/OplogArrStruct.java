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

/** 操作日志结构 */
@ApiModel(description = "操作日志结构")
public class OplogArrStruct {
  @SerializedName("operation_action")
  private OperationActionType operationAction = null;

  @SerializedName("fronted_operator")
  private String frontedOperator = null;

  @SerializedName("operation_object_id")
  private Long operationObjectId = null;

  @SerializedName("operation_object_name")
  private String operationObjectName = null;

  @SerializedName("operator_platform")
  private OperatorPlatformType operatorPlatform = null;

  @SerializedName("operation_log")
  private List<String> operationLog = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("operation_info_list")
  private List<OperationInfoListStruct> operationInfoList = null;

  public OplogArrStruct operationAction(OperationActionType operationAction) {
    this.operationAction = operationAction;
    return this;
  }

  /**
   * Get operationAction
   *
   * @return operationAction
   */
  @ApiModelProperty(value = "")
  public OperationActionType getOperationAction() {
    return operationAction;
  }

  public void setOperationAction(OperationActionType operationAction) {
    this.operationAction = operationAction;
  }

  public OplogArrStruct frontedOperator(String frontedOperator) {
    this.frontedOperator = frontedOperator;
    return this;
  }

  /**
   * Get frontedOperator
   *
   * @return frontedOperator
   */
  @ApiModelProperty(value = "")
  public String getFrontedOperator() {
    return frontedOperator;
  }

  public void setFrontedOperator(String frontedOperator) {
    this.frontedOperator = frontedOperator;
  }

  public OplogArrStruct operationObjectId(Long operationObjectId) {
    this.operationObjectId = operationObjectId;
    return this;
  }

  /**
   * Get operationObjectId
   *
   * @return operationObjectId
   */
  @ApiModelProperty(value = "")
  public Long getOperationObjectId() {
    return operationObjectId;
  }

  public void setOperationObjectId(Long operationObjectId) {
    this.operationObjectId = operationObjectId;
  }

  public OplogArrStruct operationObjectName(String operationObjectName) {
    this.operationObjectName = operationObjectName;
    return this;
  }

  /**
   * Get operationObjectName
   *
   * @return operationObjectName
   */
  @ApiModelProperty(value = "")
  public String getOperationObjectName() {
    return operationObjectName;
  }

  public void setOperationObjectName(String operationObjectName) {
    this.operationObjectName = operationObjectName;
  }

  public OplogArrStruct operatorPlatform(OperatorPlatformType operatorPlatform) {
    this.operatorPlatform = operatorPlatform;
    return this;
  }

  /**
   * Get operatorPlatform
   *
   * @return operatorPlatform
   */
  @ApiModelProperty(value = "")
  public OperatorPlatformType getOperatorPlatform() {
    return operatorPlatform;
  }

  public void setOperatorPlatform(OperatorPlatformType operatorPlatform) {
    this.operatorPlatform = operatorPlatform;
  }

  public OplogArrStruct operationLog(List<String> operationLog) {
    this.operationLog = operationLog;
    return this;
  }

  public OplogArrStruct addOperationLogItem(String operationLogItem) {
    if (this.operationLog == null) {
      this.operationLog = new ArrayList<String>();
    }
    this.operationLog.add(operationLogItem);
    return this;
  }

  /**
   * Get operationLog
   *
   * @return operationLog
   */
  @ApiModelProperty(value = "")
  public List<String> getOperationLog() {
    return operationLog;
  }

  public void setOperationLog(List<String> operationLog) {
    this.operationLog = operationLog;
  }

  public OplogArrStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public OplogArrStruct operationInfoList(List<OperationInfoListStruct> operationInfoList) {
    this.operationInfoList = operationInfoList;
    return this;
  }

  public OplogArrStruct addOperationInfoListItem(OperationInfoListStruct operationInfoListItem) {
    if (this.operationInfoList == null) {
      this.operationInfoList = new ArrayList<OperationInfoListStruct>();
    }
    this.operationInfoList.add(operationInfoListItem);
    return this;
  }

  /**
   * Get operationInfoList
   *
   * @return operationInfoList
   */
  @ApiModelProperty(value = "")
  public List<OperationInfoListStruct> getOperationInfoList() {
    return operationInfoList;
  }

  public void setOperationInfoList(List<OperationInfoListStruct> operationInfoList) {
    this.operationInfoList = operationInfoList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OplogArrStruct oplogArrStruct = (OplogArrStruct) o;
    return Objects.equals(this.operationAction, oplogArrStruct.operationAction)
        && Objects.equals(this.frontedOperator, oplogArrStruct.frontedOperator)
        && Objects.equals(this.operationObjectId, oplogArrStruct.operationObjectId)
        && Objects.equals(this.operationObjectName, oplogArrStruct.operationObjectName)
        && Objects.equals(this.operatorPlatform, oplogArrStruct.operatorPlatform)
        && Objects.equals(this.operationLog, oplogArrStruct.operationLog)
        && Objects.equals(this.createdTime, oplogArrStruct.createdTime)
        && Objects.equals(this.operationInfoList, oplogArrStruct.operationInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        operationAction,
        frontedOperator,
        operationObjectId,
        operationObjectName,
        operatorPlatform,
        operationLog,
        createdTime,
        operationInfoList);
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
