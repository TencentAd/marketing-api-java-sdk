package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.StatusSpec;
import java.util.Arrays;
import java.util.List;

public class GetSystemStatus {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String statusType = "STATUS_TYPE_OCPA_LEARNING";

  public StatusSpec statusSpec = new StatusSpec();

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {
    List<Long> adgroupIdList = Arrays.asList(0L);
    OcpaLearningSpec ocpaLearningSpec = new OcpaLearningSpec();
    ocpaLearningSpec.setAdgroupIdList(adgroupIdList);
    statusSpec.setOcpaLearningSpec(ocpaLearningSpec);
  }

  public SystemStatusGetResponseData getSystemStatus() throws Exception {
    SystemStatusGetResponseData response =
        tencentAds.systemStatus().systemStatusGet(accountId, statusType, statusSpec, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetSystemStatus getSystemStatus = new GetSystemStatus();
      getSystemStatus.init();
      SystemStatusGetResponseData response = getSystemStatus.getSystemStatus();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
