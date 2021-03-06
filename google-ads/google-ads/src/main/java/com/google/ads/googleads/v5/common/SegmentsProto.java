// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/segments.proto

package com.google.ads.googleads.v5.common;

public final class SegmentsProto {
  private SegmentsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_Segments_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_Segments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_Keyword_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_Keyword_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_BudgetCampaignAssociationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_BudgetCampaignAssociationStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v5/common/segment" +
      "s.proto\022\036google.ads.googleads.v5.common\032" +
      "-google/ads/googleads/v5/common/criteria" +
      ".proto\0323google/ads/googleads/v5/enums/ad" +
      "_network_type.proto\032Fgoogle/ads/googlead" +
      "s/v5/enums/budget_campaign_association_s" +
      "tatus.proto\032.google/ads/googleads/v5/enu" +
      "ms/click_type.proto\032>google/ads/googlead" +
      "s/v5/enums/conversion_action_category.pr" +
      "oto\032Egoogle/ads/googleads/v5/enums/conve" +
      "rsion_attribution_event_type.proto\0329goog" +
      "le/ads/googleads/v5/enums/conversion_lag" +
      "_bucket.proto\032Ggoogle/ads/googleads/v5/e" +
      "nums/conversion_or_adjustment_lag_bucket" +
      ".proto\032/google/ads/googleads/v5/enums/da" +
      "y_of_week.proto\032*google/ads/googleads/v5" +
      "/enums/device.proto\032>google/ads/googlead" +
      "s/v5/enums/external_conversion_source.pr" +
      "oto\032=google/ads/googleads/v5/enums/hotel" +
      "_date_selection_type.proto\0326google/ads/g" +
      "oogleads/v5/enums/hotel_price_bucket.pro" +
      "to\0323google/ads/googleads/v5/enums/hotel_" +
      "rate_type.proto\0321google/ads/googleads/v5" +
      "/enums/month_of_year.proto\0324google/ads/g" +
      "oogleads/v5/enums/placeholder_type.proto" +
      "\0323google/ads/googleads/v5/enums/product_" +
      "channel.proto\032?google/ads/googleads/v5/e" +
      "nums/product_channel_exclusivity.proto\0325" +
      "google/ads/googleads/v5/enums/product_co" +
      "ndition.proto\032Cgoogle/ads/googleads/v5/e" +
      "nums/search_engine_results_page_type.pro" +
      "to\032:google/ads/googleads/v5/enums/search" +
      "_term_match_type.proto\032(google/ads/googl" +
      "eads/v5/enums/slot.proto\032\031google/api/res" +
      "ource.proto\032\034google/api/annotations.prot" +
      "o\"\260*\n\010Segments\022W\n\017ad_network_type\030\003 \001(\0162" +
      ">.google.ads.googleads.v5.enums.AdNetwor" +
      "kTypeEnum.AdNetworkType\022l\n\"budget_campai" +
      "gn_association_status\030\206\001 \001(\0132?.google.ad" +
      "s.googleads.v5.common.BudgetCampaignAsso" +
      "ciationStatus\022J\n\nclick_type\030\032 \001(\01626.goog" +
      "le.ads.googleads.v5.enums.ClickTypeEnum." +
      "ClickType\022\036\n\021conversion_action\030q \001(\tH\000\210\001" +
      "\001\022x\n\032conversion_action_category\0305 \001(\0162T." +
      "google.ads.googleads.v5.enums.Conversion" +
      "ActionCategoryEnum.ConversionActionCateg" +
      "ory\022#\n\026conversion_action_name\030r \001(\tH\001\210\001\001" +
      "\022\"\n\025conversion_adjustment\030s \001(\010H\002\210\001\001\022\213\001\n" +
      "!conversion_attribution_event_type\030\002 \001(\016" +
      "2`.google.ads.googleads.v5.enums.Convers" +
      "ionAttributionEventTypeEnum.ConversionAt" +
      "tributionEventType\022i\n\025conversion_lag_buc" +
      "ket\0302 \001(\0162J.google.ads.googleads.v5.enum" +
      "s.ConversionLagBucketEnum.ConversionLagB" +
      "ucket\022\217\001\n#conversion_or_adjustment_lag_b" +
      "ucket\0303 \001(\0162b.google.ads.googleads.v5.en" +
      "ums.ConversionOrAdjustmentLagBucketEnum." +
      "ConversionOrAdjustmentLagBucket\022\021\n\004date\030" +
      "O \001(\tH\003\210\001\001\022K\n\013day_of_week\030\005 \001(\01626.google" +
      ".ads.googleads.v5.enums.DayOfWeekEnum.Da" +
      "yOfWeek\022@\n\006device\030\001 \001(\01620.google.ads.goo" +
      "gleads.v5.enums.DeviceEnum.Device\022x\n\032ext" +
      "ernal_conversion_source\0307 \001(\0162T.google.a" +
      "ds.googleads.v5.enums.ExternalConversion" +
      "SourceEnum.ExternalConversionSource\022\037\n\022g" +
      "eo_target_airport\030t \001(\tH\004\210\001\001\022\036\n\021geo_targ" +
      "et_canton\030u \001(\tH\005\210\001\001\022\034\n\017geo_target_city\030" +
      "v \001(\tH\006\210\001\001\022\037\n\022geo_target_country\030w \001(\tH\007" +
      "\210\001\001\022\036\n\021geo_target_county\030x \001(\tH\010\210\001\001\022 \n\023g" +
      "eo_target_district\030y \001(\tH\t\210\001\001\022\035\n\020geo_tar" +
      "get_metro\030z \001(\tH\n\210\001\001\022.\n!geo_target_most_" +
      "specific_location\030{ \001(\tH\013\210\001\001\022#\n\026geo_targ" +
      "et_postal_code\030| \001(\tH\014\210\001\001\022 \n\023geo_target_" +
      "province\030} \001(\tH\r\210\001\001\022\036\n\021geo_target_region" +
      "\030~ \001(\tH\016\210\001\001\022\035\n\020geo_target_state\030\177 \001(\tH\017\210" +
      "\001\001\022\'\n\031hotel_booking_window_days\030\207\001 \001(\003H\020" +
      "\210\001\001\022\034\n\017hotel_center_id\030P \001(\003H\021\210\001\001\022 \n\023hot" +
      "el_check_in_date\030Q \001(\tH\022\210\001\001\022Z\n\032hotel_che" +
      "ck_in_day_of_week\030\t \001(\01626.google.ads.goo" +
      "gleads.v5.enums.DayOfWeekEnum.DayOfWeek\022" +
      "\027\n\nhotel_city\030R \001(\tH\023\210\001\001\022\030\n\013hotel_class\030" +
      "S \001(\005H\024\210\001\001\022\032\n\rhotel_country\030T \001(\tH\025\210\001\001\022s" +
      "\n\031hotel_date_selection_type\030\r \001(\0162P.goog" +
      "le.ads.googleads.v5.enums.HotelDateSelec" +
      "tionTypeEnum.HotelDateSelectionType\022!\n\024h" +
      "otel_length_of_stay\030U \001(\005H\026\210\001\001\022\037\n\022hotel_" +
      "rate_rule_id\030V \001(\tH\027\210\001\001\022W\n\017hotel_rate_ty" +
      "pe\030J \001(\0162>.google.ads.googleads.v5.enums" +
      ".HotelRateTypeEnum.HotelRateType\022`\n\022hote" +
      "l_price_bucket\030N \001(\0162D.google.ads.google" +
      "ads.v5.enums.HotelPriceBucketEnum.HotelP" +
      "riceBucket\022\030\n\013hotel_state\030W \001(\tH\030\210\001\001\022\021\n\004" +
      "hour\030X \001(\005H\031\210\001\001\022*\n\035interaction_on_this_e" +
      "xtension\030Y \001(\010H\032\210\001\001\0228\n\007keyword\030= \001(\0132\'.g" +
      "oogle.ads.googleads.v5.common.Keyword\022\022\n" +
      "\005month\030Z \001(\tH\033\210\001\001\022Q\n\rmonth_of_year\030\022 \001(\016" +
      "2:.google.ads.googleads.v5.enums.MonthOf" +
      "YearEnum.MonthOfYear\022\035\n\020partner_hotel_id" +
      "\030[ \001(\tH\034\210\001\001\022\\\n\020placeholder_type\030\024 \001(\0162B." +
      "google.ads.googleads.v5.enums.Placeholde" +
      "rTypeEnum.PlaceholderType\022#\n\025product_agg" +
      "regator_id\030\204\001 \001(\003H\035\210\001\001\022,\n\037product_biddin" +
      "g_category_level1\030\\ \001(\tH\036\210\001\001\022,\n\037product_" +
      "bidding_category_level2\030] \001(\tH\037\210\001\001\022,\n\037pr" +
      "oduct_bidding_category_level3\030^ \001(\tH \210\001\001" +
      "\022,\n\037product_bidding_category_level4\030_ \001(" +
      "\tH!\210\001\001\022,\n\037product_bidding_category_level" +
      "5\030` \001(\tH\"\210\001\001\022\032\n\rproduct_brand\030a \001(\tH#\210\001\001" +
      "\022Y\n\017product_channel\030\036 \001(\0162@.google.ads.g" +
      "oogleads.v5.enums.ProductChannelEnum.Pro" +
      "ductChannel\022{\n\033product_channel_exclusivi" +
      "ty\030\037 \001(\0162V.google.ads.googleads.v5.enums" +
      ".ProductChannelExclusivityEnum.ProductCh" +
      "annelExclusivity\022_\n\021product_condition\030  " +
      "\001(\0162D.google.ads.googleads.v5.enums.Prod" +
      "uctConditionEnum.ProductCondition\022\034\n\017pro" +
      "duct_country\030b \001(\tH$\210\001\001\022&\n\031product_custo" +
      "m_attribute0\030c \001(\tH%\210\001\001\022&\n\031product_custo" +
      "m_attribute1\030d \001(\tH&\210\001\001\022&\n\031product_custo" +
      "m_attribute2\030e \001(\tH\'\210\001\001\022&\n\031product_custo" +
      "m_attribute3\030f \001(\tH(\210\001\001\022&\n\031product_custo" +
      "m_attribute4\030g \001(\tH)\210\001\001\022\034\n\017product_item_" +
      "id\030h \001(\tH*\210\001\001\022\035\n\020product_language\030i \001(\tH" +
      "+\210\001\001\022!\n\023product_merchant_id\030\205\001 \001(\003H,\210\001\001\022" +
      "\035\n\020product_store_id\030j \001(\tH-\210\001\001\022\032\n\rproduc" +
      "t_title\030k \001(\tH.\210\001\001\022\034\n\017product_type_l1\030l " +
      "\001(\tH/\210\001\001\022\034\n\017product_type_l2\030m \001(\tH0\210\001\001\022\034" +
      "\n\017product_type_l3\030n \001(\tH1\210\001\001\022\034\n\017product_" +
      "type_l4\030o \001(\tH2\210\001\001\022\034\n\017product_type_l5\030p " +
      "\001(\tH3\210\001\001\022\025\n\007quarter\030\200\001 \001(\tH4\210\001\001\022\203\001\n\037sear" +
      "ch_engine_results_page_type\030F \001(\0162Z.goog" +
      "le.ads.googleads.v5.enums.SearchEngineRe" +
      "sultsPageTypeEnum.SearchEngineResultsPag" +
      "eType\022j\n\026search_term_match_type\030\026 \001(\0162J." +
      "google.ads.googleads.v5.enums.SearchTerm" +
      "MatchTypeEnum.SearchTermMatchType\022:\n\004slo" +
      "t\030\027 \001(\0162,.google.ads.googleads.v5.enums." +
      "SlotEnum.Slot\022\025\n\007webpage\030\201\001 \001(\tH5\210\001\001\022\022\n\004" +
      "week\030\202\001 \001(\tH6\210\001\001\022\022\n\004year\030\203\001 \001(\005H7\210\001\001B\024\n\022" +
      "_conversion_actionB\031\n\027_conversion_action" +
      "_nameB\030\n\026_conversion_adjustmentB\007\n\005_date" +
      "B\025\n\023_geo_target_airportB\024\n\022_geo_target_c" +
      "antonB\022\n\020_geo_target_cityB\025\n\023_geo_target" +
      "_countryB\024\n\022_geo_target_countyB\026\n\024_geo_t" +
      "arget_districtB\023\n\021_geo_target_metroB$\n\"_" +
      "geo_target_most_specific_locationB\031\n\027_ge" +
      "o_target_postal_codeB\026\n\024_geo_target_prov" +
      "inceB\024\n\022_geo_target_regionB\023\n\021_geo_targe" +
      "t_stateB\034\n\032_hotel_booking_window_daysB\022\n" +
      "\020_hotel_center_idB\026\n\024_hotel_check_in_dat" +
      "eB\r\n\013_hotel_cityB\016\n\014_hotel_classB\020\n\016_hot" +
      "el_countryB\027\n\025_hotel_length_of_stayB\025\n\023_" +
      "hotel_rate_rule_idB\016\n\014_hotel_stateB\007\n\005_h" +
      "ourB \n\036_interaction_on_this_extensionB\010\n" +
      "\006_monthB\023\n\021_partner_hotel_idB\030\n\026_product" +
      "_aggregator_idB\"\n _product_bidding_categ" +
      "ory_level1B\"\n _product_bidding_category_" +
      "level2B\"\n _product_bidding_category_leve" +
      "l3B\"\n _product_bidding_category_level4B\"" +
      "\n _product_bidding_category_level5B\020\n\016_p" +
      "roduct_brandB\022\n\020_product_countryB\034\n\032_pro" +
      "duct_custom_attribute0B\034\n\032_product_custo" +
      "m_attribute1B\034\n\032_product_custom_attribut" +
      "e2B\034\n\032_product_custom_attribute3B\034\n\032_pro" +
      "duct_custom_attribute4B\022\n\020_product_item_" +
      "idB\023\n\021_product_languageB\026\n\024_product_merc" +
      "hant_idB\023\n\021_product_store_idB\020\n\016_product" +
      "_titleB\022\n\020_product_type_l1B\022\n\020_product_t" +
      "ype_l2B\022\n\020_product_type_l3B\022\n\020_product_t" +
      "ype_l4B\022\n\020_product_type_l5B\n\n\010_quarterB\n" +
      "\n\010_webpageB\007\n\005_weekB\007\n\005_year\"|\n\007Keyword\022" +
      "\037\n\022ad_group_criterion\030\003 \001(\tH\000\210\001\001\0229\n\004info" +
      "\030\002 \001(\0132+.google.ads.googleads.v5.common." +
      "KeywordInfoB\025\n\023_ad_group_criterion\"\341\001\n\037B" +
      "udgetCampaignAssociationStatus\022=\n\010campai" +
      "gn\030\001 \001(\tB&\372A#\n!googleads.googleapis.com/" +
      "CampaignH\000\210\001\001\022r\n\006status\030\002 \001(\0162b.google.a" +
      "ds.googleads.v5.enums.BudgetCampaignAsso" +
      "ciationStatusEnum.BudgetCampaignAssociat" +
      "ionStatusB\013\n\t_campaignB\350\001\n\"com.google.ad" +
      "s.googleads.v5.commonB\rSegmentsProtoP\001ZD" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v5/common;common\242\002\003GAA\252\002\036Goo" +
      "gle.Ads.GoogleAds.V5.Common\312\002\036Google\\Ads" +
      "\\GoogleAds\\V5\\Common\352\002\"Google::Ads::Goog" +
      "leAds::V5::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AdNetworkTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.BudgetCampaignAssociationStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ClickTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionAttributionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.DayOfWeekProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ExternalConversionSourceProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.HotelDateSelectionTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.HotelPriceBucketProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.HotelRateTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ProductChannelProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ProductChannelExclusivityProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ProductConditionProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SearchEngineResultsPageTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SearchTermMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SlotProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_common_Segments_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_common_Segments_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_Segments_descriptor,
        new java.lang.String[] { "AdNetworkType", "BudgetCampaignAssociationStatus", "ClickType", "ConversionAction", "ConversionActionCategory", "ConversionActionName", "ConversionAdjustment", "ConversionAttributionEventType", "ConversionLagBucket", "ConversionOrAdjustmentLagBucket", "Date", "DayOfWeek", "Device", "ExternalConversionSource", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCheckInDayOfWeek", "HotelCity", "HotelClass", "HotelCountry", "HotelDateSelectionType", "HotelLengthOfStay", "HotelRateRuleId", "HotelRateType", "HotelPriceBucket", "HotelState", "Hour", "InteractionOnThisExtension", "Keyword", "Month", "MonthOfYear", "PartnerHotelId", "PlaceholderType", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductChannel", "ProductChannelExclusivity", "ProductCondition", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "SearchEngineResultsPageType", "SearchTermMatchType", "Slot", "Webpage", "Week", "Year", "ConversionAction", "ConversionActionName", "ConversionAdjustment", "Date", "GeoTargetAirport", "GeoTargetCanton", "GeoTargetCity", "GeoTargetCountry", "GeoTargetCounty", "GeoTargetDistrict", "GeoTargetMetro", "GeoTargetMostSpecificLocation", "GeoTargetPostalCode", "GeoTargetProvince", "GeoTargetRegion", "GeoTargetState", "HotelBookingWindowDays", "HotelCenterId", "HotelCheckInDate", "HotelCity", "HotelClass", "HotelCountry", "HotelLengthOfStay", "HotelRateRuleId", "HotelState", "Hour", "InteractionOnThisExtension", "Month", "PartnerHotelId", "ProductAggregatorId", "ProductBiddingCategoryLevel1", "ProductBiddingCategoryLevel2", "ProductBiddingCategoryLevel3", "ProductBiddingCategoryLevel4", "ProductBiddingCategoryLevel5", "ProductBrand", "ProductCountry", "ProductCustomAttribute0", "ProductCustomAttribute1", "ProductCustomAttribute2", "ProductCustomAttribute3", "ProductCustomAttribute4", "ProductItemId", "ProductLanguage", "ProductMerchantId", "ProductStoreId", "ProductTitle", "ProductTypeL1", "ProductTypeL2", "ProductTypeL3", "ProductTypeL4", "ProductTypeL5", "Quarter", "Webpage", "Week", "Year", });
    internal_static_google_ads_googleads_v5_common_Keyword_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_common_Keyword_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_Keyword_descriptor,
        new java.lang.String[] { "AdGroupCriterion", "Info", "AdGroupCriterion", });
    internal_static_google_ads_googleads_v5_common_BudgetCampaignAssociationStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_common_BudgetCampaignAssociationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_BudgetCampaignAssociationStatus_descriptor,
        new java.lang.String[] { "Campaign", "Status", "Campaign", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AdNetworkTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.BudgetCampaignAssociationStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ClickTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionAttributionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionLagBucketProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionOrAdjustmentLagBucketProto.getDescriptor();
    com.google.ads.googleads.v5.enums.DayOfWeekProto.getDescriptor();
    com.google.ads.googleads.v5.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ExternalConversionSourceProto.getDescriptor();
    com.google.ads.googleads.v5.enums.HotelDateSelectionTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.HotelPriceBucketProto.getDescriptor();
    com.google.ads.googleads.v5.enums.HotelRateTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v5.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ProductChannelProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ProductChannelExclusivityProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ProductConditionProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SearchEngineResultsPageTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SearchTermMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SlotProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
