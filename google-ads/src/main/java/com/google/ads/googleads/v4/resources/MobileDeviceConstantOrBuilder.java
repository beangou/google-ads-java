// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/mobile_device_constant.proto

package com.google.ads.googleads.v4.resources;

public interface MobileDeviceConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.resources.MobileDeviceConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the mobile device constant.
   * Mobile device constant resource names have the form:
   * `mobileDeviceConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the mobile device constant.
   * Mobile device constant resource names have the form:
   * `mobileDeviceConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the mobile device constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the mobile device constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the mobile device constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. The name of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Output only. The name of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. The manufacturer of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manufacturer_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the manufacturerName field is set.
   */
  boolean hasManufacturerName();
  /**
   * <pre>
   * Output only. The manufacturer of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manufacturer_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manufacturerName.
   */
  com.google.protobuf.StringValue getManufacturerName();
  /**
   * <pre>
   * Output only. The manufacturer of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue manufacturer_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getManufacturerNameOrBuilder();

  /**
   * <pre>
   * Output only. The operating system of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the operatingSystemName field is set.
   */
  boolean hasOperatingSystemName();
  /**
   * <pre>
   * Output only. The operating system of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operatingSystemName.
   */
  com.google.protobuf.StringValue getOperatingSystemName();
  /**
   * <pre>
   * Output only. The operating system of the mobile device.
   * </pre>
   *
   * <code>.google.protobuf.StringValue operating_system_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getOperatingSystemNameOrBuilder();

  /**
   * <pre>
   * Output only. The type of mobile device.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.MobileDeviceTypeEnum.MobileDeviceType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of mobile device.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.MobileDeviceTypeEnum.MobileDeviceType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v4.enums.MobileDeviceTypeEnum.MobileDeviceType getType();
}
