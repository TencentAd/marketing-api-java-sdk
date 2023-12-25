package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.SplitTestsUpdateRequest;

public class UpdateSplitTests {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public SplitTestsUpdateRequest data = new SplitTestsUpdateRequest();
  public SplitTestStatus splitTestStatus = SplitTestStatus.SUSPEND;
  public Long splitTestId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setSplitTestStatus(splitTestStatus);

    data.setSplitTestId(splitTestId);
  }

  public SplitTestsUpdateResponseData updateSplitTests() throws Exception {
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
