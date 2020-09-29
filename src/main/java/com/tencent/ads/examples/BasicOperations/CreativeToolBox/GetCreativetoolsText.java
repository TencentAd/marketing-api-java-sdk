package com.tencent.ads.examples.BasicOperations.CreativeToolBox;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.List;

public class GetCreativetoolsText {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long maxTextLength = null;

  public Long categoryFirstLevel = null;

  public Long categorySecondLevel = null;

  public String keyword = null;

  public Long filtering = null;

  public Long number = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public CreativetoolsTextGetResponseData getCreativetoolsText() throws Exception {
    CreativetoolsTextGetResponseData response =
        tencentAds
            .creativetoolsText()
            .creativetoolsTextGet(
                accountId,
                maxTextLength,
                categoryFirstLevel,
                categorySecondLevel,
                keyword,
                filtering,
                number,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCreativetoolsText getCreativetoolsText = new GetCreativetoolsText();
      getCreativetoolsText.init();
      CreativetoolsTextGetResponseData response = getCreativetoolsText.getCreativetoolsText();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
