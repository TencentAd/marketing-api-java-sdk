package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.google.gson.Gson;
import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.PropertiesUserId;
import com.tencent.ads.model.Property;
import com.tencent.ads.model.UserPropertiesAddRequest;
import com.tencent.ads.model.UserPropertiesAddResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*****
 * 本文件提供了一个创建客户标签数据文件(Custom tag file)的简单示例
 */
public class AddUserProperties {

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
   * YOUR WECHAT APP ID
   */
  public String WECHAT_APP_ID = "YOUR WECHAT APP ID"; // 微信APP ID
  /**
   * YOUR USER ID
   */
  public String USER_ID = "YOUR USER ID"; // 为用户分配的唯一ID
  /**
   * YOUR USER WECHAT OPENID
   */
  public String USER_WECHAT_OPENID = "YOUR USER WECHAT OPENID"; // 用户的微信OPENID
  /**
   * YOUR DATA KEY
   */
  public String USER_PROPERTY_DATA_KEY = "YOUR DATA KEY"; // 用户数据键
  /**
   * YOUR DATA VALUE
   */
  public String USER_PROPERTY_DATA_VALUE = "YOUR DATA VALUE"; // 用户数据值
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

  public UserPropertiesAddResponse addUserProperties() throws Exception {
    Gson gson = new Gson();
    UserPropertiesAddRequest data = new UserPropertiesAddRequest();
    Map<String, String> propertyDataMap = new HashMap<>();
    propertyDataMap.put(USER_PROPERTY_DATA_KEY, USER_PROPERTY_DATA_VALUE);
    data.accountId(ACCOUNT_ID);
    data.userPropertySetId(USER_PROPERTY_SET_ID);
    data.wechatAppId(WECHAT_APP_ID);
    data.property(Arrays.asList(new Property().outerUserId(USER_ID)
        .userId(new PropertiesUserId().wechatOpenid(USER_WECHAT_OPENID))
        .propertyData(gson.toJson(propertyDataMap))));
    UserPropertiesAddResponse response = tencentAds.userProperties().userPropertiesAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddUserProperties addUserProperties = new AddUserProperties();
      addUserProperties.init();
      UserPropertiesAddResponse response = addUserProperties.addUserProperties();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
