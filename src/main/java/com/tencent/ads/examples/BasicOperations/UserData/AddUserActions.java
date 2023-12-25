package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.*;
import com.tencent.ads.model.UserActionsAddRequest;
import com.tencent.ads.model.UserActionsAddResponse;
import java.util.ArrayList;
import java.util.List;

public class AddUserActions {
  /** YOUR ACCESS TOKEN */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";

  /** TencentAds */
  public TencentAds tencentAds;

  public Long accountId = null;
  public UserActionsAddRequest data = new UserActionsAddRequest();
  public Long actionTime = 1591616815L;
  public String hashImei = "YOUR USER IMEI";
  public ActionType actionType = ActionType.CUSTOM;
  public String customAction = "YOUR CUSTOM ACTION TYPE";
  public Long userActionSetId = null;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true)); // debug==true 会打印请求详细信息

    this.buildParams();
  }

  public void buildParams() {
    data.setAccountId(accountId);

    UserAction userAction = new UserAction();
    userAction.setActionTime(actionTime);
    ActionsUserId userId = new ActionsUserId();
    userId.setHashImei(hashImei);
    userAction.setUserId(userId);
    userAction.setActionType(actionType);
    userAction.setCustomAction(customAction);
    List<UserAction> actions = new ArrayList<>();
    actions.add(userAction);
    data.setActions(actions);

    data.setUserActionSetId(userActionSetId);
  }

  public UserActionsAddResponse addUserActions() throws Exception {
    UserActionsAddResponse response = tencentAds.userActions().userActionsAdd(data);
    return response;
  }

  public static void main(String[] args) {
    try {
      AddUserActions addUserActions = new AddUserActions();
      addUserActions.init();
      UserActionsAddResponse response = addUserActions.addUserActions();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
