// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/click_view.proto

package com.google.ads.googleads.v5.resources;

public interface ClickViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.ClickView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the click view.
   * Click view resource names have the form:
   * `customers/{customer_id}/clickViews/{date (yyyy-MM-dd)}~{gclid}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the click view.
   * Click view resource names have the form:
   * `customers/{customer_id}/clickViews/{date (yyyy-MM-dd)}~{gclid}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The Google Click ID.
   * </pre>
   *
   * <code>string gclid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the gclid field is set.
   */
  boolean hasGclid();
  /**
   * <pre>
   * Output only. The Google Click ID.
   * </pre>
   *
   * <code>string gclid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The gclid.
   */
  java.lang.String getGclid();
  /**
   * <pre>
   * Output only. The Google Click ID.
   * </pre>
   *
   * <code>string gclid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for gclid.
   */
  com.google.protobuf.ByteString
      getGclidBytes();

  /**
   * <pre>
   * Output only. The location criteria matching the area of interest associated with the
   * impression.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ClickLocation area_of_interest = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the areaOfInterest field is set.
   */
  boolean hasAreaOfInterest();
  /**
   * <pre>
   * Output only. The location criteria matching the area of interest associated with the
   * impression.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ClickLocation area_of_interest = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The areaOfInterest.
   */
  com.google.ads.googleads.v5.common.ClickLocation getAreaOfInterest();
  /**
   * <pre>
   * Output only. The location criteria matching the area of interest associated with the
   * impression.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ClickLocation area_of_interest = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v5.common.ClickLocationOrBuilder getAreaOfInterestOrBuilder();

  /**
   * <pre>
   * Output only. The location criteria matching the location of presence associated with the
   * impression.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ClickLocation location_of_presence = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the locationOfPresence field is set.
   */
  boolean hasLocationOfPresence();
  /**
   * <pre>
   * Output only. The location criteria matching the location of presence associated with the
   * impression.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ClickLocation location_of_presence = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locationOfPresence.
   */
  com.google.ads.googleads.v5.common.ClickLocation getLocationOfPresence();
  /**
   * <pre>
   * Output only. The location criteria matching the location of presence associated with the
   * impression.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.common.ClickLocation location_of_presence = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v5.common.ClickLocationOrBuilder getLocationOfPresenceOrBuilder();

  /**
   * <pre>
   * Output only. Page number in search results where the ad was shown.
   * </pre>
   *
   * <code>int64 page_number = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the pageNumber field is set.
   */
  boolean hasPageNumber();
  /**
   * <pre>
   * Output only. Page number in search results where the ad was shown.
   * </pre>
   *
   * <code>int64 page_number = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pageNumber.
   */
  long getPageNumber();

  /**
   * <pre>
   * Output only. The associated ad.
   * </pre>
   *
   * <code>string ad_group_ad = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupAd field is set.
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * Output only. The associated ad.
   * </pre>
   *
   * <code>string ad_group_ad = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAd.
   */
  java.lang.String getAdGroupAd();
  /**
   * <pre>
   * Output only. The associated ad.
   * </pre>
   *
   * <code>string ad_group_ad = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupAd.
   */
  com.google.protobuf.ByteString
      getAdGroupAdBytes();
}
