// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/hotel_group_view.proto

package com.google.ads.googleads.v4.resources;

public final class HotelGroupViewProto {
  private HotelGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_HotelGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_HotelGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v4/resources/hote" +
      "l_group_view.proto\022!google.ads.googleads" +
      ".v4.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\034googl" +
      "e/api/annotations.proto\"\277\001\n\016HotelGroupVi" +
      "ew\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)\n\'googl" +
      "eads.googleapis.com/HotelGroupView:e\352Ab\n" +
      "\'googleads.googleapis.com/HotelGroupView" +
      "\0227customers/{customer}/hotelGroupViews/{" +
      "hotel_group_view}B\200\002\n%com.google.ads.goo" +
      "gleads.v4.resourcesB\023HotelGroupViewProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v4/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V4.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V4\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V4::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_HotelGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_HotelGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_HotelGroupView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
