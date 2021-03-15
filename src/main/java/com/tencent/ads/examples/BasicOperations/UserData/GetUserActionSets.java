package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetUserActionSets {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long userActionSetId = null;

  public List<String> type = null;

  public Long mobileAppId = null;

  public String wechatAppId = null;

  public String name = null;

  public Boolean includePermission = null;

  public List<String> fields =
      Arrays.asList(
          "user_action_set_id",
          "type",
          "mobile_app_id",
          "name",
          "description",
          "activate_status",
          "created_time");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public UserActionSetsGetResponseData getUserActionSets() throws Exception {
    UserActionSetsGetResponseData response =
        tencentAds
            .userActionSets()
            .userActionSetsGet(
                accountId,
                userActionSetId,
                type,
                mobileAppId,
                wechatAppId,
                name,
                includePermission,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetUserActionSets getUserActionSets = new GetUserActionSets();
      getUserActionSets.init();
      UserActionSetsGetResponseData response = getUserActionSets.getUserActionSets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
