package com.tencent.ads.examples.BasicOperations.LocalBusiness;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import java.io.File;

public class AddWechatAdvertiserLocalBusiness {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public File headImage = null;

  public String name = null;

  public String description = null;

  public String contactPerson = null;

  public String contactPersonMobile = null;

  public String contactPersonCardId = null;

  public String corporation = null;

  public String corporationLicence = null;

  public Long industryId = null;

  public String businessId = null;

  public String contactPersonTele = null;

  public String businessContent = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public WechatAdvertiserLocalBusinessAddResponseData addWechatAdvertiserLocalBusiness()
      throws Exception {
    WechatAdvertiserLocalBusinessAddResponseData response =
        tencentAds
            .wechatAdvertiserLocalBusiness()
            .wechatAdvertiserLocalBusinessAdd(
                headImage,
                name,
                description,
                contactPerson,
                contactPersonMobile,
                contactPersonCardId,
                corporation,
                corporationLicence,
                industryId,
                businessId,
                contactPersonTele,
                businessContent);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddWechatAdvertiserLocalBusiness addWechatAdvertiserLocalBusiness =
          new AddWechatAdvertiserLocalBusiness();
      addWechatAdvertiserLocalBusiness.init();
      WechatAdvertiserLocalBusinessAddResponseData response =
          addWechatAdvertiserLocalBusiness.addWechatAdvertiserLocalBusiness();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
