package com.tencent.ads.examples.v3.CreativeToolBox.MaterialLabels;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.OrderByStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetMaterialLabels {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long organizationId = null;

  public Long labelId = null;

  public String labelName = null;

  public List<Long> firstLabelLevelIdList = null;

  public List<Long> secondLabelLevelIdList = null;

  public Boolean needCount = null;

  public String businessScenario = null;

  public List<OrderByStruct> orderBy = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public MaterialLabelsGetResponseData getMaterialLabels() throws Exception {
    MaterialLabelsGetResponseData response =
        tencentAds
            .materialLabels()
            .materialLabelsGet(
                accountId,
                organizationId,
                labelId,
                labelName,
                firstLabelLevelIdList,
                secondLabelLevelIdList,
                needCount,
                businessScenario,
                orderBy,
                page,
                pageSize,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetMaterialLabels getMaterialLabels = new GetMaterialLabels();
      getMaterialLabels.init();
      MaterialLabelsGetResponseData response = getMaterialLabels.getMaterialLabels();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
