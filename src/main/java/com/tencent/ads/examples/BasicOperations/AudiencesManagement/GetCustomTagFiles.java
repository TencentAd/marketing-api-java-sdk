package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.CustomTagFilesGetResponseData;
import com.tencent.ads.model.SingleFilter;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取客户标签数据文件(Custom tag file)列表的简单示例
 */
public class GetCustomTagFiles {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR TAG ID
   */
  public Long TAG_ID = 0L;
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

  public CustomTagFilesGetResponseData getCustomTagFiles() throws Exception {
    CustomTagFilesGetResponseData response = tencentAds.customTagFiles()
        .customTagFilesGet(ACCOUNT_ID,
            null, null, null, Arrays
                .asList("tag_id", "custom_tag_file_id", "name", "user_id_type", "operation_type",
                    "open_app_id", "process_status", "process_code", "error_message", "line_count",
                    "valid_line_count", "user_count", "created_time"));
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
