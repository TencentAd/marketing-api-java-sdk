package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.SplitTestsAddRequest;
import java.util.Arrays;
import java.util.List;

public class AddSplitTests {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public SplitTestsAddRequest data = new SplitTestsAddRequest();
  public String splitTestName = "SDK对比实验5ede252e3e4d0";
  public List<Long> adgroupIdList = Arrays.asList(0L, 0L);

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setSplitTestName(splitTestName);

    data.setAdgroupIdList(adgroupIdList);
  }

  public SplitTestsAddResponseData addSplitTests() throws Exception {
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
