package com.tencent.ads.examples.BasicOperations.Tools;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.SystemStatusGetResponseData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*****
 * 本文件提供了一个获取广告组系统状态(System status)列表的简单示例
 */
public class GetSystemStatus {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR ACCOUNT ID
   */
  public String STATUS_TYPE = "STATUS_TYPE_OCPA_LEARNING";
  /**
   * YOUR ADGROUP ID
   */
  public Long ADGROUP_ID = 0L; // 广告组ID
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

  public SystemStatusGetResponseData getSystemStatus() throws Exception {
    Map<String, Object> statusSpec = new HashMap<>();
    Map<String, Object> adgroupIdList = new HashMap<>();
    adgroupIdList.put("adgroup_id_list", Arrays.asList(ADGROUP_ID));
    statusSpec.put("ocpa_learning_spec", adgroupIdList);
    SystemStatusGetResponseData response = tencentAds.systemStatus()
        .systemStatusGet(ACCOUNT_ID, STATUS_TYPE, statusSpec, null);
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
