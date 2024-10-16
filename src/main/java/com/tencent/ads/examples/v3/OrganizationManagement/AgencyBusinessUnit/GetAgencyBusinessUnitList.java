package com.tencent.ads.examples.v3.OrganizationManagement.AgencyBusinessUnit;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetAgencyBusinessUnitList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long page = null;

  public Long pageSize = null;

  public Long organizationId = null;

  public String businessUnitName = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AgencyBusinessUnitListGetResponseData getAgencyBusinessUnitList() throws Exception {
    AgencyBusinessUnitListGetResponseData response =
        tencentAds
            .agencyBusinessUnitList()
            .agencyBusinessUnitListGet(page, pageSize, organizationId, businessUnitName, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAgencyBusinessUnitList getAgencyBusinessUnitList = new GetAgencyBusinessUnitList();
      getAgencyBusinessUnitList.init();
      AgencyBusinessUnitListGetResponseData response =
          getAgencyBusinessUnitList.getAgencyBusinessUnitList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}