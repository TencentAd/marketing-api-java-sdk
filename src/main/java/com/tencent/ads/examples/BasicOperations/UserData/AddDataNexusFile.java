package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.FileExtraInfo;
import com.tencent.ads.model.SchemeCol;
import com.tencent.ads.model.SelectScene;
import java.io.File;
import java.util.List;

public class AddDataNexusFile {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;

  public String fileName = null;

  public String fileDesc = null;

  public File file = null;

  public List<SchemeCol> schemaDefine = null;

  public List<SelectScene> scenes = null;

  public FileExtraInfo extraInfo = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息
    this.tencentAds.useSandbox(); // 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
    this.buildParams();
  }

  public void buildParams() {}

  public DataNexusFileAddResponseData addDataNexusFile() throws Exception {
    DataNexusFileAddResponseData response =
        tencentAds
            .dataNexusFile()
            .dataNexusFileAdd(accountId, fileName, fileDesc, file, schemaDefine, scenes, extraInfo);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddDataNexusFile addDataNexusFile = new AddDataNexusFile();
      addDataNexusFile.init();
      DataNexusFileAddResponseData response = addDataNexusFile.addDataNexusFile();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
