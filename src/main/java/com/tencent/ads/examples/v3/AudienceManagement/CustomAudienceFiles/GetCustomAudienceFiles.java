package com.tencent.ads.examples.v3.AudienceManagement.CustomAudienceFiles;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.v3.TencentAds;
import java.util.Arrays;
import java.util.List;

public class GetCustomAudienceFiles {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long audienceId = null;

  public Long customAudienceFileId = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "audience_id",
          "custom_audience_file_id",
          "name",
          "user_id_type",
          "operation_type",
          "open_app_id",
          "salt_id",
          "process_status",
          "process_code",
          "error_message",
          "line_count",
          "valid_line_count",
          "user_count",
          "size",
          "created_time");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomAudienceFilesGetResponseData getCustomAudienceFiles() throws Exception {
    CustomAudienceFilesGetResponseData response =
        tencentAds
            .customAudienceFiles()
            .customAudienceFilesGet(
                accountId, audienceId, customAudienceFileId, page, pageSize, fields);
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
