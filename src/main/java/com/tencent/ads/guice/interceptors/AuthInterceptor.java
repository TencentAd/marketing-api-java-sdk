package com.tencent.ads.guice.interceptors;

import com.tencent.ads.ApiClient;
import com.tencent.ads.Configuration;
import com.tencent.ads.anno.NoInterceptor;
import com.tencent.ads.auth.ApiKeyAuth;
import com.tencent.ads.utils.DigestUtils;
import java.util.UUID;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuthInterceptor implements MethodInterceptor {

  private static ApiClient defaultApiClient = Configuration.getDefaultApiClient();

  private static ApiClient v3DefaultApiClient = Configuration.getV3DefaultApiClient();

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    if (invocation.getMethod().isAnnotationPresent(NoInterceptor.class)) {
      Object ret = invocation.proceed();
      return ret;
    }
    Class keyClass = invocation.getThis().getClass();
    boolean isV3 = keyClass.getName().contains(".v3");
    if (isV3) {
      ApiKeyAuth nonce = (ApiKeyAuth) v3DefaultApiClient.getAuthentication("nonce");
      nonce.setApiKey(DigestUtils.encrypt(UUID.randomUUID().toString()));
      ApiKeyAuth timestamp = (ApiKeyAuth) v3DefaultApiClient.getAuthentication("timestamp");
      timestamp.setApiKey(String.valueOf(System.currentTimeMillis() / 1000));
    } else {
      ApiKeyAuth nonce = (ApiKeyAuth) defaultApiClient.getAuthentication("nonce");
      nonce.setApiKey(DigestUtils.encrypt(UUID.randomUUID().toString()));
      ApiKeyAuth timestamp = (ApiKeyAuth) defaultApiClient.getAuthentication("timestamp");
      timestamp.setApiKey(String.valueOf(System.currentTimeMillis() / 1000));
    }

    Object ret = invocation.proceed();
    return ret;
  }
}
