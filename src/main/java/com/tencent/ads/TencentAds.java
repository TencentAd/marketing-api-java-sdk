package com.tencent.ads;

import com.tencent.ads.auth.ApiKeyAuth;
import java.util.HashMap;
import java.util.Map;

/** */
public class TencentAds extends CustomApp {

  private static ApiClient defaultApiClient = Configuration.getDefaultApiClient();

  private static final String SCHEMA = "https";
  private static final String API_VERSION = "v1.3";

  private static String basePath = "https://sandbox-api.e.qq.com/v1.3";

  private static final String SDK_VERSION = "1.1.2";

  private TencentAds() {}

  public static TencentAds getInstance() {
    return TencentAdsHolder.INSTANCE;
  }

  private static class TencentAdsHolder {

    private static final TencentAds INSTANCE = new TencentAds();
  }

  public void init(ApiContextConfig apiContextConfig) {

    if (apiContextConfig == null) {
      return;
    }
    if (apiContextConfig.getAccessToken() != null
        && !apiContextConfig.getAccessToken().equals("")) {
      ApiKeyAuth accessToken = (ApiKeyAuth) defaultApiClient.getAuthentication("accessToken");
      accessToken.setApiKey(apiContextConfig.getAccessToken());
    }
    defaultApiClient.setDebugging(apiContextConfig.isDebug());
    this.addDefaultHeader();
  }

  public void setDebug(boolean isDebug) {
    defaultApiClient.setDebugging(isDebug);
  }

  public void setApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }

  public String getBasePath() {
    return basePath;
  }

  public void setHost(String host) {
    defaultApiClient.setBasePath(host);
  }

  public void useSandbox() {
    basePath = "https://sandbox-api.e.qq.com/v1.3";
    this.setHost(basePath);
  }

  public void useProduction() {
    basePath = "https://api.e.qq.com/v1.3";
    this.setHost(basePath);
  }

  public void setIpPort(String ip, int port) {
    basePath = SCHEMA + "://" + ip + ":" + port + "/" + API_VERSION;
    this.setHost(basePath);
  }

  public void setHeader(Map<String, String> headerMap) {
    if (headerMap == null) {
      return;
    }
    for (Map.Entry<String, String> entry : headerMap.entrySet()) {
      defaultApiClient.addDefaultHeader(entry.getKey(), entry.getValue());
    }
  }

  private void addDefaultHeader() {
    Map<String, String> monitorHeader = new HashMap<>();
    String javaVersion = System.getProperty("java.version");
    String os = System.getProperty("os.name");
    monitorHeader.put("X-SDK-LANGUAGE", "JAVA");
    monitorHeader.put(
        "X-SDK-LANGUAGE-VERSION",
        (javaVersion == null || "".equals(javaVersion.trim())) ? "unknown" : javaVersion);
    monitorHeader.put("X-SDK-VERSION", SDK_VERSION);
    monitorHeader.put("X-SDK-OS", (os == null || "".equals(os.trim())) ? "unknown" : os);
    this.setHeader(monitorHeader);
  }

  public void setAccessToken(String accessTokenValue) {
    ApiKeyAuth accessToken = (ApiKeyAuth) defaultApiClient.getAuthentication("accessToken");
    accessToken.setApiKey(accessTokenValue);
  }
}
