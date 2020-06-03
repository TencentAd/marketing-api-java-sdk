package com.tencent.ads.examples.BasicOperations.UserData;

import com.tencent.ads.ApiContextConfig;
import com.tencent.ads.TencentAds;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.exception.TencentAdsSDKException;
import com.tencent.ads.model.ActionType;
import com.tencent.ads.model.ActionsUserId;
import com.tencent.ads.model.UserAction;
import com.tencent.ads.model.UserActionsAddRequest;
import com.tencent.ads.model.UserActionsAddResponse;
import java.util.ArrayList;
import java.util.List;

/*****
 * 本文件提供了一个创建用户行为数据(User action)的简单示例
 */
public class AddUserActions {

  /**
   * YOUR ACCESS TOKEN
   */
  public String ACCESS_TOKEN = "YOUR ACCESS TOKEN";
  /**
   * YOUR ACCOUNT ID
   */
  public Long ACCOUNT_ID = 0L;
  /**
   * YOUR USER ACTION SET ID
   */
  public Long USER_ACTION_SET_ID = 0L; // 数据源ID
  /**
   * YOUR USER IMEI
   */
  public String USER_HASH_IMEI = ""; // 用户IMEI
  /**
   * 自定义行为
   */
  public ActionType USER_ACTION_TYPE = ActionType.CUSTOM; // 自定义行为
  /**
   * 自定义行为类型
   */
  public String USER_CUSTOM_ACTION = ""; // 自定义行为类型
  /**
   * TencentAds
   */
  public TencentAds tencentAds;

  public void init() {
    this.tencentAds = TencentAds.getInstance();
    this.tencentAds.init(
        new ApiContextConfig().accessToken(ACCESS_TOKEN).isDebug(true));// debug==true 会打印请求详细信息
    this.tencentAds.useSandbox();// 默认使用沙箱环境，如果要请求线上，这里需要设为线上环境
  }

  public boolean addUserActionSets() throws Exception {
    UserActionsAddRequest userActionsAddRequest = new UserActionsAddRequest();
    userActionsAddRequest.accountId(ACCOUNT_ID);
    userActionsAddRequest.setUserActionSetId(USER_ACTION_SET_ID);
    List<UserAction> actions = new ArrayList<>();
    UserAction action = new UserAction().actionTime(System.currentTimeMillis() / 1000)
        .actionType(USER_ACTION_TYPE).customAction(USER_CUSTOM_ACTION)
        .userId(new ActionsUserId().hashImei(USER_HASH_IMEI));
    actions.add(action);
    userActionsAddRequest.setActions(actions);
    UserActionsAddResponse response = tencentAds.userActions()
        .userActionsAdd(userActionsAddRequest);

    return true;
  }

  public static void main(String[] args) {
    try {
      AddUserActions example = new AddUserActions();
      example.init();
      example.addUserActionSets();
    } catch (TencentAdsResponseException e) {
      e.printStackTrace();
    } catch (TencentAdsSDKException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
