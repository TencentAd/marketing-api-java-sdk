package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.DynamicAdTemplatesGetResponseData;
import java.util.Arrays;

/*****
 * 本文件提供了一个获取动态商品模板信息(Dynamic ad template)列表的简单示例
 */
public class GetDynamicAdTemplates {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR PRODUCT CATALOG ID
   */
  public Long PRODUCT_CATALOG_ID = 0L; // 商品库ID
  /**
   * DYNAMIC_TEMPLATE_TYPE
   */
  public String DYNAMIC_TEMPLATE_TYPE = "DYNAMIC_AD_IMAGE_TEMPLATE"; // 动态商品模板类型
  /**
   * DYNAMIC_TEMPLATE_OWNERSHIP
   */
  public String DYNAMIC_TEMPLATE_OWNERSHIP = "PRIVATE_TEMPLATE"; // 动态商品模板所属类型
  /**
   * DYNAMIC_TEMPLATE_WIDTH
   */
  public Long DYNAMIC_TEMPLATE_WIDTH = 1280L; // 动态商品模板宽度
  /**
   * DYNAMIC_TEMPLATE_HEIGHT
   */
  public Long DYNAMIC_TEMPLATE_HEIGHT = 720L; // 动态商品模板高度
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

  public DynamicAdTemplatesGetResponseData getDynamicAdTemplates() throws Exception {
    DynamicAdTemplatesGetResponseData response = tencentAds.dynamicAdTemplates()
        .dynamicAdTemplatesGet(ACCOUNT_ID,
            PRODUCT_CATALOG_ID, DYNAMIC_TEMPLATE_WIDTH, DYNAMIC_TEMPLATE_HEIGHT,
            DYNAMIC_TEMPLATE_TYPE, DYNAMIC_TEMPLATE_OWNERSHIP,
            null, null, null, Arrays.asList("dynamic_ad_template_id", "dynamic_ad_template_name",
                "dynamic_ad_template_type", "product_item_display_quantity",
                "dynamic_ad_template_width", "dynamic_ad_template_height", "image_url",
                "video_url"));
    return response;

  }

  public static void main(String[] args) {
    try {
      GetDynamicAdTemplates getDynamicAdTemplates = new GetDynamicAdTemplates();
      getDynamicAdTemplates.init();
      DynamicAdTemplatesGetResponseData response = getDynamicAdTemplates.getDynamicAdTemplates();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
