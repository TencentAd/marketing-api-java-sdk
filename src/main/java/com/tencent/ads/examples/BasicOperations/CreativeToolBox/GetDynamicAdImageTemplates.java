package com.tencent.ads.examples.BasicOperations.CreativeToolBox;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;

public class GetDynamicAdImageTemplates {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long productCatalogId = null;

  public String productMode = null;

  public Long dynamicAdTemplateWidth = null;

  public Long dynamicAdTemplateHeight = null;

  public String dynamicAdTemplateOwnershipType = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<Long> templateIdList = null;

  public String templateName = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public DynamicAdImageTemplatesGetResponseData getDynamicAdImageTemplates() throws Exception {
    DynamicAdImageTemplatesGetResponseData response =
        tencentAds
            .dynamicAdImageTemplates()
            .dynamicAdImageTemplatesGet(
                accountId,
                productCatalogId,
                productMode,
                dynamicAdTemplateWidth,
                dynamicAdTemplateHeight,
                dynamicAdTemplateOwnershipType,
                filtering,
                page,
                pageSize,
                templateIdList,
                templateName,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetDynamicAdImageTemplates getDynamicAdImageTemplates = new GetDynamicAdImageTemplates();
      getDynamicAdImageTemplates.init();
      DynamicAdImageTemplatesGetResponseData response =
          getDynamicAdImageTemplates.getDynamicAdImageTemplates();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
