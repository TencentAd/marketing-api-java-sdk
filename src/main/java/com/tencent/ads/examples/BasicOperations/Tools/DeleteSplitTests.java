package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.SplitTestsDeleteRequest;
import com.tencent.ads.model.SplitTestsDeleteResponseData;

/*****
 * 本文件提供了一个删除拆分对比实验(Split test)的简单示例
 */
public class DeleteSplitTests {

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

  public SplitTestsDeleteResponseData deleteSplitTests() throws Exception {
    SplitTestsDeleteRequest data = new SplitTestsDeleteRequest();
    data.accountId(ACCOUNT_ID);
    data.setSplitTestId(SPLIT_TEST_ID);
    SplitTestsDeleteResponseData response = tencentAds.splitTests().splitTestsDelete(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      DeleteSplitTests deleteSplitTests = new DeleteSplitTests();
      deleteSplitTests.init();
      SplitTestsDeleteResponseData response = deleteSplitTests.deleteSplitTests();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}