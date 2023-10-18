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

/** 导入的线索信息结构 */
@ApiModel(description = "导入的线索信息结构")
public class LeadsImportInfoStruct {
  @SerializedName("outer_leads_id")
  private String outerLeadsId = null;

  @SerializedName("leads_id")
  private Long leadsId = null;

  @SerializedName("leads_tel")
  private String leadsTel = null;

  @SerializedName("leads_qq")
  private Long leadsQq = null;

  @SerializedName("leads_wechat")
  private String leadsWechat = null;

  @SerializedName("click_id")
  private String clickId = null;

  @SerializedName("leads_type")
  private LeadCluesLeadsType leadsType = null;

  @SerializedName("leads_user_id")
  private String leadsUserId = null;

  @SerializedName("leads_user_type")
  private LeadsUserType leadsUserType = null;

  @SerializedName("leads_user_wechat_appid")
  private String leadsUserWechatAppid = null;

  @SerializedName("leads_action_time")
  private String leadsActionTime = null;

  @SerializedName("leads_name")
  private String leadsName = null;

  @SerializedName("leads_gender")
  private LeadCluesGenderType leadsGender = null;

  @SerializedName("leads_email")
  private String leadsEmail = null;

  @SerializedName("leads_area")
  private String leadsArea = null;

  @SerializedName("bundle")
  private String bundle = null;

  @SerializedName("leads_convert_type")
  private String leadsConvertType = null;

  @SerializedName("leads_ineffect_reason")
  private String leadsIneffectReason = null;

  @SerializedName("outer_leads_convert_type")
  private String outerLeadsConvertType = null;

  @SerializedName("outer_leads_ineffect_reason")
  private String outerLeadsIneffectReason = null;

  @SerializedName("outer_leads_comefrom")
  private OuterLeadsComeFrom outerLeadsComefrom = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("wechat_agency_id")
  private String wechatAgencyId = null;

  @SerializedName("leads_age")
  private String leadsAge = null;

  @SerializedName("leads_id_number")
  private String leadsIdNumber = null;

  @SerializedName("leads_nationality")
  private String leadsNationality = null;

  @SerializedName("leads_address")
  private String leadsAddress = null;

  @SerializedName("leads_company")
  private String leadsCompany = null;

  @SerializedName("leads_profession")
  private String leadsProfession = null;

  @SerializedName("leads_working_years")
  private String leadsWorkingYears = null;

  @SerializedName("leads_page_id")
  private String leadsPageId = null;

  @SerializedName("leads_page_name")
  private String leadsPageName = null;

  @SerializedName("leads_page_url")
  private String leadsPageUrl = null;

  public LeadsImportInfoStruct outerLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
    return this;
  }

  /**
   * Get outerLeadsId
   *
   * @return outerLeadsId
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsId() {
    return outerLeadsId;
  }

  public void setOuterLeadsId(String outerLeadsId) {
    this.outerLeadsId = outerLeadsId;
  }

  public LeadsImportInfoStruct leadsId(Long leadsId) {
    this.leadsId = leadsId;
    return this;
  }

  /**
   * Get leadsId
   *
   * @return leadsId
   */
  @ApiModelProperty(value = "")
  public Long getLeadsId() {
    return leadsId;
  }

  public void setLeadsId(Long leadsId) {
    this.leadsId = leadsId;
  }

  public LeadsImportInfoStruct leadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
    return this;
  }

  /**
   * Get leadsTel
   *
   * @return leadsTel
   */
  @ApiModelProperty(value = "")
  public String getLeadsTel() {
    return leadsTel;
  }

  public void setLeadsTel(String leadsTel) {
    this.leadsTel = leadsTel;
  }

  public LeadsImportInfoStruct leadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
    return this;
  }

  /**
   * Get leadsQq
   *
   * @return leadsQq
   */
  @ApiModelProperty(value = "")
  public Long getLeadsQq() {
    return leadsQq;
  }

  public void setLeadsQq(Long leadsQq) {
    this.leadsQq = leadsQq;
  }

  public LeadsImportInfoStruct leadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
    return this;
  }

  /**
   * Get leadsWechat
   *
   * @return leadsWechat
   */
  @ApiModelProperty(value = "")
  public String getLeadsWechat() {
    return leadsWechat;
  }

  public void setLeadsWechat(String leadsWechat) {
    this.leadsWechat = leadsWechat;
  }

  public LeadsImportInfoStruct clickId(String clickId) {
    this.clickId = clickId;
    return this;
  }

  /**
   * Get clickId
   *
   * @return clickId
   */
  @ApiModelProperty(value = "")
  public String getClickId() {
    return clickId;
  }

  public void setClickId(String clickId) {
    this.clickId = clickId;
  }

  public LeadsImportInfoStruct leadsType(LeadCluesLeadsType leadsType) {
    this.leadsType = leadsType;
    return this;
  }

  /**
   * Get leadsType
   *
   * @return leadsType
   */
  @ApiModelProperty(value = "")
  public LeadCluesLeadsType getLeadsType() {
    return leadsType;
  }

  public void setLeadsType(LeadCluesLeadsType leadsType) {
    this.leadsType = leadsType;
  }

  public LeadsImportInfoStruct leadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
    return this;
  }

  /**
   * Get leadsUserId
   *
   * @return leadsUserId
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserId() {
    return leadsUserId;
  }

  public void setLeadsUserId(String leadsUserId) {
    this.leadsUserId = leadsUserId;
  }

  public LeadsImportInfoStruct leadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
    return this;
  }

  /**
   * Get leadsUserType
   *
   * @return leadsUserType
   */
  @ApiModelProperty(value = "")
  public LeadsUserType getLeadsUserType() {
    return leadsUserType;
  }

  public void setLeadsUserType(LeadsUserType leadsUserType) {
    this.leadsUserType = leadsUserType;
  }

  public LeadsImportInfoStruct leadsUserWechatAppid(String leadsUserWechatAppid) {
    this.leadsUserWechatAppid = leadsUserWechatAppid;
    return this;
  }

  /**
   * Get leadsUserWechatAppid
   *
   * @return leadsUserWechatAppid
   */
  @ApiModelProperty(value = "")
  public String getLeadsUserWechatAppid() {
    return leadsUserWechatAppid;
  }

  public void setLeadsUserWechatAppid(String leadsUserWechatAppid) {
    this.leadsUserWechatAppid = leadsUserWechatAppid;
  }

  public LeadsImportInfoStruct leadsActionTime(String leadsActionTime) {
    this.leadsActionTime = leadsActionTime;
    return this;
  }

  /**
   * Get leadsActionTime
   *
   * @return leadsActionTime
   */
  @ApiModelProperty(value = "")
  public String getLeadsActionTime() {
    return leadsActionTime;
  }

  public void setLeadsActionTime(String leadsActionTime) {
    this.leadsActionTime = leadsActionTime;
  }

  public LeadsImportInfoStruct leadsName(String leadsName) {
    this.leadsName = leadsName;
    return this;
  }

  /**
   * Get leadsName
   *
   * @return leadsName
   */
  @ApiModelProperty(value = "")
  public String getLeadsName() {
    return leadsName;
  }

  public void setLeadsName(String leadsName) {
    this.leadsName = leadsName;
  }

  public LeadsImportInfoStruct leadsGender(LeadCluesGenderType leadsGender) {
    this.leadsGender = leadsGender;
    return this;
  }

  /**
   * Get leadsGender
   *
   * @return leadsGender
   */
  @ApiModelProperty(value = "")
  public LeadCluesGenderType getLeadsGender() {
    return leadsGender;
  }

  public void setLeadsGender(LeadCluesGenderType leadsGender) {
    this.leadsGender = leadsGender;
  }

  public LeadsImportInfoStruct leadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
    return this;
  }

  /**
   * Get leadsEmail
   *
   * @return leadsEmail
   */
  @ApiModelProperty(value = "")
  public String getLeadsEmail() {
    return leadsEmail;
  }

  public void setLeadsEmail(String leadsEmail) {
    this.leadsEmail = leadsEmail;
  }

  public LeadsImportInfoStruct leadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
    return this;
  }

  /**
   * Get leadsArea
   *
   * @return leadsArea
   */
  @ApiModelProperty(value = "")
  public String getLeadsArea() {
    return leadsArea;
  }

  public void setLeadsArea(String leadsArea) {
    this.leadsArea = leadsArea;
  }

  public LeadsImportInfoStruct bundle(String bundle) {
    this.bundle = bundle;
    return this;
  }

  /**
   * Get bundle
   *
   * @return bundle
   */
  @ApiModelProperty(value = "")
  public String getBundle() {
    return bundle;
  }

  public void setBundle(String bundle) {
    this.bundle = bundle;
  }

  public LeadsImportInfoStruct leadsConvertType(String leadsConvertType) {
    this.leadsConvertType = leadsConvertType;
    return this;
  }

  /**
   * Get leadsConvertType
   *
   * @return leadsConvertType
   */
  @ApiModelProperty(value = "")
  public String getLeadsConvertType() {
    return leadsConvertType;
  }

  public void setLeadsConvertType(String leadsConvertType) {
    this.leadsConvertType = leadsConvertType;
  }

  public LeadsImportInfoStruct leadsIneffectReason(String leadsIneffectReason) {
    this.leadsIneffectReason = leadsIneffectReason;
    return this;
  }

  /**
   * Get leadsIneffectReason
   *
   * @return leadsIneffectReason
   */
  @ApiModelProperty(value = "")
  public String getLeadsIneffectReason() {
    return leadsIneffectReason;
  }

  public void setLeadsIneffectReason(String leadsIneffectReason) {
    this.leadsIneffectReason = leadsIneffectReason;
  }

  public LeadsImportInfoStruct outerLeadsConvertType(String outerLeadsConvertType) {
    this.outerLeadsConvertType = outerLeadsConvertType;
    return this;
  }

  /**
   * Get outerLeadsConvertType
   *
   * @return outerLeadsConvertType
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsConvertType() {
    return outerLeadsConvertType;
  }

  public void setOuterLeadsConvertType(String outerLeadsConvertType) {
    this.outerLeadsConvertType = outerLeadsConvertType;
  }

  public LeadsImportInfoStruct outerLeadsIneffectReason(String outerLeadsIneffectReason) {
    this.outerLeadsIneffectReason = outerLeadsIneffectReason;
    return this;
  }

  /**
   * Get outerLeadsIneffectReason
   *
   * @return outerLeadsIneffectReason
   */
  @ApiModelProperty(value = "")
  public String getOuterLeadsIneffectReason() {
    return outerLeadsIneffectReason;
  }

  public void setOuterLeadsIneffectReason(String outerLeadsIneffectReason) {
    this.outerLeadsIneffectReason = outerLeadsIneffectReason;
  }

  public LeadsImportInfoStruct outerLeadsComefrom(OuterLeadsComeFrom outerLeadsComefrom) {
    this.outerLeadsComefrom = outerLeadsComefrom;
    return this;
  }

  /**
   * Get outerLeadsComefrom
   *
   * @return outerLeadsComefrom
   */
  @ApiModelProperty(value = "")
  public OuterLeadsComeFrom getOuterLeadsComefrom() {
    return outerLeadsComefrom;
  }

  public void setOuterLeadsComefrom(OuterLeadsComeFrom outerLeadsComefrom) {
    this.outerLeadsComefrom = outerLeadsComefrom;
  }

  public LeadsImportInfoStruct memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   *
   * @return memo
   */
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public LeadsImportInfoStruct wechatAgencyId(String wechatAgencyId) {
    this.wechatAgencyId = wechatAgencyId;
    return this;
  }

  /**
   * Get wechatAgencyId
   *
   * @return wechatAgencyId
   */
  @ApiModelProperty(value = "")
  public String getWechatAgencyId() {
    return wechatAgencyId;
  }

  public void setWechatAgencyId(String wechatAgencyId) {
    this.wechatAgencyId = wechatAgencyId;
  }

  public LeadsImportInfoStruct leadsAge(String leadsAge) {
    this.leadsAge = leadsAge;
    return this;
  }

  /**
   * Get leadsAge
   *
   * @return leadsAge
   */
  @ApiModelProperty(value = "")
  public String getLeadsAge() {
    return leadsAge;
  }

  public void setLeadsAge(String leadsAge) {
    this.leadsAge = leadsAge;
  }

  public LeadsImportInfoStruct leadsIdNumber(String leadsIdNumber) {
    this.leadsIdNumber = leadsIdNumber;
    return this;
  }

  /**
   * Get leadsIdNumber
   *
   * @return leadsIdNumber
   */
  @ApiModelProperty(value = "")
  public String getLeadsIdNumber() {
    return leadsIdNumber;
  }

  public void setLeadsIdNumber(String leadsIdNumber) {
    this.leadsIdNumber = leadsIdNumber;
  }

  public LeadsImportInfoStruct leadsNationality(String leadsNationality) {
    this.leadsNationality = leadsNationality;
    return this;
  }

  /**
   * Get leadsNationality
   *
   * @return leadsNationality
   */
  @ApiModelProperty(value = "")
  public String getLeadsNationality() {
    return leadsNationality;
  }

  public void setLeadsNationality(String leadsNationality) {
    this.leadsNationality = leadsNationality;
  }

  public LeadsImportInfoStruct leadsAddress(String leadsAddress) {
    this.leadsAddress = leadsAddress;
    return this;
  }

  /**
   * Get leadsAddress
   *
   * @return leadsAddress
   */
  @ApiModelProperty(value = "")
  public String getLeadsAddress() {
    return leadsAddress;
  }

  public void setLeadsAddress(String leadsAddress) {
    this.leadsAddress = leadsAddress;
  }

  public LeadsImportInfoStruct leadsCompany(String leadsCompany) {
    this.leadsCompany = leadsCompany;
    return this;
  }

  /**
   * Get leadsCompany
   *
   * @return leadsCompany
   */
  @ApiModelProperty(value = "")
  public String getLeadsCompany() {
    return leadsCompany;
  }

  public void setLeadsCompany(String leadsCompany) {
    this.leadsCompany = leadsCompany;
  }

  public LeadsImportInfoStruct leadsProfession(String leadsProfession) {
    this.leadsProfession = leadsProfession;
    return this;
  }

  /**
   * Get leadsProfession
   *
   * @return leadsProfession
   */
  @ApiModelProperty(value = "")
  public String getLeadsProfession() {
    return leadsProfession;
  }

  public void setLeadsProfession(String leadsProfession) {
    this.leadsProfession = leadsProfession;
  }

  public LeadsImportInfoStruct leadsWorkingYears(String leadsWorkingYears) {
    this.leadsWorkingYears = leadsWorkingYears;
    return this;
  }

  /**
   * Get leadsWorkingYears
   *
   * @return leadsWorkingYears
   */
  @ApiModelProperty(value = "")
  public String getLeadsWorkingYears() {
    return leadsWorkingYears;
  }

  public void setLeadsWorkingYears(String leadsWorkingYears) {
    this.leadsWorkingYears = leadsWorkingYears;
  }

  public LeadsImportInfoStruct leadsPageId(String leadsPageId) {
    this.leadsPageId = leadsPageId;
    return this;
  }

  /**
   * Get leadsPageId
   *
   * @return leadsPageId
   */
  @ApiModelProperty(value = "")
  public String getLeadsPageId() {
    return leadsPageId;
  }

  public void setLeadsPageId(String leadsPageId) {
    this.leadsPageId = leadsPageId;
  }

  public LeadsImportInfoStruct leadsPageName(String leadsPageName) {
    this.leadsPageName = leadsPageName;
    return this;
  }

  /**
   * Get leadsPageName
   *
   * @return leadsPageName
   */
  @ApiModelProperty(value = "")
  public String getLeadsPageName() {
    return leadsPageName;
  }

  public void setLeadsPageName(String leadsPageName) {
    this.leadsPageName = leadsPageName;
  }

  public LeadsImportInfoStruct leadsPageUrl(String leadsPageUrl) {
    this.leadsPageUrl = leadsPageUrl;
    return this;
  }

  /**
   * Get leadsPageUrl
   *
   * @return leadsPageUrl
   */
  @ApiModelProperty(value = "")
  public String getLeadsPageUrl() {
    return leadsPageUrl;
  }

  public void setLeadsPageUrl(String leadsPageUrl) {
    this.leadsPageUrl = leadsPageUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadsImportInfoStruct leadsImportInfoStruct = (LeadsImportInfoStruct) o;
    return Objects.equals(this.outerLeadsId, leadsImportInfoStruct.outerLeadsId)
        && Objects.equals(this.leadsId, leadsImportInfoStruct.leadsId)
        && Objects.equals(this.leadsTel, leadsImportInfoStruct.leadsTel)
        && Objects.equals(this.leadsQq, leadsImportInfoStruct.leadsQq)
        && Objects.equals(this.leadsWechat, leadsImportInfoStruct.leadsWechat)
        && Objects.equals(this.clickId, leadsImportInfoStruct.clickId)
        && Objects.equals(this.leadsType, leadsImportInfoStruct.leadsType)
        && Objects.equals(this.leadsUserId, leadsImportInfoStruct.leadsUserId)
        && Objects.equals(this.leadsUserType, leadsImportInfoStruct.leadsUserType)
        && Objects.equals(this.leadsUserWechatAppid, leadsImportInfoStruct.leadsUserWechatAppid)
        && Objects.equals(this.leadsActionTime, leadsImportInfoStruct.leadsActionTime)
        && Objects.equals(this.leadsName, leadsImportInfoStruct.leadsName)
        && Objects.equals(this.leadsGender, leadsImportInfoStruct.leadsGender)
        && Objects.equals(this.leadsEmail, leadsImportInfoStruct.leadsEmail)
        && Objects.equals(this.leadsArea, leadsImportInfoStruct.leadsArea)
        && Objects.equals(this.bundle, leadsImportInfoStruct.bundle)
        && Objects.equals(this.leadsConvertType, leadsImportInfoStruct.leadsConvertType)
        && Objects.equals(this.leadsIneffectReason, leadsImportInfoStruct.leadsIneffectReason)
        && Objects.equals(this.outerLeadsConvertType, leadsImportInfoStruct.outerLeadsConvertType)
        && Objects.equals(
            this.outerLeadsIneffectReason, leadsImportInfoStruct.outerLeadsIneffectReason)
        && Objects.equals(this.outerLeadsComefrom, leadsImportInfoStruct.outerLeadsComefrom)
        && Objects.equals(this.memo, leadsImportInfoStruct.memo)
        && Objects.equals(this.wechatAgencyId, leadsImportInfoStruct.wechatAgencyId)
        && Objects.equals(this.leadsAge, leadsImportInfoStruct.leadsAge)
        && Objects.equals(this.leadsIdNumber, leadsImportInfoStruct.leadsIdNumber)
        && Objects.equals(this.leadsNationality, leadsImportInfoStruct.leadsNationality)
        && Objects.equals(this.leadsAddress, leadsImportInfoStruct.leadsAddress)
        && Objects.equals(this.leadsCompany, leadsImportInfoStruct.leadsCompany)
        && Objects.equals(this.leadsProfession, leadsImportInfoStruct.leadsProfession)
        && Objects.equals(this.leadsWorkingYears, leadsImportInfoStruct.leadsWorkingYears)
        && Objects.equals(this.leadsPageId, leadsImportInfoStruct.leadsPageId)
        && Objects.equals(this.leadsPageName, leadsImportInfoStruct.leadsPageName)
        && Objects.equals(this.leadsPageUrl, leadsImportInfoStruct.leadsPageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        outerLeadsId,
        leadsId,
        leadsTel,
        leadsQq,
        leadsWechat,
        clickId,
        leadsType,
        leadsUserId,
        leadsUserType,
        leadsUserWechatAppid,
        leadsActionTime,
        leadsName,
        leadsGender,
        leadsEmail,
        leadsArea,
        bundle,
        leadsConvertType,
        leadsIneffectReason,
        outerLeadsConvertType,
        outerLeadsIneffectReason,
        outerLeadsComefrom,
        memo,
        wechatAgencyId,
        leadsAge,
        leadsIdNumber,
        leadsNationality,
        leadsAddress,
        leadsCompany,
        leadsProfession,
        leadsWorkingYears,
        leadsPageId,
        leadsPageName,
        leadsPageUrl);
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
