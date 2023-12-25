package com.tencent.ads.examples.BasicOperations.Adsmanagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAdgroups {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public Long page = null;

  public Long pageSize = null;

  public Boolean isDeleted = null;

  public Boolean weixinOfficialAccountsUpgradeEnabled = null;

  public List<String> fields = Arrays.asList("adgroup_id", "campaign_id", "adgroup_name");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    String field = "promoted_object_type";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    String operator = "EQUALS";
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("PROMOTED_OBJECT_TYPE_APP_IOS");
    filteringStruct.setValues(values);
    filtering.add(filteringStruct);
  }

  public AdgroupsGetResponseData getAdgroups() throws Exception {
    AdgroupsGetResponseData response =
        tencentAds
            .adgroups()
            .adgroupsGet(
                accountId,
                filtering,
                page,
                pageSize,
                isDeleted,
                weixinOfficialAccountsUpgradeEnabled,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdgroups getAdgroups = new GetAdgroups();
      getAdgroups.init();
      AdgroupsGetResponseData response = getAdgroups.getAdgroups();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
