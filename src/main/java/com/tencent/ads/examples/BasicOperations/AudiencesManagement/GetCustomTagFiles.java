package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import java.util.Arrays;
import java.util.List;

public class GetCustomTagFiles {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "tag_id",
          "custom_tag_file_id",
          "name",
          "user_id_type",
          "operation_type",
          "open_app_id",
          "process_status",
          "process_code",
          "error_message",
          "line_count",
          "valid_line_count",
          "user_count",
          "created_time");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomTagFilesGetResponseData getCustomTagFiles() throws Exception {
    CustomTagFilesGetResponseData response =
        tencentAds.customTagFiles().customTagFilesGet(accountId, filtering, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomTagFiles getCustomTagFiles = new GetCustomTagFiles();
      getCustomTagFiles.init();
      CustomTagFilesGetResponseData response = getCustomTagFiles.getCustomTagFiles();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
