package com.tencent.ads.constants;


import java.util.HashMap;
import java.util.Map;

public class DiffHostConfig {


  private static Map<String, HashMap<String, String>> diffHostMap;

  static {
    diffHostMap = new HashMap<>();
    HashMap<String, String> asyncTaskFilesApiContainerMap = new HashMap<>();
    asyncTaskFilesApiContainerMap.put("asyncTaskFilesGet", "https://dl.e.qq.com/v1.1");
    diffHostMap.put("AsyncTaskFilesApiContainer", asyncTaskFilesApiContainerMap);
    HashMap<String, String> oauthApiContainerMap = new HashMap<>();
    oauthApiContainerMap.put("oauthToken", "https://api.e.qq.com");
    oauthApiContainerMap.put("oauthAuthorize", "https://developers.e.qq.com");
    diffHostMap.put("OauthApiContainer", oauthApiContainerMap);
    HashMap<String, String> authorizationApiContainerMap = new HashMap<>();
    authorizationApiContainerMap.put("authorizationWechatBind", "https://developers.e.qq.com");
    diffHostMap.put("AuthorizationApiContainer", authorizationApiContainerMap);

  }

  public static Map<String, HashMap<String, String>> getDiffHostMap() {
    return diffHostMap;
  }

}
