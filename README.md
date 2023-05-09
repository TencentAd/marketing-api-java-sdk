# Marketing Java SDK
## 概述
腾讯广告 Marketing API(以下简称API) SDK 提供了Token获取、请求封装、响应解释等功能，以本地化方式轻松完成API的调用和结果的获取，旨在帮助开发者快速搭建投放管理系统。
未来还会基于常用的广告投放场景，提供场景化的接口组合及调用封装。

## 使用条件
1. 使用SDK需要首先注册成为腾讯广告开发者，请参考[开发者快速入门文档](https://developers.e.qq.com/docs/start)
2. 使用SDK需要先拥有API的访问权限，所有SDK的使用与应用拥有的权限组相关联
3. Java SDK 需要依赖 JDK 1.7 及以上
4. Maven

## 代码托管
目前marketing-api-java-sdk的源码已经可以在github阅读，欢迎访问：[源码地址](https://github.com/TencentAd/marketing-api-java-sdk)

## 如何安装运行
- 我们推荐用Maven的方式管理我们的Java SDK，可以添加如下XML内容到您项目的pom.xml中
```xml
<dependency>
  <groupId>com.tencent.ads</groupId>
  <artifactId>marketing-api-java-sdk</artifactId>
  <version>1.1.55</version>
</dependency>
```

- 或者您也可以手动下载[Java压缩包文件](https://github.com/TencentAd/marketing-api-java-sdk/archive/v1.1.55.zip)，解压后可以得到一个Java SDK的源码项目。SDK下载地址：[ams-marketing-sdk-java.zip](https://github.com/TencentAd/marketing-api-java-sdk/archive/v1.1.55.zip)

  1. 解压文件，默认解压到目录ams-marketing-sdk-java。
  2. 执行mvn clean install，将包安装到你本地的Maven资源库中。
```bash
cd ams-marketing-sdk-java
mvn clean install
```
  3. 在你的项目的pom.xml中添加刚刚安装的依赖
```xml
        <dependency>
            <groupId>com.tencent.ads</groupId>
            <artifactId>marketing-api-java-sdk</artifactId>
            <version>1.1.55</version>
        </dependency>
```

## 如何使用

SDK数组参数调用的方法名与API接口一一对应，如campaigns/get接口就对应TencentAds.getInstance().campaigns().campaignsGet()方法。

### 获取Access Token
> 注：本示例适用于授权时通过Authorization Code获取Access Token和Refresh Token。

```java
import com.tencent.ads.model.OauthTokenResponseData;

public class Example {

  private static Long clientId = 0L; // 修改为你的clientId
  private static String clientSecret = ""; // 修改为你的clientSecret
  private static String grantType = "authorization_code";
  private static String authorizationCode = "YOUR AUTHORIZATION CODE"; // 修改为你获取到的AUTHORIZATION CODE
  private static String redirectUri = "YOUR REDIRECT URI"; // 修改为你的回调地址

  public static void main(String[] args) {
    TencentAds tencentAds = TencentAds.getInstance();
    tencentAds.init(new ApiContextConfig());
    
    try {
      OauthTokenResponseData responseData = tencentAds.oauth()
          .oauthToken(clientId, clientSecret, grantType, authorizationCode, null, redirectUri);
      if (responseData != null) {
        String accessToken = responseData.getAccessToken();
        System.out.println(accessToken);
        tencentAds.setAccessToken(accessToken);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```
### 设置调用环境、Access Token
```java
    TencentAds tencentAds = TencentAds.getInstance();
    tencentAds.init(new ApiContextConfig("{access-token}", true));
    tencentAds.useSandbox();// 默认访问沙箱环境，如访问正式环境，请调用tencentAds.useProduction();
```
### 调用API接口
```java
import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CampaignsGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 本文件提供了一个获取推广计划(Campaign)列表的简单示例
 **/
public class GetCampaigns {

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

  public CampaignsGetResponseData getCampaigns() throws Exception {
    Long accountId = ACCOUNT_ID;
    List<FilteringStruct> filtering = new ArrayList<>();
    Long page = null;
    Long pageSize = null;
    Boolean isDeleted = null;
    List<String> fields = Arrays
        .asList("campaign_id", "campaign_name");
    FilteringStruct filter = new FilteringStruct().field("promoted_object_type").operator("EQUALS")
        .values(Arrays.asList("PROMOTED_OBJECT_TYPE_APP_IOS"));
    filtering.add(filter);
    CampaignsGetResponseData responseData = tencentAds.campaigns()
        .campaignsGet(accountId, filtering, page, pageSize, isDeleted, fields);
    return responseData;
  }

  public static void main(String[] args) {
    try {
      GetCampaigns getCampaigns = new GetCampaigns();
      getCampaigns.init();
      CampaignsGetResponseData responseData = getCampaigns.getCampaigns();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
```

### 调试和查看API接口日志
```java
TencentAds tencentAds = TencentAds.getInstance();
    tencentAds.init(new ApiContextConfig("{access-token}", true));//第二个参数即为调试参数
// 或者主动设置debug模式
tencentAds.setDebug(true);
```

## 问题建议与反馈
如果您在使用SDK过程中有任何问题与建议，请随时登录[开发者官网](https://developers.e.qq.com/)，点击右下角的"咨询"按钮，与我们的客服支持人员联系

## 后续计划
1. 丰富各类场景示例
2. 推出其他语言的SDK
