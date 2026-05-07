package com.tencent.ads.examples.v3.Tools.AssetSimilarityDetail;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetAssetSimilarityDetail {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long organizationId = null;

  public String creativeAssetId = null;

  public String creativeAssetType = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public AssetSimilarityDetailGetResponseData getAssetSimilarityDetail() throws Exception {
    AssetSimilarityDetailGetResponseData response =
        tencentAds
            .assetSimilarityDetail()
            .assetSimilarityDetailGet(
                accountId, organizationId, creativeAssetId, creativeAssetType, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAssetSimilarityDetail getAssetSimilarityDetail = new GetAssetSimilarityDetail();
      getAssetSimilarityDetail.init();
      AssetSimilarityDetailGetResponseData response =
          getAssetSimilarityDetail.getAssetSimilarityDetail();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
