package com.tencent.ads.examples.v3.BusinessAssets.Pages;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetXijingTemplateList {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String pageTemplateId = null;

  public Boolean isInteraction = null;

  public Boolean isPublic = null;

  public String templateSource = null;

  public Long pageSize = null;

  public Long page = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public XijingTemplateListGetResponseData getXijingTemplateList() throws Exception {
    XijingTemplateListGetResponseData response =
        tencentAds
            .xijingTemplateList()
            .xijingTemplateListGet(
                accountId,
                pageTemplateId,
                isInteraction,
                isPublic,
                templateSource,
                pageSize,
                page,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetXijingTemplateList getXijingTemplateList = new GetXijingTemplateList();
      getXijingTemplateList.init();
      XijingTemplateListGetResponseData response = getXijingTemplateList.getXijingTemplateList();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
