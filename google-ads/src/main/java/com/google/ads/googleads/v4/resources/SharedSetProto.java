// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/shared_set.proto

package com.google.ads.googleads.v4.resources;

public final class SharedSetProto {
  private SharedSetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_SharedSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_SharedSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v4/resources/shar" +
      "ed_set.proto\022!google.ads.googleads.v4.re" +
      "sources\0325google/ads/googleads/v4/enums/s" +
      "hared_set_status.proto\0323google/ads/googl" +
      "eads/v4/enums/shared_set_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\034google/api/annotations.proto\"\236\004" +
      "\n\tSharedSet\022A\n\rresource_name\030\001 \001(\tB*\340A\005\372" +
      "A$\n\"googleads.googleapis.com/SharedSet\022," +
      "\n\002id\030\002 \001(\0132\033.google.protobuf.Int64ValueB" +
      "\003\340A\003\022Q\n\004type\030\003 \001(\0162>.google.ads.googlead" +
      "s.v4.enums.SharedSetTypeEnum.SharedSetTy" +
      "peB\003\340A\005\022*\n\004name\030\004 \001(\0132\034.google.protobuf." +
      "StringValue\022W\n\006status\030\005 \001(\0162B.google.ads" +
      ".googleads.v4.enums.SharedSetStatusEnum." +
      "SharedSetStatusB\003\340A\003\0226\n\014member_count\030\006 \001" +
      "(\0132\033.google.protobuf.Int64ValueB\003\340A\003\0229\n\017" +
      "reference_count\030\007 \001(\0132\033.google.protobuf." +
      "Int64ValueB\003\340A\003:U\352AR\n\"googleads.googleap" +
      "is.com/SharedSet\022,customers/{customer}/s" +
      "haredSets/{shared_set}B\373\001\n%com.google.ad" +
      "s.googleads.v4.resourcesB\016SharedSetProto" +
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
          com.google.ads.googleads.v4.enums.SharedSetStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.SharedSetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_SharedSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_SharedSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_SharedSet_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Type", "Name", "Status", "MemberCount", "ReferenceCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.enums.SharedSetStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.SharedSetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}