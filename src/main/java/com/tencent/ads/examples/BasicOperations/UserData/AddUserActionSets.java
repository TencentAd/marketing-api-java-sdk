package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AmUserActionSetType;
import com.tencent.ads.model.UserActionSetsAddRequest;
import com.tencent.ads.model.UserActionSetsAddResponseData;
import java.util.UUID;

/*****
 * 本文件提供了一个创建用户行为数据源(User action set)的简单示例
 */
public class AddUserActionSets {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * AmUserActionSetType
   */
  public AmUserActionSetType TYPE = AmUserActionSetType.WEB;
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

  public Long addUserActionSets() throws Exception {
    UserActionSetsAddRequest data = new UserActionSetsAddRequest();
    data.setAccountId(ACCOUNT_ID);
    data.setName("SDK数据源" + UUID.randomUUID().toString().substring(0, 22));
    data.setType(TYPE);
    UserActionSetsAddResponseData response = tencentAds.userActionSets().userActionSetsAdd(data);
    if (response != null) {
      response.getUserActionSetId();
    }
    return null;
  }

  public static void main(String[] args) {
    try {
      AddUserActionSets example = new AddUserActionSets();
      example.init();
      Long id = example.addUserActionSets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
