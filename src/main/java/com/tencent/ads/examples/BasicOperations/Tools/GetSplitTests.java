package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.SplitTestsGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取拆分对比实验(Split test)列表的简单示例
 */
public class GetSplitTests {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
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

  public SplitTestsGetResponseData getSplitTests() throws Exception {
    SplitTestsGetResponseData response = tencentAds.splitTests()
        .splitTestsGet(ACCOUNT_ID, null, null, null, Arrays
            .asList("account_id", "split_test_id", "split_test_status", "split_test_name",
                "begin_time",
                "end_time", "smart_expand_enabled", "adgroup_id_list", "recommended_rating",
                "recommended_adgroup_id_list"));

    return response;
  }

  public static void main(String[] args) {
    try {
      GetSplitTests getSplitTests = new GetSplitTests();
      getSplitTests.init();
      SplitTestsGetResponseData response = getSplitTests.getSplitTests();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
