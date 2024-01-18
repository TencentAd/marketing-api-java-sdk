package com.tencent.ads.examples.BasicOperations.ReviewTool;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.MaterialAuditListRequest;

public class ListMaterialAudit {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public MaterialAuditListRequest data = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MaterialAuditListResponseData listMaterialAudit() throws Exception {
    MaterialAuditListResponseData response = tencentAds.materialAudit().materialAuditList(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      ListMaterialAudit listMaterialAudit = new ListMaterialAudit();
      listMaterialAudit.init();
      MaterialAuditListResponseData response = listMaterialAudit.listMaterialAudit();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
