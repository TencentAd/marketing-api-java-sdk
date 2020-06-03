package com.tencent.ads;


import com.google.gson.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.tencent.ads.anno.AuthInfoAppend;
import com.tencent.ads.anno.NoInterceptor;
import com.tencent.ads.exception.TencentAdsResponseException;

@Singleton
@AuthInfoAppend
public class ApiContainer {

  @Inject
  protected Gson gson;

  @NoInterceptor
  protected void handleResponse(String toJson) {
    JsonElement jsonElement = new JsonParser().parse(toJson);
    if (!jsonElement.isJsonObject()) {
      return;
    }
    JsonObject jo = jsonElement.getAsJsonObject();
    JsonPrimitive ret = jo.getAsJsonPrimitive("code");
    if (ret == null) {
      throw new TencentAdsResponseException("No code field in api response");
    } else if (ret.getAsLong() != 0) {
      JsonPrimitive message = jo.getAsJsonPrimitive("message");
      JsonPrimitive messageCn = jo.getAsJsonPrimitive("message_cn");
      String messageS = message == null ? "" : message.getAsString();
      String messageCnS = messageCn == null ? "" : messageCn.getAsString();
      throw new TencentAdsResponseException(ret.getAsLong(), messageS, messageCnS);
    }
  }
}
