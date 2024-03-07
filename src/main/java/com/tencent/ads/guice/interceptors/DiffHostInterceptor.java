package com.tencent.ads.guice.interceptors;

import com.tencent.ads.TencentAds;
import com.tencent.ads.anno.NeedDiffHost;
import com.tencent.ads.anno.NoInterceptor;
import com.tencent.ads.constants.DiffHostConfig;
import java.util.HashMap;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DiffHostInterceptor implements MethodInterceptor {

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    if (invocation.getMethod().isAnnotationPresent(NoInterceptor.class)) {
      Object ret = invocation.proceed();
      return ret;
    }
    Class keyClass = invocation.getThis().getClass();
    boolean isV3 = keyClass.getName().contains(".v3");
    if (invocation.getMethod().isAnnotationPresent(NeedDiffHost.class)) {
      String className =
          keyClass.getSimpleName().substring(0, keyClass.getSimpleName().indexOf("$"));
      if (isV3) {
        if (DiffHostConfig.getDiffHostV3Map().get(className) != null) {
          HashMap<String, String> map = DiffHostConfig.getDiffHostV3Map().get(className);
          if (map.get(invocation.getMethod().getName()) != null) {
            com.tencent.ads.v3.TencentAds.getInstance()
                .setHost(map.get(invocation.getMethod().getName()));
          }
        }
      } else {
        if (DiffHostConfig.getDiffHostMap().get(className) != null) {
          HashMap<String, String> map = DiffHostConfig.getDiffHostMap().get(className);
          if (map.get(invocation.getMethod().getName()) != null) {
            TencentAds.getInstance().setHost(map.get(invocation.getMethod().getName()));
          }
        }
      }
    }
    Object ret = null;
    try {
      ret = invocation.proceed();
    } finally {
      if (isV3) {
        com.tencent.ads.v3.TencentAds.getInstance()
            .setHost(com.tencent.ads.v3.TencentAds.getInstance().getBasePath());
      } else {
        TencentAds.getInstance().setHost(TencentAds.getInstance().getBasePath());
      }
    }
    return ret;
  }
}
