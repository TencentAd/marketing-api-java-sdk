package com.tencent.ads;

public class ApiContextConfig {

  private String accessToken;
  private boolean isDebug;
  private String userToken;

  public ApiContextConfig() {}

  public ApiContextConfig(String accessToken) {
    this.accessToken = accessToken;
  }

  public ApiContextConfig(String accessToken, boolean isDebug) {
    this.accessToken = accessToken;
    this.isDebug = isDebug;
  }

  public ApiContextConfig accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public ApiContextConfig isDebug(boolean isDebug) {
    this.isDebug = isDebug;
    return this;
  }

  public ApiContextConfig userToken(String userToken) {
    this.userToken = userToken;
    return this;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public boolean isDebug() {
    return isDebug;
  }

  public void setDebug(boolean debug) {
    isDebug = debug;
  }

  public String getUserToken() {
    return userToken;
  }

  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }
}
