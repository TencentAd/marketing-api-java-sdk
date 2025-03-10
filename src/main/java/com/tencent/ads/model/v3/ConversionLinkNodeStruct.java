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

/** 链路模板节点结构 */
@ApiModel(description = "链路模板节点结构")
public class ConversionLinkNodeStruct {
  @SerializedName("conversion_link_node_id")
  private Long conversionLinkNodeId = null;

  @SerializedName("conversion_link_node_name")
  private String conversionLinkNodeName = null;

  @SerializedName("conversion_link_node_index")
  private Long conversionLinkNodeIndex = null;

  @SerializedName("conversion_link_action_type")
  private List<String> conversionLinkActionType = null;

  @SerializedName("carrier_id")
  private Long carrierId = null;

  @SerializedName("carrier_name")
  private String carrierName = null;

  @SerializedName("data_source")
  private ConversionLinkNodeDataSource dataSource = null;

  @SerializedName("og_id")
  private List<Long> ogId = null;

  @SerializedName("og_list")
  private List<OgStruct> ogList = null;

  @SerializedName("roi_og_id")
  private List<Long> roiOgId = null;

  @SerializedName("roi_og_list")
  private List<RoiOgStruct> roiOgList = null;

  @SerializedName("conversion_info")
  private List<ConversionInfoStruct> conversionInfo = null;

  public ConversionLinkNodeStruct conversionLinkNodeId(Long conversionLinkNodeId) {
    this.conversionLinkNodeId = conversionLinkNodeId;
    return this;
  }

  /**
   * Get conversionLinkNodeId
   *
   * @return conversionLinkNodeId
   */
  @ApiModelProperty(value = "")
  public Long getConversionLinkNodeId() {
    return conversionLinkNodeId;
  }

  public void setConversionLinkNodeId(Long conversionLinkNodeId) {
    this.conversionLinkNodeId = conversionLinkNodeId;
  }

  public ConversionLinkNodeStruct conversionLinkNodeName(String conversionLinkNodeName) {
    this.conversionLinkNodeName = conversionLinkNodeName;
    return this;
  }

  /**
   * Get conversionLinkNodeName
   *
   * @return conversionLinkNodeName
   */
  @ApiModelProperty(value = "")
  public String getConversionLinkNodeName() {
    return conversionLinkNodeName;
  }

  public void setConversionLinkNodeName(String conversionLinkNodeName) {
    this.conversionLinkNodeName = conversionLinkNodeName;
  }

  public ConversionLinkNodeStruct conversionLinkNodeIndex(Long conversionLinkNodeIndex) {
    this.conversionLinkNodeIndex = conversionLinkNodeIndex;
    return this;
  }

  /**
   * Get conversionLinkNodeIndex
   *
   * @return conversionLinkNodeIndex
   */
  @ApiModelProperty(value = "")
  public Long getConversionLinkNodeIndex() {
    return conversionLinkNodeIndex;
  }

  public void setConversionLinkNodeIndex(Long conversionLinkNodeIndex) {
    this.conversionLinkNodeIndex = conversionLinkNodeIndex;
  }

  public ConversionLinkNodeStruct conversionLinkActionType(List<String> conversionLinkActionType) {
    this.conversionLinkActionType = conversionLinkActionType;
    return this;
  }

  public ConversionLinkNodeStruct addConversionLinkActionTypeItem(
      String conversionLinkActionTypeItem) {
    if (this.conversionLinkActionType == null) {
      this.conversionLinkActionType = new ArrayList<String>();
    }
    this.conversionLinkActionType.add(conversionLinkActionTypeItem);
    return this;
  }

  /**
   * Get conversionLinkActionType
   *
   * @return conversionLinkActionType
   */
  @ApiModelProperty(value = "")
  public List<String> getConversionLinkActionType() {
    return conversionLinkActionType;
  }

  public void setConversionLinkActionType(List<String> conversionLinkActionType) {
    this.conversionLinkActionType = conversionLinkActionType;
  }

  public ConversionLinkNodeStruct carrierId(Long carrierId) {
    this.carrierId = carrierId;
    return this;
  }

  /**
   * Get carrierId
   *
   * @return carrierId
   */
  @ApiModelProperty(value = "")
  public Long getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(Long carrierId) {
    this.carrierId = carrierId;
  }

  public ConversionLinkNodeStruct carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * Get carrierName
   *
   * @return carrierName
   */
  @ApiModelProperty(value = "")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public ConversionLinkNodeStruct dataSource(ConversionLinkNodeDataSource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Get dataSource
   *
   * @return dataSource
   */
  @ApiModelProperty(value = "")
  public ConversionLinkNodeDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ConversionLinkNodeDataSource dataSource) {
    this.dataSource = dataSource;
  }

  public ConversionLinkNodeStruct ogId(List<Long> ogId) {
    this.ogId = ogId;
    return this;
  }

  public ConversionLinkNodeStruct addOgIdItem(Long ogIdItem) {
    if (this.ogId == null) {
      this.ogId = new ArrayList<Long>();
    }
    this.ogId.add(ogIdItem);
    return this;
  }

  /**
   * Get ogId
   *
   * @return ogId
   */
  @ApiModelProperty(value = "")
  public List<Long> getOgId() {
    return ogId;
  }

  public void setOgId(List<Long> ogId) {
    this.ogId = ogId;
  }

  public ConversionLinkNodeStruct ogList(List<OgStruct> ogList) {
    this.ogList = ogList;
    return this;
  }

  public ConversionLinkNodeStruct addOgListItem(OgStruct ogListItem) {
    if (this.ogList == null) {
      this.ogList = new ArrayList<OgStruct>();
    }
    this.ogList.add(ogListItem);
    return this;
  }

  /**
   * Get ogList
   *
   * @return ogList
   */
  @ApiModelProperty(value = "")
  public List<OgStruct> getOgList() {
    return ogList;
  }

  public void setOgList(List<OgStruct> ogList) {
    this.ogList = ogList;
  }

  public ConversionLinkNodeStruct roiOgId(List<Long> roiOgId) {
    this.roiOgId = roiOgId;
    return this;
  }

  public ConversionLinkNodeStruct addRoiOgIdItem(Long roiOgIdItem) {
    if (this.roiOgId == null) {
      this.roiOgId = new ArrayList<Long>();
    }
    this.roiOgId.add(roiOgIdItem);
    return this;
  }

  /**
   * Get roiOgId
   *
   * @return roiOgId
   */
  @ApiModelProperty(value = "")
  public List<Long> getRoiOgId() {
    return roiOgId;
  }

  public void setRoiOgId(List<Long> roiOgId) {
    this.roiOgId = roiOgId;
  }

  public ConversionLinkNodeStruct roiOgList(List<RoiOgStruct> roiOgList) {
    this.roiOgList = roiOgList;
    return this;
  }

  public ConversionLinkNodeStruct addRoiOgListItem(RoiOgStruct roiOgListItem) {
    if (this.roiOgList == null) {
      this.roiOgList = new ArrayList<RoiOgStruct>();
    }
    this.roiOgList.add(roiOgListItem);
    return this;
  }

  /**
   * Get roiOgList
   *
   * @return roiOgList
   */
  @ApiModelProperty(value = "")
  public List<RoiOgStruct> getRoiOgList() {
    return roiOgList;
  }

  public void setRoiOgList(List<RoiOgStruct> roiOgList) {
    this.roiOgList = roiOgList;
  }

  public ConversionLinkNodeStruct conversionInfo(List<ConversionInfoStruct> conversionInfo) {
    this.conversionInfo = conversionInfo;
    return this;
  }

  public ConversionLinkNodeStruct addConversionInfoItem(ConversionInfoStruct conversionInfoItem) {
    if (this.conversionInfo == null) {
      this.conversionInfo = new ArrayList<ConversionInfoStruct>();
    }
    this.conversionInfo.add(conversionInfoItem);
    return this;
  }

  /**
   * Get conversionInfo
   *
   * @return conversionInfo
   */
  @ApiModelProperty(value = "")
  public List<ConversionInfoStruct> getConversionInfo() {
    return conversionInfo;
  }

  public void setConversionInfo(List<ConversionInfoStruct> conversionInfo) {
    this.conversionInfo = conversionInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionLinkNodeStruct conversionLinkNodeStruct = (ConversionLinkNodeStruct) o;
    return Objects.equals(this.conversionLinkNodeId, conversionLinkNodeStruct.conversionLinkNodeId)
        && Objects.equals(
            this.conversionLinkNodeName, conversionLinkNodeStruct.conversionLinkNodeName)
        && Objects.equals(
            this.conversionLinkNodeIndex, conversionLinkNodeStruct.conversionLinkNodeIndex)
        && Objects.equals(
            this.conversionLinkActionType, conversionLinkNodeStruct.conversionLinkActionType)
        && Objects.equals(this.carrierId, conversionLinkNodeStruct.carrierId)
        && Objects.equals(this.carrierName, conversionLinkNodeStruct.carrierName)
        && Objects.equals(this.dataSource, conversionLinkNodeStruct.dataSource)
        && Objects.equals(this.ogId, conversionLinkNodeStruct.ogId)
        && Objects.equals(this.ogList, conversionLinkNodeStruct.ogList)
        && Objects.equals(this.roiOgId, conversionLinkNodeStruct.roiOgId)
        && Objects.equals(this.roiOgList, conversionLinkNodeStruct.roiOgList)
        && Objects.equals(this.conversionInfo, conversionLinkNodeStruct.conversionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conversionLinkNodeId,
        conversionLinkNodeName,
        conversionLinkNodeIndex,
        conversionLinkActionType,
        carrierId,
        carrierName,
        dataSource,
        ogId,
        ogList,
        roiOgId,
        roiOgList,
        conversionInfo);
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
