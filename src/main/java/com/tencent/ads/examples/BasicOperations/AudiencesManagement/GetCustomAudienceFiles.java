package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomAudienceFilesGetResponseData;
import java.util.Arrays;

public class GetCustomAudienceFiles {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR AUDIENCE_ID
   */
  public Long AUDIENCE_ID = 0L; // 人群ID
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

  public CustomAudienceFilesGetResponseData getCustomAudienceFiles() throws Exception {
    CustomAudienceFilesGetResponseData response = tencentAds.customAudienceFiles()
        .customAudienceFilesGet(ACCOUNT_ID, AUDIENCE_ID,
            null, null, null, Arrays
                .asList("audience_id", "custom_audience_file_id", "name", "user_id_type",
                    "operation_type", "open_app_id", "salt_id", "process_status", "process_code",
                    "error_message", "line_count", "valid_line_count", "user_count", "size",
                    "created_time"));

    return response;

  }

  public static void main(String[] args) {
    try {
      GetCustomAudienceFiles getCustomAudienceFiles = new GetCustomAudienceFiles();
      getCustomAudienceFiles.init();
      CustomAudienceFilesGetResponseData response = getCustomAudienceFiles.getCustomAudienceFiles();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
