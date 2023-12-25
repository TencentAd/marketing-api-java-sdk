package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.util.Arrays;
import java.util.List;

public class GetCustomTags {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long parentTagId = null;

  public Long tagId = null;

  public String tagCode = null;

  public String platform = null;

  public Long page = null;

  public Long pageSize = null;

  public List<String> fields =
      Arrays.asList(
          "tag_id",
          "parent_tag_id",
          "name",
          "description",
          "tag_code",
          "user_count",
          "created_time");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public CustomTagsGetResponseData getCustomTags() throws Exception {
    CustomTagsGetResponseData response =
        tencentAds
            .customTags()
            .customTagsGet(
                accountId, parentTagId, tagId, tagCode, platform, page, pageSize, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetCustomTags getCustomTags = new GetCustomTags();
      getCustomTags.init();
      CustomTagsGetResponseData response = getCustomTags.getCustomTags();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
