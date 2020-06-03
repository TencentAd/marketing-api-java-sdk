package com.tencent.ads.exception;


public class TencentAdsResponseException extends RuntimeException {

  private Long code;
  private String message;
  private String messageCn;

  public TencentAdsResponseException(String message) {
    this(null, message, "");
  }

  public TencentAdsResponseException(Long code) {
    this(code, "", "");
  }

  public TencentAdsResponseException(Long code, String message, String messageCn) {
    this.code = code;
    this.message = message;
    this.messageCn = messageCn;
  }

  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
  }
}
