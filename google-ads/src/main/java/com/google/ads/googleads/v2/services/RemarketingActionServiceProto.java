// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/remarketing_action_service.proto

package com.google.ads.googleads.v2.services;

public final class RemarketingActionServiceProto {
  private RemarketingActionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetRemarketingActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetRemarketingActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_RemarketingActionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_RemarketingActionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateRemarketingActionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v2/services/remar" +
      "keting_action_service.proto\022 google.ads." +
      "googleads.v2.services\032:google/ads/google" +
      "ads/v2/resources/remarketing_action.prot" +
      "o\032\034google/api/annotations.proto\032 google/" +
      "protobuf/field_mask.proto\032\036google/protob" +
      "uf/wrappers.proto\032\027google/rpc/status.pro" +
      "to\032\027google/api/client.proto\"4\n\033GetRemark" +
      "etingActionRequest\022\025\n\rresource_name\030\001 \001(" +
      "\t\"\270\001\n\037MutateRemarketingActionsRequest\022\023\n" +
      "\013customer_id\030\001 \001(\t\022P\n\noperations\030\002 \003(\0132<" +
      ".google.ads.googleads.v2.services.Remark" +
      "etingActionOperation\022\027\n\017partial_failure\030" +
      "\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\352\001\n\032Remarke" +
      "tingActionOperation\022/\n\013update_mask\030\004 \001(\013" +
      "2\032.google.protobuf.FieldMask\022F\n\006create\030\001" +
      " \001(\01324.google.ads.googleads.v2.resources" +
      ".RemarketingActionH\000\022F\n\006update\030\002 \001(\01324.g" +
      "oogle.ads.googleads.v2.resources.Remarke" +
      "tingActionH\000B\013\n\toperation\"\247\001\n MutateRema" +
      "rketingActionsResponse\0221\n\025partial_failur" +
      "e_error\030\003 \001(\0132\022.google.rpc.Status\022P\n\007res" +
      "ults\030\002 \003(\0132?.google.ads.googleads.v2.ser" +
      "vices.MutateRemarketingActionResult\"6\n\035M" +
      "utateRemarketingActionResult\022\025\n\rresource" +
      "_name\030\001 \001(\t2\353\003\n\030RemarketingActionService" +
      "\022\311\001\n\024GetRemarketingAction\022=.google.ads.g" +
      "oogleads.v2.services.GetRemarketingActio" +
      "nRequest\0324.google.ads.googleads.v2.resou" +
      "rces.RemarketingAction\"<\202\323\344\223\0026\0224/v2/{res" +
      "ource_name=customers/*/remarketingAction" +
      "s/*}\022\345\001\n\030MutateRemarketingActions\022A.goog" +
      "le.ads.googleads.v2.services.MutateRemar" +
      "ketingActionsRequest\032B.google.ads.google" +
      "ads.v2.services.MutateRemarketingActions" +
      "Response\"B\202\323\344\223\002<\"7/v2/customers/{custome" +
      "r_id=*}/remarketingActions:mutate:\001*\032\033\312A" +
      "\030googleads.googleapis.comB\204\002\n$com.google" +
      ".ads.googleads.v2.servicesB\035RemarketingA" +
      "ctionServiceProtoP\001ZHgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v2/serv" +
      "ices;services\242\002\003GAA\252\002 Google.Ads.GoogleA" +
      "ds.V2.Services\312\002 Google\\Ads\\GoogleAds\\V2" +
      "\\Services\352\002$Google::Ads::GoogleAds::V2::" +
      "Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.RemarketingActionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetRemarketingActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetRemarketingActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetRemarketingActionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_RemarketingActionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_RemarketingActionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_RemarketingActionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateRemarketingActionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateRemarketingActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateRemarketingActionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.RemarketingActionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}