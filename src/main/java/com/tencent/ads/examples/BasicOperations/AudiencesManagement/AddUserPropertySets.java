package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.UserPropertySetsAddRequest;
import com.tencent.ads.model.UserPropertySetsAddResponseData;
import java.util.UUID;

/*****
 * 本文件提供了一个创建用户属性数据源(User property set)的简单示例
 */
public class AddUserPropertySets {

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

  public UserPropertySetsAddResponseData addUserPropertySets() throws Exception {
    UserPropertySetsAddRequest data = new UserPropertySetsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.name("SDK属性" + UUID.randomUUID().toString().substring(0, 10));

    UserPropertySetsAddResponseData response = tencentAds.userPropertySets()
        .userPropertySetsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddUserPropertySets addUserPropertySets = new AddUserPropertySets();
      addUserPropertySets.init();
      UserPropertySetsAddResponseData response = addUserPropertySets.addUserPropertySets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
