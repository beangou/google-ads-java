// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/keyword_view.proto

package com.google.ads.googleads.v5.resources;

public final class KeywordViewProto {
  private KeywordViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_KeywordView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_KeywordView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v5/resources/keyw" +
      "ord_view.proto\022!google.ads.googleads.v5." +
      "resources\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032\034google/ap" +
      "i/annotations.proto\"\257\001\n\013KeywordView\022C\n\rr" +
      "esource_name\030\001 \001(\tB,\340A\003\372A&\n$googleads.go" +
      "ogleapis.com/KeywordView:[\352AX\n$googleads" +
      ".googleapis.com/KeywordView\0220customers/{" +
      "customer}/keywordViews/{keyword_view}B\375\001" +
      "\n%com.google.ads.googleads.v5.resourcesB" +
      "\020KeywordViewProtoP\001ZJgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v5/reso" +
      "urces;resources\242\002\003GAA\252\002!Google.Ads.Googl" +
      "eAds.V5.Resources\312\002!Google\\Ads\\GoogleAds" +
      "\\V5\\Resources\352\002%Google::Ads::GoogleAds::" +
      "V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_KeywordView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_KeywordView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_KeywordView_descriptor,
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
