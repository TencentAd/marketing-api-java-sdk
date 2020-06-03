package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.SplitTestStatus;
import com.tencent.ads.model.SplitTestsUpdateRequest;
import com.tencent.ads.model.SplitTestsUpdateResponseData;

/*****
 * 本文件提供了一个更新拆分对比实验(Split test)的简单示例
 */
public class UpdateSplitTests {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR SPLIT TEST ID
   */
  public Long SPLIT_TEST_ID = 0L; // 拆分实验ID
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

  public SplitTestsUpdateResponseData updateSplitTests() throws Exception {
    SplitTestsUpdateRequest data = new SplitTestsUpdateRequest();
    data.accountId(ACCOUNT_ID);
    data.splitTestId(SPLIT_TEST_ID);
    data.splitTestStatus(SplitTestStatus.SUSPEND);
    SplitTestsUpdateResponseData response = tencentAds.splitTests().splitTestsUpdate(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      UpdateSplitTests updateSplitTests = new UpdateSplitTests();
      updateSplitTests.init();
      SplitTestsUpdateResponseData response = updateSplitTests.updateSplitTests();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
