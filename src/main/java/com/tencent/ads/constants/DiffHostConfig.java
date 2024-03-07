package com.tencent.ads.constants;

import java.util.HashMap;
import java.util.Map;

public class DiffHostConfig {

  private static Map<String, HashMap<String, String>> diffHostMap;

  private static Map<String, HashMap<String, String>> diffHostV3Map;

  static {
    diffHostMap = new HashMap<>();
    HashMap<String, String> asyncTaskFilesApiContainerMap = new HashMap<>();
    asyncTaskFilesApiContainerMap.put("asyncTaskFilesGet", "https://dl.e.qq.com/v1.1");
    diffHostMap.put("AsyncTaskFilesApiContainer", asyncTaskFilesApiContainerMap);
    HashMap<String, String> asyncReportFilesApiContainerMap = new HashMap<>();
    asyncReportFilesApiContainerMap.put("asyncReportFilesGet", "https://dl.e.qq.com/v1.1");
    diffHostMap.put("AsyncReportFilesApiContainer", asyncReportFilesApiContainerMap);
    HashMap<String, String> oauthApiContainerMap = new HashMap<>();
    oauthApiContainerMap.put("oauthToken", "https://api.e.qq.com");
    oauthApiContainerMap.put("oauthAuthorize", "https://developers.e.qq.com");
    diffHostMap.put("OauthApiContainer", oauthApiContainerMap);
    HashMap<String, String> authorizationApiContainerMap = new HashMap<>();
    authorizationApiContainerMap.put("authorizationWechatBind", "https://developers.e.qq.com");
    diffHostMap.put("AuthorizationApiContainer", authorizationApiContainerMap);
  }

  static {
    diffHostV3Map = new HashMap<>();
    HashMap<String, String> asyncTaskFilesApiContainerMap = new HashMap<>();
    asyncTaskFilesApiContainerMap.put("asyncTaskFilesGet", "https://dl.e.qq.com/v3.0");
    diffHostV3Map.put("AsyncTaskFilesApiContainer", asyncTaskFilesApiContainerMap);
    HashMap<String, String> asyncReportFilesApiContainerMap = new HashMap<>();
    asyncReportFilesApiContainerMap.put("asyncReportFilesGet", "https://dl.e.qq.com/v3.0");
    diffHostV3Map.put("AsyncReportFilesApiContainer", asyncReportFilesApiContainerMap);
    HashMap<String, String> oauthApiContainerMap = new HashMap<>();
    oauthApiContainerMap.put("oauthToken", "https://api.e.qq.com");
    oauthApiContainerMap.put("oauthAuthorize", "https://developers.e.qq.com");
    diffHostV3Map.put("OauthApiContainer", oauthApiContainerMap);
    HashMap<String, String> authorizationApiContainerMap = new HashMap<>();
    authorizationApiContainerMap.put("authorizationWechatBind", "https://developers.e.qq.com");
    diffHostV3Map.put("AuthorizationApiContainer", authorizationApiContainerMap);
  }

  public static Map<String, HashMap<String, String>> getDiffHostMap() {
    return diffHostMap;
  }

  public static Map<String, HashMap<String, String>> getDiffHostV3Map() {
    return diffHostV3Map;
  }
}
