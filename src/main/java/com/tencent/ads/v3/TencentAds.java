package com.tencent.ads.v3;

import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.Configuration;
import com.tencent.ads.auth.ApiKeyAuth;
import java.util.HashMap;
import java.util.Map;

/** TencentAds */
public class TencentAds extends CustomApp {

  private static ApiClient defaultApiClient = Configuration.getV3DefaultApiClient();
  private static final String SCHEMA = "https";
  private static final String API_VERSION = "v3.0";
  private static String basePath = "https://api.e.qq.com/v3.0";
  private static final String SDK_VERSION = "1.1.72";
  private String nameService = "";
  private String nameServiceSchema = "https";

  private TencentAds() {}

  public static TencentAds getInstance() {
    return TencentAdsHolder.INSTANCE;
  }

  private static class TencentAdsHolder {

    private static final TencentAds INSTANCE = new TencentAds();
  }

  public void init(ApiContextConfig apiContextConfig) {

    defaultApiClient.initAuthentications();
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
    this.setHost(basePath);
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

  public void setIpPort(String ip, int port, boolean useHttps) {
    if (useHttps) {
      basePath = "https://" + ip + ":" + port + "/" + API_VERSION;
    } else {
      basePath = "http://" + ip + ":" + port + "/" + API_VERSION;
    }
    this.setHost(basePath);
    Map<String, String> monitorHeader = new HashMap<>();
    monitorHeader.put("Host", "api.e.qq.com");
    setHeader(monitorHeader);
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

  /**
   * setAccessToken
   *
   * @param accessTokenValue
   */
  public void setAccessToken(String accessTokenValue) {
    ApiKeyAuth accessToken = (ApiKeyAuth) defaultApiClient.getAuthentication("accessToken");
    accessToken.setApiKey(accessTokenValue);
  }

  /**
   * setConnectTimeout
   *
   * @param timeout 单位毫秒ms
   */
  public void setConnectTimeout(int timeout) {
    defaultApiClient.setConnectTimeout(timeout);
  }

  /**
   * setReadTimeout
   *
   * @param readTimeout 单位毫秒ms
   */
  public void setReadTimeout(int readTimeout) {
    defaultApiClient.setReadTimeout(readTimeout);
  }

  /**
   * setWriteTimeout
   *
   * @param writeTimeout 单位毫秒ms
   */
  public void setWriteTimeout(int writeTimeout) {
    defaultApiClient.setReadTimeout(writeTimeout);
  }

  /**
   * L5配置
   *
   * @param nameService modId:cmdId
   * @param schema http or https
   */
  public void setNameService(String nameService, String schema) {
    this.nameService = nameService;
    this.nameServiceSchema = schema;
  }

  public String getNameService() {
    return nameService;
  }

  public String getNameServiceSchema() {
    return nameServiceSchema;
  }

  public String getApiVersion() {
    return API_VERSION;
  }
}
