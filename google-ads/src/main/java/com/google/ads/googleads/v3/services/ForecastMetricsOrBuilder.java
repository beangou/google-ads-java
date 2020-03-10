// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/keyword_plan_service.proto

package com.google.ads.googleads.v3.services;

public interface ForecastMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.ForecastMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Impressions
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue impressions = 1;</code>
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Impressions
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue impressions = 1;</code>
   */
  com.google.protobuf.DoubleValue getImpressions();
  /**
   * <pre>
   * Impressions
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue impressions = 1;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getImpressionsOrBuilder();

  /**
   * <pre>
   * Ctr
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue ctr = 2;</code>
   */
  boolean hasCtr();
  /**
   * <pre>
   * Ctr
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue ctr = 2;</code>
   */
  com.google.protobuf.DoubleValue getCtr();
  /**
   * <pre>
   * Ctr
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue ctr = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getCtrOrBuilder();

  /**
   * <pre>
   * AVG cpc
   * </pre>
   *
   * <code>.google.protobuf.Int64Value average_cpc = 3;</code>
   */
  boolean hasAverageCpc();
  /**
   * <pre>
   * AVG cpc
   * </pre>
   *
   * <code>.google.protobuf.Int64Value average_cpc = 3;</code>
   */
  com.google.protobuf.Int64Value getAverageCpc();
  /**
   * <pre>
   * AVG cpc
   * </pre>
   *
   * <code>.google.protobuf.Int64Value average_cpc = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAverageCpcOrBuilder();

  /**
   * <pre>
   * Clicks
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue clicks = 5;</code>
   */
  boolean hasClicks();
  /**
   * <pre>
   * Clicks
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue clicks = 5;</code>
   */
  com.google.protobuf.DoubleValue getClicks();
  /**
   * <pre>
   * Clicks
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue clicks = 5;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getClicksOrBuilder();

  /**
   * <pre>
   * Cost
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 6;</code>
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Cost
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 6;</code>
   */
  com.google.protobuf.Int64Value getCostMicros();
  /**
   * <pre>
   * Cost
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder();
}