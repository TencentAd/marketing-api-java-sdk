package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.UserPropertySetsUpdateRequest;
import com.tencent.ads.model.UserPropertySetsUpdateResponse;

/*****
 * 本文件提供了一个更新用户属性数据源(User property set)的简单示例
 */
public class UpdateUserPropertySets {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR USER PROPERTY SET ID
   */
  public Long USER_PROPERTY_SET_ID = 0L; // 数据源ID
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

  public UserPropertySetsUpdateResponse updateUserPropertySets() throws Exception {
    UserPropertySetsUpdateRequest data = new UserPropertySetsUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.userPropertySetId(USER_PROPERTY_SET_ID);
    data.description("SDK sample updated");
    UserPropertySetsUpdateResponse response = tencentAds.userPropertySets()
        .userPropertySetsUpdate(data);
    return response;

  }

  public static void main(String[] args) {
    try {
      UpdateUserPropertySets updateUserPropertySets = new UpdateUserPropertySets();
      updateUserPropertySets.init();
      UserPropertySetsUpdateResponse response = updateUserPropertySets.updateUserPropertySets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
