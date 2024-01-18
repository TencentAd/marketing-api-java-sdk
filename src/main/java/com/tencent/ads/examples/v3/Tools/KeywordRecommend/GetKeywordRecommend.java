package com.tencent.ads.examples.v3.Tools.KeywordRecommend;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.OrderByStructInfo;
import com.tencent.ads.v3.TencentAds;
import java.util.List;

public class GetKeywordRecommend {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public List<String> siteSets = null;

  public String recommendCategory = null;

  public Long accountId = null;

  public Long systemIndustryId = null;

  public List<String> queryWord = null;

  public String businessPointId = null;

  public Long adgroupId = null;

  public Long campaignId = null;

  public List<String> includeWord = null;

  public List<String> excludeWord = null;

  public Boolean filterAdWord = null;

  public Boolean filterAccountWord = null;

  public List<String> recommendReasons = null;

  public List<Long> province = null;

  public List<Long> city = null;

  public List<OrderByStructInfo> orderBy = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public KeywordRecommendGetResponseData getKeywordRecommend() throws Exception {
    KeywordRecommendGetResponseData response =
        tencentAds
            .keywordRecommend()
            .keywordRecommendGet(
                siteSets,
                recommendCategory,
                accountId,
                systemIndustryId,
                queryWord,
                businessPointId,
                adgroupId,
                campaignId,
                includeWord,
                excludeWord,
                filterAdWord,
                filterAccountWord,
                recommendReasons,
                province,
                city,
                orderBy,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetKeywordRecommend getKeywordRecommend = new GetKeywordRecommend();
      getKeywordRecommend.init();
      KeywordRecommendGetResponseData response = getKeywordRecommend.getKeywordRecommend();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
