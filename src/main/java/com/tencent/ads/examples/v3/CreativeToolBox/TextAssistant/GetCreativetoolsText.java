package com.tencent.ads.examples.v3.CreativeToolBox.TextAssistant;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetCreativetoolsText {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long maxTextLength = null;

  public String keyword = null;

  public List<Long> filtering = null;

  public Long number = null;

  public Long categoryFirstLevel = null;

  public Long categorySecondLevel = null;

  public Long productCatalogId = null;

  public List<String> productOuterIds = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

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
                keyword,
                filtering,
                number,
                categoryFirstLevel,
                categorySecondLevel,
                productCatalogId,
                productOuterIds,
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
