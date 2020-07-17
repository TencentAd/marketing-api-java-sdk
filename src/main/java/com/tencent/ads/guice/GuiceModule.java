package com.tencent.ads.guice;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.tencent.ads.anno.AuthInfoAppend;
import com.tencent.ads.anno.NeedDiffHost;
import com.tencent.ads.guice.interceptors.AuthInterceptor;
import com.tencent.ads.guice.interceptors.DiffHostInterceptor;

public class GuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    bindInterceptor(
        Matchers.annotatedWith(AuthInfoAppend.class), Matchers.any(), new AuthInterceptor());
    bindInterceptor(
        Matchers.annotatedWith(NeedDiffHost.class), Matchers.any(), new DiffHostInterceptor());
  }
}
