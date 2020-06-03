package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AudienceGrantRelationsGetResponseData;
import com.tencent.ads.model.SingleFilter;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取人群授权(Audience grant relation)的简单示例
 */
public class GetAudienceGrantRelations {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE_ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
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

  public AudienceGrantRelationsGetResponseData getAudienceGrantRelations() throws Exception {
    AudienceGrantRelationsGetResponseData response = tencentAds.audienceGrantRelations()
        .audienceGrantRelationsGet(ACCOUNT_ID, Arrays.asList(
            new SingleFilter().field("audience_id").operator("IN")
                .values(Arrays.asList(String.valueOf(AUDIENCE_ID)))), null, null,
            Arrays.asList("audience_id", "grant_type", "grant_spec"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetAudienceGrantRelations getAudienceGrantRelations = new GetAudienceGrantRelations();
      getAudienceGrantRelations.init();
      AudienceGrantRelationsGetResponseData response = getAudienceGrantRelations
          .getAudienceGrantRelations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
