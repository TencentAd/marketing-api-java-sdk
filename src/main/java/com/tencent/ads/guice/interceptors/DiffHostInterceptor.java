package com.tencent.ads.guice.interceptors;

import com.tencent.ads.TencentAds;
import com.tencent.ads.anno.NeedDiffHost;
import com.tencent.ads.anno.NoInterceptor;
import com.tencent.ads.constants.DiffHostConfig;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import java.util.HashMap;


public class DiffHostInterceptor implements MethodInterceptor {


  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    if (invocation.getMethod().isAnnotationPresent(NoInterceptor.class)) {
      Object ret = invocation.proceed();
      return ret;
    }
    if (invocation.getMethod().isAnnotationPresent(NeedDiffHost.class)) {
      Class keyClass = invocation.getThis().getClass();
      String className = keyClass.getSimpleName()
          .substring(0, keyClass.getSimpleName().indexOf("$"));
      if (DiffHostConfig.getDiffHostMap().get(className) != null) {
        HashMap<String, String> map = DiffHostConfig.getDiffHostMap().get(className);
        if (map.get(invocation.getMethod().getName()) != null) {
          TencentAds.getInstance().setHost(map.get(invocation.getMethod().getName()));
        }
      }
    }
    Object ret = null;
    try {
      ret = invocation.proceed();
    } finally {
      TencentAds.getInstance().setHost(TencentAds.getInstance().getBasePath());
    }
    return ret;
  }
}
