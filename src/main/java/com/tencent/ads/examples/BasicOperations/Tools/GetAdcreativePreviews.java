package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAdcreativePreviews {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public List<String> fields = Arrays.asList("user_id", "user_id_type");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    String field = "adgroup_id";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    String operator = "EQUALS";
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("YOUR ADGROUP ID");
    filteringStruct.setValues(values);
    filtering.add(filteringStruct);
  }

  public AdcreativePreviewsGetResponseData getAdcreativePreviews() throws Exception {
    AdcreativePreviewsGetResponseData response =
        tencentAds.adcreativePreviews().adcreativePreviewsGet(accountId, filtering, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetAdcreativePreviews getAdcreativePreviews = new GetAdcreativePreviews();
      getAdcreativePreviews.init();
      AdcreativePreviewsGetResponseData response = getAdcreativePreviews.getAdcreativePreviews();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
