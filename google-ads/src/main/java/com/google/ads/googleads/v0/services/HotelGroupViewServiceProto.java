// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/hotel_group_view_service.proto

package com.google.ads.googleads.v0.services;

public final class HotelGroupViewServiceProto {
  private HotelGroupViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetHotelGroupViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetHotelGroupViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v0/services/hotel" +
      "_group_view_service.proto\022 google.ads.go" +
      "ogleads.v0.services\0328google/ads/googlead" +
      "s/v0/resources/hotel_group_view.proto\032\034g" +
      "oogle/api/annotations.proto\"1\n\030GetHotelG" +
      "roupViewRequest\022\025\n\rresource_name\030\001 \001(\t2\327" +
      "\001\n\025HotelGroupViewService\022\275\001\n\021GetHotelGro" +
      "upView\022:.google.ads.googleads.v0.service" +
      "s.GetHotelGroupViewRequest\0321.google.ads." +
      "googleads.v0.resources.HotelGroupView\"9\202" +
      "\323\344\223\0023\0221/v0/{resource_name=customers/*/ho" +
      "telGroupViews/*}B\201\002\n$com.google.ads.goog" +
      "leads.v0.servicesB\032HotelGroupViewService" +
      "ProtoP\001ZHgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v0/services;service" +
      "s\242\002\003GAA\252\002 Google.Ads.GoogleAds.V0.Servic" +
      "es\312\002 Google\\Ads\\GoogleAds\\V0\\Services\352\002$" +
      "Google::Ads::GoogleAds::V0::Servicesb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.resources.HotelGroupViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetHotelGroupViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetHotelGroupViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetHotelGroupViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.HotelGroupViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}