package com.tencent.ads;

import com.google.inject.Inject;
import com.tencent.ads.tools.RapidAdsContainer;

public class CustomApp extends App {
  @Inject RapidAdsContainer rapidAddAdsContainer;

  public RapidAdsContainer rapidAds() {
    return rapidAddAdsContainer;
  }
}
