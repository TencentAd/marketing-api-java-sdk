package com.tencent.ads.examples.v3.SearchAdsManagement.SearchAdgroups;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.SearchAdgroupsAddRequest;
import com.tencent.ads.v3.TencentAds;

public class AddSearchAdgroups {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public SearchAdgroupsAddRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public SearchAdgroupsAddResponseData addSearchAdgroups() throws Exception {
    SearchAdgroupsAddResponseData response = tencentAds.searchAdgroups().searchAdgroupsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddSearchAdgroups addSearchAdgroups = new AddSearchAdgroups();
      addSearchAdgroups.init();
      SearchAdgroupsAddResponseData response = addSearchAdgroups.addSearchAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
