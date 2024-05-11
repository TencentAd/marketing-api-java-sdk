/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.v3;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.tencent.ads.container.v3.*;
import com.tencent.ads.guice.GuiceModule;

public class App {

  @Inject AccountVersionApiContainer accountVersionApiContainer;
  @Inject AdLabelApiContainer adLabelApiContainer;
  @Inject AdParamApiContainer adParamApiContainer;
  @Inject AdUnionReportsApiContainer adUnionReportsApiContainer;
  @Inject AdcreativePreviewsApiContainer adcreativePreviewsApiContainer;
  @Inject AdcreativePreviewsQrcodeApiContainer adcreativePreviewsQrcodeApiContainer;
  @Inject AdgroupNegativewordsApiContainer adgroupNegativewordsApiContainer;
  @Inject AdgroupsApiContainer adgroupsApiContainer;
  @Inject AdvertiserApiContainer advertiserApiContainer;
  @Inject AdvertiserDailyBudgetApiContainer advertiserDailyBudgetApiContainer;
  @Inject AgencyApiContainer agencyApiContainer;
  @Inject AgencyRealtimeCostApiContainer agencyRealtimeCostApiContainer;
  @Inject AndroidChannelApiContainer androidChannelApiContainer;
  @Inject AsyncReportFilesApiContainer asyncReportFilesApiContainer;
  @Inject AsyncReportsApiContainer asyncReportsApiContainer;
  @Inject AsyncTasksApiContainer asyncTasksApiContainer;
  @Inject AudienceGrantRelationsApiContainer audienceGrantRelationsApiContainer;
  @Inject BarrageApiContainer barrageApiContainer;
  @Inject BarrageRecommendApiContainer barrageRecommendApiContainer;
  @Inject BatchAsyncRequestSpecificationApiContainer batchAsyncRequestSpecificationApiContainer;
  @Inject BatchAsyncRequestsApiContainer batchAsyncRequestsApiContainer;
  @Inject BatchRequestsApiContainer batchRequestsApiContainer;
  @Inject BidSimulationApiContainer bidSimulationApiContainer;
  @Inject BidwordApiContainer bidwordApiContainer;
  @Inject BidwordFlowApiContainer bidwordFlowApiContainer;
  @Inject BrandApiContainer brandApiContainer;
  @Inject BusinessPointApiContainer businessPointApiContainer;
  @Inject CommentListApiContainer commentListApiContainer;
  @Inject ComponentElementUrgeReviewApiContainer componentElementUrgeReviewApiContainer;
  @Inject ComponentReviewResultsApiContainer componentReviewResultsApiContainer;
  @Inject ConversionsApiContainer conversionsApiContainer;
  @Inject CreativeTemplateApiContainer creativeTemplateApiContainer;
  @Inject CreativeTemplateListApiContainer creativeTemplateListApiContainer;
  @Inject CreativeTemplatePreviewsApiContainer creativeTemplatePreviewsApiContainer;
  @Inject CreativetoolsTextApiContainer creativetoolsTextApiContainer;
  @Inject CustomAudienceEstimationsApiContainer customAudienceEstimationsApiContainer;
  @Inject CustomAudienceFilesApiContainer customAudienceFilesApiContainer;
  @Inject CustomAudiencesApiContainer customAudiencesApiContainer;
  @Inject DailyBalanceReportApiContainer dailyBalanceReportApiContainer;
  @Inject DailyReportsApiContainer dailyReportsApiContainer;
  @Inject DataSourceDispatchApiContainer dataSourceDispatchApiContainer;
  @Inject DynamicAdImageTemplatesApiContainer dynamicAdImageTemplatesApiContainer;
  @Inject DynamicAdImagesApiContainer dynamicAdImagesApiContainer;
  @Inject DynamicAdVideoApiContainer dynamicAdVideoApiContainer;
  @Inject DynamicAdVideoTemplatesApiContainer dynamicAdVideoTemplatesApiContainer;
  @Inject DynamicCreativeReviewResultsApiContainer dynamicCreativeReviewResultsApiContainer;
  @Inject DynamicCreativesApiContainer dynamicCreativesApiContainer;
  @Inject EcommerceOrderApiContainer ecommerceOrderApiContainer;
  @Inject ElementAppealQuotaApiContainer elementAppealQuotaApiContainer;
  @Inject ElementAppealReviewApiContainer elementAppealReviewApiContainer;
  @Inject EstimationApiContainer estimationApiContainer;
  @Inject ExtendPackageApiContainer extendPackageApiContainer;
  @Inject FinderAdObjectListApiContainer finderAdObjectListApiContainer;
  @Inject FundStatementsDetailedApiContainer fundStatementsDetailedApiContainer;
  @Inject FundTransferApiContainer fundTransferApiContainer;
  @Inject FundsApiContainer fundsApiContainer;
  @Inject GameFeatureApiContainer gameFeatureApiContainer;
  @Inject GameFeatureTagsApiContainer gameFeatureTagsApiContainer;
  @Inject GetWxGameAppGiftPackApiContainer getWxGameAppGiftPackApiContainer;
  @Inject HourlyReportsApiContainer hourlyReportsApiContainer;
  @Inject ImageProcessingApiContainer imageProcessingApiContainer;
  @Inject ImagesApiContainer imagesApiContainer;
  @Inject JointBudgetRulesApiContainer jointBudgetRulesApiContainer;
  @Inject KeywordRecommendApiContainer keywordRecommendApiContainer;
  @Inject LabelsApiContainer labelsApiContainer;
  @Inject LandingPageSellStrategyApiContainer landingPageSellStrategyApiContainer;
  @Inject LeadsApiContainer leadsApiContainer;
  @Inject LeadsActionTypeReportApiContainer leadsActionTypeReportApiContainer;
  @Inject LeadsCallRecordApiContainer leadsCallRecordApiContainer;
  @Inject LeadsCallRecordsApiContainer leadsCallRecordsApiContainer;
  @Inject LeadsCallVirtualNumberApiContainer leadsCallVirtualNumberApiContainer;
  @Inject LeadsClaimApiContainer leadsClaimApiContainer;
  @Inject LeadsInvalidPayApiContainer leadsInvalidPayApiContainer;
  @Inject LeadsListApiContainer leadsListApiContainer;
  @Inject LeadsStatusApiContainer leadsStatusApiContainer;
  @Inject LeadsVoipCallApiContainer leadsVoipCallApiContainer;
  @Inject LeadsVoipCallTokenApiContainer leadsVoipCallTokenApiContainer;
  @Inject LiveRoomComponentStatusApiContainer liveRoomComponentStatusApiContainer;
  @Inject LiveRoomComponentsApiContainer liveRoomComponentsApiContainer;
  @Inject LocalStorePackagesApiContainer localStorePackagesApiContainer;
  @Inject LocalStoresApiContainer localStoresApiContainer;
  @Inject LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResultApiContainer;
  @Inject LocalStoresCategoriesApiContainer localStoresCategoriesApiContainer;
  @Inject LocalStoresSearchInfoApiContainer localStoresSearchInfoApiContainer;
  @Inject LocalStoresWxpayMerchantsApiContainer localStoresWxpayMerchantsApiContainer;
  @Inject MarketingRulesApiContainer marketingRulesApiContainer;
  @Inject MarketingTargetAssetCategoriesApiContainer marketingTargetAssetCategoriesApiContainer;
  @Inject MarketingTargetAssetDetailApiContainer marketingTargetAssetDetailApiContainer;
  @Inject MarketingTargetAssetPropertiesApiContainer marketingTargetAssetPropertiesApiContainer;

  @Inject
  MarketingTargetAssetPropertyValuesApiContainer marketingTargetAssetPropertyValuesApiContainer;

  @Inject MarketingTargetAssetsApiContainer marketingTargetAssetsApiContainer;
  @Inject MarketingTargetTypesApiContainer marketingTargetTypesApiContainer;
  @Inject MaterialDcatagApiContainer materialDcatagApiContainer;
  @Inject MaterialLabelsApiContainer materialLabelsApiContainer;
  @Inject MergeFundTypeDailyBalanceReportApiContainer mergeFundTypeDailyBalanceReportApiContainer;

  @Inject
  MergeFundTypeFundStatementsDetailedApiContainer mergeFundTypeFundStatementsDetailedApiContainer;

  @Inject MergeFundTypeFundsApiContainer mergeFundTypeFundsApiContainer;
  @Inject MergeFundTypeSubcustomerTransferApiContainer mergeFundTypeSubcustomerTransferApiContainer;
  @Inject MuseAiMaterialApiContainer museAiMaterialApiContainer;
  @Inject MuseAiTaskApiContainer museAiTaskApiContainer;
  @Inject OauthApiContainer oauthApiContainer;
  @Inject ObjectCommentFlagApiContainer objectCommentFlagApiContainer;
  @Inject OptimizationGoalPermissionsApiContainer optimizationGoalPermissionsApiContainer;
  @Inject OrganizationAccountRelationApiContainer organizationAccountRelationApiContainer;
  @Inject PagesApiContainer pagesApiContainer;
  @Inject ProductCatalogsApiContainer productCatalogsApiContainer;
  @Inject ProductCategoriesListApiContainer productCategoriesListApiContainer;
  @Inject ProductItemsApiContainer productItemsApiContainer;
  @Inject ProductItemsDetailApiContainer productItemsDetailApiContainer;
  @Inject ProductItemsVerticalsApiContainer productItemsVerticalsApiContainer;
  @Inject ProductSeriesApiContainer productSeriesApiContainer;
  @Inject ProductsSystemStatusApiContainer productsSystemStatusApiContainer;
  @Inject ProfilesApiContainer profilesApiContainer;
  @Inject ProgrammedApiContainer programmedApiContainer;
  @Inject ProgrammedMaterialMappingsApiContainer programmedMaterialMappingsApiContainer;
  @Inject ProgrammedTemplateApiContainer programmedTemplateApiContainer;
  @Inject QualificationStructureApiContainer qualificationStructureApiContainer;
  @Inject QualificationsApiContainer qualificationsApiContainer;
  @Inject RealtimeCostApiContainer realtimeCostApiContainer;
  @Inject ReviewElementPrereviewResultsApiContainer reviewElementPrereviewResultsApiContainer;
  @Inject RtaInfoApiContainer rtaInfoApiContainer;
  @Inject RtaexpApiContainer rtaexpApiContainer;
  @Inject RtaexpDataRoiApiContainer rtaexpDataRoiApiContainer;
  @Inject RtaexpDspTagDataApiContainer rtaexpDspTagDataApiContainer;
  @Inject RtatargetApiContainer rtatargetApiContainer;
  @Inject RtatargetBindApiContainer rtatargetBindApiContainer;
  @Inject SceneSpecTagsApiContainer sceneSpecTagsApiContainer;
  @Inject SubcustomerTransferApiContainer subcustomerTransferApiContainer;
  @Inject TargetingTagReportsApiContainer targetingTagReportsApiContainer;
  @Inject TargetingTagsApiContainer targetingTagsApiContainer;
  @Inject TargetingTagsUvApiContainer targetingTagsUvApiContainer;
  @Inject TargetingsApiContainer targetingsApiContainer;
  @Inject UnionPositionPackagesApiContainer unionPositionPackagesApiContainer;
  @Inject UserActionSetReportsApiContainer userActionSetReportsApiContainer;
  @Inject UserActionSetsApiContainer userActionSetsApiContainer;
  @Inject UserActionsApiContainer userActionsApiContainer;
  @Inject VideoChannelDealerDataApiContainer videoChannelDealerDataApiContainer;
  @Inject VideoChannelFansDataApiContainer videoChannelFansDataApiContainer;
  @Inject VideoChannelLeadsDataApiContainer videoChannelLeadsDataApiContainer;
  @Inject VideoChannelLiveDataApiContainer videoChannelLiveDataApiContainer;
  @Inject VideosApiContainer videosApiContainer;
  @Inject WechatChannelsAccountsApiContainer wechatChannelsAccountsApiContainer;
  @Inject WechatChannelsAdAccountApiContainer wechatChannelsAdAccountApiContainer;

  @Inject
  WechatChannelsAdAccountCertificationFileApiContainer
      wechatChannelsAdAccountCertificationFileApiContainer;

  @Inject
  WechatChannelsAdAccountValidationApiContainer wechatChannelsAdAccountValidationApiContainer;

  @Inject
  WechatChannelsAdAccountWechatBindingApiContainer wechatChannelsAdAccountWechatBindingApiContainer;

  @Inject WechatChannelsAuthorizationApiContainer wechatChannelsAuthorizationApiContainer;
  @Inject WechatOfficialAccountsApiContainer wechatOfficialAccountsApiContainer;
  @Inject WechatPagesApiContainer wechatPagesApiContainer;
  @Inject WechatPagesCsgroupStatusApiContainer wechatPagesCsgroupStatusApiContainer;
  @Inject WechatPagesCsgroupUserApiContainer wechatPagesCsgroupUserApiContainer;
  @Inject WechatPagesCsgrouplistApiContainer wechatPagesCsgrouplistApiContainer;
  @Inject WechatPagesCustomApiContainer wechatPagesCustomApiContainer;
  @Inject WechatPagesGrantinfoApiContainer wechatPagesGrantinfoApiContainer;
  @Inject WildcardsApiContainer wildcardsApiContainer;
  @Inject WxPackageAccountApiContainer wxPackageAccountApiContainer;
  @Inject WxPackagePackageApiContainer wxPackagePackageApiContainer;
  @Inject XijingComplexTemplateApiContainer xijingComplexTemplateApiContainer;
  @Inject XijingPageApiContainer xijingPageApiContainer;
  @Inject XijingPageByComponentsApiContainer xijingPageByComponentsApiContainer;
  @Inject XijingPageInteractiveApiContainer xijingPageInteractiveApiContainer;
  @Inject XijingPageListApiContainer xijingPageListApiContainer;
  @Inject XijingTemplateApiContainer xijingTemplateApiContainer;
  @Inject XijingTemplateListApiContainer xijingTemplateListApiContainer;

  public App() {
    Guice.createInjector(new GuiceModule()).injectMembers(this);
  }

  public AccountVersionApiContainer accountVersion() {
    return accountVersionApiContainer;
  }

  public AdLabelApiContainer adLabel() {
    return adLabelApiContainer;
  }

  public AdParamApiContainer adParam() {
    return adParamApiContainer;
  }

  public AdUnionReportsApiContainer adUnionReports() {
    return adUnionReportsApiContainer;
  }

  public AdcreativePreviewsApiContainer adcreativePreviews() {
    return adcreativePreviewsApiContainer;
  }

  public AdcreativePreviewsQrcodeApiContainer adcreativePreviewsQrcode() {
    return adcreativePreviewsQrcodeApiContainer;
  }

  public AdgroupNegativewordsApiContainer adgroupNegativewords() {
    return adgroupNegativewordsApiContainer;
  }

  public AdgroupsApiContainer adgroups() {
    return adgroupsApiContainer;
  }

  public AdvertiserApiContainer advertiser() {
    return advertiserApiContainer;
  }

  public AdvertiserDailyBudgetApiContainer advertiserDailyBudget() {
    return advertiserDailyBudgetApiContainer;
  }

  public AgencyApiContainer agency() {
    return agencyApiContainer;
  }

  public AgencyRealtimeCostApiContainer agencyRealtimeCost() {
    return agencyRealtimeCostApiContainer;
  }

  public AndroidChannelApiContainer androidChannel() {
    return androidChannelApiContainer;
  }

  public AsyncReportFilesApiContainer asyncReportFiles() {
    return asyncReportFilesApiContainer;
  }

  public AsyncReportsApiContainer asyncReports() {
    return asyncReportsApiContainer;
  }

  public AsyncTasksApiContainer asyncTasks() {
    return asyncTasksApiContainer;
  }

  public AudienceGrantRelationsApiContainer audienceGrantRelations() {
    return audienceGrantRelationsApiContainer;
  }

  public BarrageApiContainer barrage() {
    return barrageApiContainer;
  }

  public BarrageRecommendApiContainer barrageRecommend() {
    return barrageRecommendApiContainer;
  }

  public BatchAsyncRequestSpecificationApiContainer batchAsyncRequestSpecification() {
    return batchAsyncRequestSpecificationApiContainer;
  }

  public BatchAsyncRequestsApiContainer batchAsyncRequests() {
    return batchAsyncRequestsApiContainer;
  }

  public BatchRequestsApiContainer batchRequests() {
    return batchRequestsApiContainer;
  }

  public BidSimulationApiContainer bidSimulation() {
    return bidSimulationApiContainer;
  }

  public BidwordApiContainer bidword() {
    return bidwordApiContainer;
  }

  public BidwordFlowApiContainer bidwordFlow() {
    return bidwordFlowApiContainer;
  }

  public BrandApiContainer brand() {
    return brandApiContainer;
  }

  public BusinessPointApiContainer businessPoint() {
    return businessPointApiContainer;
  }

  public CommentListApiContainer commentList() {
    return commentListApiContainer;
  }

  public ComponentElementUrgeReviewApiContainer componentElementUrgeReview() {
    return componentElementUrgeReviewApiContainer;
  }

  public ComponentReviewResultsApiContainer componentReviewResults() {
    return componentReviewResultsApiContainer;
  }

  public ConversionsApiContainer conversions() {
    return conversionsApiContainer;
  }

  public CreativeTemplateApiContainer creativeTemplate() {
    return creativeTemplateApiContainer;
  }

  public CreativeTemplateListApiContainer creativeTemplateList() {
    return creativeTemplateListApiContainer;
  }

  public CreativeTemplatePreviewsApiContainer creativeTemplatePreviews() {
    return creativeTemplatePreviewsApiContainer;
  }

  public CreativetoolsTextApiContainer creativetoolsText() {
    return creativetoolsTextApiContainer;
  }

  public CustomAudienceEstimationsApiContainer customAudienceEstimations() {
    return customAudienceEstimationsApiContainer;
  }

  public CustomAudienceFilesApiContainer customAudienceFiles() {
    return customAudienceFilesApiContainer;
  }

  public CustomAudiencesApiContainer customAudiences() {
    return customAudiencesApiContainer;
  }

  public DailyBalanceReportApiContainer dailyBalanceReport() {
    return dailyBalanceReportApiContainer;
  }

  public DailyReportsApiContainer dailyReports() {
    return dailyReportsApiContainer;
  }

  public DataSourceDispatchApiContainer dataSourceDispatch() {
    return dataSourceDispatchApiContainer;
  }

  public DynamicAdImageTemplatesApiContainer dynamicAdImageTemplates() {
    return dynamicAdImageTemplatesApiContainer;
  }

  public DynamicAdImagesApiContainer dynamicAdImages() {
    return dynamicAdImagesApiContainer;
  }

  public DynamicAdVideoApiContainer dynamicAdVideo() {
    return dynamicAdVideoApiContainer;
  }

  public DynamicAdVideoTemplatesApiContainer dynamicAdVideoTemplates() {
    return dynamicAdVideoTemplatesApiContainer;
  }

  public DynamicCreativeReviewResultsApiContainer dynamicCreativeReviewResults() {
    return dynamicCreativeReviewResultsApiContainer;
  }

  public DynamicCreativesApiContainer dynamicCreatives() {
    return dynamicCreativesApiContainer;
  }

  public EcommerceOrderApiContainer ecommerceOrder() {
    return ecommerceOrderApiContainer;
  }

  public ElementAppealQuotaApiContainer elementAppealQuota() {
    return elementAppealQuotaApiContainer;
  }

  public ElementAppealReviewApiContainer elementAppealReview() {
    return elementAppealReviewApiContainer;
  }

  public EstimationApiContainer estimation() {
    return estimationApiContainer;
  }

  public ExtendPackageApiContainer extendPackage() {
    return extendPackageApiContainer;
  }

  public FinderAdObjectListApiContainer finderAdObjectList() {
    return finderAdObjectListApiContainer;
  }

  public FundStatementsDetailedApiContainer fundStatementsDetailed() {
    return fundStatementsDetailedApiContainer;
  }

  public FundTransferApiContainer fundTransfer() {
    return fundTransferApiContainer;
  }

  public FundsApiContainer funds() {
    return fundsApiContainer;
  }

  public GameFeatureApiContainer gameFeature() {
    return gameFeatureApiContainer;
  }

  public GameFeatureTagsApiContainer gameFeatureTags() {
    return gameFeatureTagsApiContainer;
  }

  public GetWxGameAppGiftPackApiContainer getWxGameAppGiftPack() {
    return getWxGameAppGiftPackApiContainer;
  }

  public HourlyReportsApiContainer hourlyReports() {
    return hourlyReportsApiContainer;
  }

  public ImageProcessingApiContainer imageProcessing() {
    return imageProcessingApiContainer;
  }

  public ImagesApiContainer images() {
    return imagesApiContainer;
  }

  public JointBudgetRulesApiContainer jointBudgetRules() {
    return jointBudgetRulesApiContainer;
  }

  public KeywordRecommendApiContainer keywordRecommend() {
    return keywordRecommendApiContainer;
  }

  public LabelsApiContainer labels() {
    return labelsApiContainer;
  }

  public LandingPageSellStrategyApiContainer landingPageSellStrategy() {
    return landingPageSellStrategyApiContainer;
  }

  public LeadsApiContainer leads() {
    return leadsApiContainer;
  }

  public LeadsActionTypeReportApiContainer leadsActionTypeReport() {
    return leadsActionTypeReportApiContainer;
  }

  public LeadsCallRecordApiContainer leadsCallRecord() {
    return leadsCallRecordApiContainer;
  }

  public LeadsCallRecordsApiContainer leadsCallRecords() {
    return leadsCallRecordsApiContainer;
  }

  public LeadsCallVirtualNumberApiContainer leadsCallVirtualNumber() {
    return leadsCallVirtualNumberApiContainer;
  }

  public LeadsClaimApiContainer leadsClaim() {
    return leadsClaimApiContainer;
  }

  public LeadsInvalidPayApiContainer leadsInvalidPay() {
    return leadsInvalidPayApiContainer;
  }

  public LeadsListApiContainer leadsList() {
    return leadsListApiContainer;
  }

  public LeadsStatusApiContainer leadsStatus() {
    return leadsStatusApiContainer;
  }

  public LeadsVoipCallApiContainer leadsVoipCall() {
    return leadsVoipCallApiContainer;
  }

  public LeadsVoipCallTokenApiContainer leadsVoipCallToken() {
    return leadsVoipCallTokenApiContainer;
  }

  public LiveRoomComponentStatusApiContainer liveRoomComponentStatus() {
    return liveRoomComponentStatusApiContainer;
  }

  public LiveRoomComponentsApiContainer liveRoomComponents() {
    return liveRoomComponentsApiContainer;
  }

  public LocalStorePackagesApiContainer localStorePackages() {
    return localStorePackagesApiContainer;
  }

  public LocalStoresApiContainer localStores() {
    return localStoresApiContainer;
  }

  public LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResult() {
    return localStoresAddressParsingResultApiContainer;
  }

  public LocalStoresCategoriesApiContainer localStoresCategories() {
    return localStoresCategoriesApiContainer;
  }

  public LocalStoresSearchInfoApiContainer localStoresSearchInfo() {
    return localStoresSearchInfoApiContainer;
  }

  public LocalStoresWxpayMerchantsApiContainer localStoresWxpayMerchants() {
    return localStoresWxpayMerchantsApiContainer;
  }

  public MarketingRulesApiContainer marketingRules() {
    return marketingRulesApiContainer;
  }

  public MarketingTargetAssetCategoriesApiContainer marketingTargetAssetCategories() {
    return marketingTargetAssetCategoriesApiContainer;
  }

  public MarketingTargetAssetDetailApiContainer marketingTargetAssetDetail() {
    return marketingTargetAssetDetailApiContainer;
  }

  public MarketingTargetAssetPropertiesApiContainer marketingTargetAssetProperties() {
    return marketingTargetAssetPropertiesApiContainer;
  }

  public MarketingTargetAssetPropertyValuesApiContainer marketingTargetAssetPropertyValues() {
    return marketingTargetAssetPropertyValuesApiContainer;
  }

  public MarketingTargetAssetsApiContainer marketingTargetAssets() {
    return marketingTargetAssetsApiContainer;
  }

  public MarketingTargetTypesApiContainer marketingTargetTypes() {
    return marketingTargetTypesApiContainer;
  }

  public MaterialDcatagApiContainer materialDcatag() {
    return materialDcatagApiContainer;
  }

  public MaterialLabelsApiContainer materialLabels() {
    return materialLabelsApiContainer;
  }

  public MergeFundTypeDailyBalanceReportApiContainer mergeFundTypeDailyBalanceReport() {
    return mergeFundTypeDailyBalanceReportApiContainer;
  }

  public MergeFundTypeFundStatementsDetailedApiContainer mergeFundTypeFundStatementsDetailed() {
    return mergeFundTypeFundStatementsDetailedApiContainer;
  }

  public MergeFundTypeFundsApiContainer mergeFundTypeFunds() {
    return mergeFundTypeFundsApiContainer;
  }

  public MergeFundTypeSubcustomerTransferApiContainer mergeFundTypeSubcustomerTransfer() {
    return mergeFundTypeSubcustomerTransferApiContainer;
  }

  public MuseAiMaterialApiContainer museAiMaterial() {
    return museAiMaterialApiContainer;
  }

  public MuseAiTaskApiContainer museAiTask() {
    return museAiTaskApiContainer;
  }

  public OauthApiContainer oauth() {
    return oauthApiContainer;
  }

  public ObjectCommentFlagApiContainer objectCommentFlag() {
    return objectCommentFlagApiContainer;
  }

  public OptimizationGoalPermissionsApiContainer optimizationGoalPermissions() {
    return optimizationGoalPermissionsApiContainer;
  }

  public OrganizationAccountRelationApiContainer organizationAccountRelation() {
    return organizationAccountRelationApiContainer;
  }

  public PagesApiContainer pages() {
    return pagesApiContainer;
  }

  public ProductCatalogsApiContainer productCatalogs() {
    return productCatalogsApiContainer;
  }

  public ProductCategoriesListApiContainer productCategoriesList() {
    return productCategoriesListApiContainer;
  }

  public ProductItemsApiContainer productItems() {
    return productItemsApiContainer;
  }

  public ProductItemsDetailApiContainer productItemsDetail() {
    return productItemsDetailApiContainer;
  }

  public ProductItemsVerticalsApiContainer productItemsVerticals() {
    return productItemsVerticalsApiContainer;
  }

  public ProductSeriesApiContainer productSeries() {
    return productSeriesApiContainer;
  }

  public ProductsSystemStatusApiContainer productsSystemStatus() {
    return productsSystemStatusApiContainer;
  }

  public ProfilesApiContainer profiles() {
    return profilesApiContainer;
  }

  public ProgrammedApiContainer programmed() {
    return programmedApiContainer;
  }

  public ProgrammedMaterialMappingsApiContainer programmedMaterialMappings() {
    return programmedMaterialMappingsApiContainer;
  }

  public ProgrammedTemplateApiContainer programmedTemplate() {
    return programmedTemplateApiContainer;
  }

  public QualificationStructureApiContainer qualificationStructure() {
    return qualificationStructureApiContainer;
  }

  public QualificationsApiContainer qualifications() {
    return qualificationsApiContainer;
  }

  public RealtimeCostApiContainer realtimeCost() {
    return realtimeCostApiContainer;
  }

  public ReviewElementPrereviewResultsApiContainer reviewElementPrereviewResults() {
    return reviewElementPrereviewResultsApiContainer;
  }

  public RtaInfoApiContainer rtaInfo() {
    return rtaInfoApiContainer;
  }

  public RtaexpApiContainer rtaexp() {
    return rtaexpApiContainer;
  }

  public RtaexpDataRoiApiContainer rtaexpDataRoi() {
    return rtaexpDataRoiApiContainer;
  }

  public RtaexpDspTagDataApiContainer rtaexpDspTagData() {
    return rtaexpDspTagDataApiContainer;
  }

  public RtatargetApiContainer rtatarget() {
    return rtatargetApiContainer;
  }

  public RtatargetBindApiContainer rtatargetBind() {
    return rtatargetBindApiContainer;
  }

  public SceneSpecTagsApiContainer sceneSpecTags() {
    return sceneSpecTagsApiContainer;
  }

  public SubcustomerTransferApiContainer subcustomerTransfer() {
    return subcustomerTransferApiContainer;
  }

  public TargetingTagReportsApiContainer targetingTagReports() {
    return targetingTagReportsApiContainer;
  }

  public TargetingTagsApiContainer targetingTags() {
    return targetingTagsApiContainer;
  }

  public TargetingTagsUvApiContainer targetingTagsUv() {
    return targetingTagsUvApiContainer;
  }

  public TargetingsApiContainer targetings() {
    return targetingsApiContainer;
  }

  public UnionPositionPackagesApiContainer unionPositionPackages() {
    return unionPositionPackagesApiContainer;
  }

  public UserActionSetReportsApiContainer userActionSetReports() {
    return userActionSetReportsApiContainer;
  }

  public UserActionSetsApiContainer userActionSets() {
    return userActionSetsApiContainer;
  }

  public UserActionsApiContainer userActions() {
    return userActionsApiContainer;
  }

  public VideoChannelDealerDataApiContainer videoChannelDealerData() {
    return videoChannelDealerDataApiContainer;
  }

  public VideoChannelFansDataApiContainer videoChannelFansData() {
    return videoChannelFansDataApiContainer;
  }

  public VideoChannelLeadsDataApiContainer videoChannelLeadsData() {
    return videoChannelLeadsDataApiContainer;
  }

  public VideoChannelLiveDataApiContainer videoChannelLiveData() {
    return videoChannelLiveDataApiContainer;
  }

  public VideosApiContainer videos() {
    return videosApiContainer;
  }

  public WechatChannelsAccountsApiContainer wechatChannelsAccounts() {
    return wechatChannelsAccountsApiContainer;
  }

  public WechatChannelsAdAccountApiContainer wechatChannelsAdAccount() {
    return wechatChannelsAdAccountApiContainer;
  }

  public WechatChannelsAdAccountCertificationFileApiContainer
      wechatChannelsAdAccountCertificationFile() {
    return wechatChannelsAdAccountCertificationFileApiContainer;
  }

  public WechatChannelsAdAccountValidationApiContainer wechatChannelsAdAccountValidation() {
    return wechatChannelsAdAccountValidationApiContainer;
  }

  public WechatChannelsAdAccountWechatBindingApiContainer wechatChannelsAdAccountWechatBinding() {
    return wechatChannelsAdAccountWechatBindingApiContainer;
  }

  public WechatChannelsAuthorizationApiContainer wechatChannelsAuthorization() {
    return wechatChannelsAuthorizationApiContainer;
  }

  public WechatOfficialAccountsApiContainer wechatOfficialAccounts() {
    return wechatOfficialAccountsApiContainer;
  }

  public WechatPagesApiContainer wechatPages() {
    return wechatPagesApiContainer;
  }

  public WechatPagesCsgroupStatusApiContainer wechatPagesCsgroupStatus() {
    return wechatPagesCsgroupStatusApiContainer;
  }

  public WechatPagesCsgroupUserApiContainer wechatPagesCsgroupUser() {
    return wechatPagesCsgroupUserApiContainer;
  }

  public WechatPagesCsgrouplistApiContainer wechatPagesCsgrouplist() {
    return wechatPagesCsgrouplistApiContainer;
  }

  public WechatPagesCustomApiContainer wechatPagesCustom() {
    return wechatPagesCustomApiContainer;
  }

  public WechatPagesGrantinfoApiContainer wechatPagesGrantinfo() {
    return wechatPagesGrantinfoApiContainer;
  }

  public WildcardsApiContainer wildcards() {
    return wildcardsApiContainer;
  }

  public WxPackageAccountApiContainer wxPackageAccount() {
    return wxPackageAccountApiContainer;
  }

  public WxPackagePackageApiContainer wxPackagePackage() {
    return wxPackagePackageApiContainer;
  }

  public XijingComplexTemplateApiContainer xijingComplexTemplate() {
    return xijingComplexTemplateApiContainer;
  }

  public XijingPageApiContainer xijingPage() {
    return xijingPageApiContainer;
  }

  public XijingPageByComponentsApiContainer xijingPageByComponents() {
    return xijingPageByComponentsApiContainer;
  }

  public XijingPageInteractiveApiContainer xijingPageInteractive() {
    return xijingPageInteractiveApiContainer;
  }

  public XijingPageListApiContainer xijingPageList() {
    return xijingPageListApiContainer;
  }

  public XijingTemplateApiContainer xijingTemplate() {
    return xijingTemplateApiContainer;
  }

  public XijingTemplateListApiContainer xijingTemplateList() {
    return xijingTemplateListApiContainer;
  }
}
