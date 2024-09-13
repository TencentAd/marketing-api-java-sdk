package com.tencent.ads.examples.v3.BusinessAssets.Image;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.v3.*;
import com.tencent.ads.model.v3.FilteringStruct;
import com.tencent.ads.v3.TencentAds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetImages {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public Long organizationId = null;

  public List<FilteringStruct> filtering = new ArrayList<>();

  public Long page = null;

  public Long pageSize = null;

  public Long labelId = null;

  public Long businessScenario = null;

  public List<String> fields =
      Arrays.asList(
          "image_id",
          "width",
          "height",
          "file_size",
          "type",
          "signature",
          "source_signature",
          "preview_url",
          "source_type",
          "created_time",
          "last_modified_time");

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    String field = "image_id";
    FilteringStruct filteringStruct = new FilteringStruct();
    filteringStruct.setField(field);
    FilterOperator operator = FilterOperator.EQUALS;
    filteringStruct.setOperator(operator);
    List<String> values = Arrays.asList("YOUR IMAGE ID");
    filteringStruct.setValues(values);
    filtering.add(filteringStruct);
  }

  public ImagesGetResponseData getImages() throws Exception {
    ImagesGetResponseData response =
        tencentAds
            .images()
            .imagesGet(
                accountId,
                organizationId,
                filtering,
                page,
                pageSize,
                labelId,
                businessScenario,
                fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetImages getImages = new GetImages();
      getImages.init();
      ImagesGetResponseData response = getImages.getImages();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
