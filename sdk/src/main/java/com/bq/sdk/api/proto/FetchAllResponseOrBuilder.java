// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.bq.sdk.api.proto;

public interface FetchAllResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.FetchAllResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  java.util.List<com.bq.sdk.api.proto.Person> 
      getPeopleList();
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  com.bq.sdk.api.proto.Person getPeople(int index);
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  java.util.List<? extends com.bq.sdk.api.proto.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .proto.Person people = 1;</code>
   */
  com.bq.sdk.api.proto.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
