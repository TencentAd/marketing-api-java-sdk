package com.tencent.ads.exception;

public class TencentAdsSDKException extends RuntimeException {

  private String message;

  public TencentAdsSDKException(String message) {

    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
