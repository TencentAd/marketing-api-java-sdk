package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.UserPropertiesAddRequest;
import com.tencent.ads.model.UserPropertiesAddResponse;
import java.util.ArrayList;
import java.util.List;

public class AddUserProperties {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public String wechatAppId = "YOUR WECHAT APP ID";
  public UserPropertiesAddRequest data = new UserPropertiesAddRequest();
  public Long accountId = null;
  public String outerUserId = "YOUR USER ID";
  public String wechatOpenid = "YOUR USER WECHAT OPENID";
  public String propertyData = "{\"YOUR DATA KEY\":\"YOUR DATA VALUE\"}";
  public Long userPropertySetId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    data.setWechatAppId(wechatAppId);

    data.setAccountId(accountId);

    UserPropertiesAddProperty userPropertiesAddProperty = new UserPropertiesAddProperty();
    userPropertiesAddProperty.setOuterUserId(outerUserId);
    PropertiesUserId userId = new PropertiesUserId();
    userId.setWechatOpenid(wechatOpenid);
    userPropertiesAddProperty.setUserId(userId);
    userPropertiesAddProperty.setPropertyData(propertyData);
    List<UserPropertiesAddProperty> property = new ArrayList<>();
    property.add(userPropertiesAddProperty);
    data.setProperty(property);

    data.setUserPropertySetId(userPropertySetId);
  }

  public UserPropertiesAddResponse addUserProperties() throws Exception {
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
