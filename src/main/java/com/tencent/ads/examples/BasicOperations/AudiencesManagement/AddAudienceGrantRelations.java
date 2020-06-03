package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.AudienceGrantRelationsAddRequest;
import com.tencent.ads.model.AudienceGrantRelationsAddResponse;
import com.tencent.ads.model.AudienceGrantScopeType;
import com.tencent.ads.model.AudienceGrantType;
import com.tencent.ads.model.GrantBusinessPermission;
import com.tencent.ads.model.GrantSpec;
import com.tencent.ads.model.GrantToBusinessSpec;
import java.util.Arrays;


/*****
 * 本文件提供了一个创建人群授权(Audience grant relation)的简单示例
 */
public class AddAudienceGrantRelations {

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
   * GRANT_SCOPE_TYPE
   */
  public AudienceGrantScopeType GRANT_SCOPE_TYPE = AudienceGrantScopeType.BUSINESS; // 人群授权给商务管家账号认领的所有广告账号
  /**
   * GRANT_PERMISSION_TYPE
   */
  public String GRANT_PERMISSION_TYPE = "GRANT_PERMISSION_TYPE_TARGET"; // 广告投放权限
  /**
   * GRANT_BUSINESS_ID
   */
  public Long GRANT_BUSINESS_ID = 0L; // 商务管家账号
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

  public AudienceGrantRelationsAddResponse addAudienceGrantRelations() throws Exception {
    AudienceGrantRelationsAddRequest data = new AudienceGrantRelationsAddRequest();
    data.accountId(ACCOUNT_ID);
    data.audienceIdList(Arrays.asList(AUDIENCE_ID));
    data.grantType(AudienceGrantType.GRANT_TYPE_BUSINESS);
    data.grantSpec(new GrantSpec().grantToBusinessSpec(
        new GrantToBusinessSpec().grantBusinessId(GRANT_BUSINESS_ID)
            .grantScopeType(GRANT_SCOPE_TYPE).grantBusinessPermission(new GrantBusinessPermission()
            .grantPermissionTypeList(Arrays.asList(GRANT_PERMISSION_TYPE)))));

    AudienceGrantRelationsAddResponse response = tencentAds.audienceGrantRelations()
        .audienceGrantRelationsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAudienceGrantRelations addAudienceGrantRelations = new AddAudienceGrantRelations();
      addAudienceGrantRelations.init();
      AudienceGrantRelationsAddResponse response = addAudienceGrantRelations
          .addAudienceGrantRelations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
