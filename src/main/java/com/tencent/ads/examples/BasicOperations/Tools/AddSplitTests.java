package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.SplitTestsAddRequest;
import com.tencent.ads.model.SplitTestsAddResponseData;
import java.util.Arrays;
import java.util.UUID;


/*****
 * 本文件提供了一个删除拆分对比实验(Split test)的简单示例
 */
public class AddSplitTests {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR ADGROUP ID 1
   */
  public Long ADGROUP_ID_1 = 0L;
  /**
   * YOUR ADGROUP ID 2
   */
  public Long ADGROUP_ID_2 = 0L;
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

  public SplitTestsAddResponseData addSplitTests() throws Exception {
    SplitTestsAddRequest data = new SplitTestsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.splitTestName("SDK对比实验" + UUID.randomUUID().toString().substring(0, 10));
    data.adgroupIdList(Arrays.asList(ADGROUP_ID_1, ADGROUP_ID_2));
    SplitTestsAddResponseData response = tencentAds.splitTests().splitTestsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddSplitTests addSplitTests = new AddSplitTests();
      addSplitTests.init();
      SplitTestsAddResponseData response = addSplitTests.addSplitTests();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
