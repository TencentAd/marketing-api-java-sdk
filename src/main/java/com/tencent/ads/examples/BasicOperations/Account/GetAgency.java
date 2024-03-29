package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetAgency {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public List<String> fields = null;

  public Long page = null;

  public Long pageSize = null;

  public Long accountId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AgencyGetResponseData getAgency() throws Exception {
    AgencyGetResponseData response =
        tencentAds.agency().agencyGet(fields, page, pageSize, accountId);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAgency getAgency = new GetAgency();
      getAgency.init();
      AgencyGetResponseData response = getAgency.getAgency();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
