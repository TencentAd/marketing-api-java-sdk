package com.tencent.ads.examples.BasicOperations.AudiencesManagement;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.AudienceGrantRelationsAddRequest;
import com.tencent.ads.model.AudienceGrantRelationsAddResponse;
import java.util.Arrays;
import java.util.List;

public class AddAudienceGrantRelations {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public AudienceGrantRelationsAddRequest data = new AudienceGrantRelationsAddRequest();
  public AudienceGrantType grantType = AudienceGrantType.GRANT_TYPE_BUSINESS;
  public Long grantBusinessId = null;
  public AudienceGrantScopeType grantScopeType = AudienceGrantScopeType.BUSINESS;
  public List<String> grantPermissionTypeList = Arrays.asList("GRANT_PERMISSION_TYPE_TARGET");
  public List<Long> audienceIdList = Arrays.asList(0L);

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    data.setGrantType(grantType);

    AudienceGrantRelationsAddGrantToBusinessSpec grantToBusinessSpec =
        new AudienceGrantRelationsAddGrantToBusinessSpec();
    grantToBusinessSpec.setGrantBusinessId(grantBusinessId);
    grantToBusinessSpec.setGrantScopeType(grantScopeType);
    GrantBusinessPermission grantBusinessPermission = new GrantBusinessPermission();
    grantBusinessPermission.setGrantPermissionTypeList(grantPermissionTypeList);
    grantToBusinessSpec.setGrantBusinessPermission(grantBusinessPermission);
    AudienceGrantRelationsAddGrantSpec grantSpec = new AudienceGrantRelationsAddGrantSpec();
    grantSpec.setGrantToBusinessSpec(grantToBusinessSpec);
    data.setGrantSpec(grantSpec);

    data.setAudienceIdList(audienceIdList);
  }

  public AudienceGrantRelationsAddResponse addAudienceGrantRelations() throws Exception {
    AudienceGrantRelationsAddResponse response =
        tencentAds.audienceGrantRelations().audienceGrantRelationsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddAudienceGrantRelations addAudienceGrantRelations = new AddAudienceGrantRelations();
      addAudienceGrantRelations.init();
      AudienceGrantRelationsAddResponse response =
          addAudienceGrantRelations.addAudienceGrantRelations();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
