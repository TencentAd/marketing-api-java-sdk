package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.SplitTestsDeleteRequest;

public class DeleteSplitTests {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public SplitTestsDeleteRequest data = new SplitTestsDeleteRequest();
  public Long splitTestId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setSplitTestId(splitTestId);
  }

  public SplitTestsDeleteResponseData deleteSplitTests() throws Exception {
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
