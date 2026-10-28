package com.tencent.ads.examples.BasicOperations.BusinessAssets;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.OrderByStruct;
import java.util.List;

public class GetContractPromotedObjects {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public List<FilteringStruct> filtering = null;

  public Long page = null;

  public Long pageSize = null;

  public List<OrderByStruct> orderBy = null;

  public List<String> fields = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {}

  public ContractPromotedObjectsGetResponseData getContractPromotedObjects() throws Exception {
    ContractPromotedObjectsGetResponseData response =
        tencentAds
            .contractPromotedObjects()
            .contractPromotedObjectsGet(accountId, filtering, page, pageSize, orderBy, fields);
    return response;
  }

  public static void main(String[] args) {
    try {
      GetContractPromotedObjects getContractPromotedObjects = new GetContractPromotedObjects();
      getContractPromotedObjects.init();
      ContractPromotedObjectsGetResponseData response =
          getContractPromotedObjects.getContractPromotedObjects();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
