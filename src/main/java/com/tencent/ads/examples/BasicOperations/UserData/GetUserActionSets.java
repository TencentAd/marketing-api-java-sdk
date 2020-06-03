package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.UserActionSet;
import com.tencent.ads.model.UserActionSetsGetResponseData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*****
 * 本文件提供了一个获取用户行为数据源(User action set)列表的简单示例
 */
public class GetUserActionSets {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public List<UserActionSet> getUserActionSets() throws Exception {

    List<String> fields = Arrays
        .asList("user_action_set_id", "type", "mobile_app_id", "name", "description",
            "activate_status", "created_time");
    UserActionSetsGetResponseData response = this.tencentAds.userActionSets()
        .userActionSetsGet(ACCOUNT_ID, null, fields);
    if (response != null) {
      return response.getList();
    }
    return Collections.emptyList();
  }

  public static void main(String[] args) {
    try {
      GetUserActionSets example = new GetUserActionSets();
      example.init();
      List<UserActionSet> usaList = example.getUserActionSets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
