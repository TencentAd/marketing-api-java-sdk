package com.tencent.ads.examples.BasicOperations.Account;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.DateRangeTransaction;
import java.util.List;

public class GetMergeFundTypeFundStatementsDetailed {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String fundType = null;

  public DateRangeTransaction dateRange = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public MergeFundTypeFundStatementsDetailedGetResponseData getMergeFundTypeFundStatementsDetailed()
      throws Exception {
    MergeFundTypeFundStatementsDetailedGetResponseData response =
        tencentAds
            .mergeFundTypeFundStatementsDetailed()
            .mergeFundTypeFundStatementsDetailedGet(
                accountId, fundType, dateRange, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetMergeFundTypeFundStatementsDetailed getMergeFundTypeFundStatementsDetailed =
          new GetMergeFundTypeFundStatementsDetailed();
      getMergeFundTypeFundStatementsDetailed.init();
      MergeFundTypeFundStatementsDetailedGetResponseData response =
          getMergeFundTypeFundStatementsDetailed.getMergeFundTypeFundStatementsDetailed();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
