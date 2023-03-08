// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: zkp.proto

package com.zkp.impl;

public final class ZKPProto {
  private ZKPProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ZKP_RegisterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ZKP_RegisterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ZKP_RegisterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ZKP_RegisterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ZKP_AuthenticationChallengeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ZKP_AuthenticationChallengeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ZKP_AuthenticationChallengeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ZKP_AuthenticationChallengeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ZKP_AuthenticationAnswerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ZKP_AuthenticationAnswerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ZKP_AuthenticationAnswerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ZKP_AuthenticationAnswerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tzkp.proto\022\003ZKP\"7\n\017RegisterRequest\022\014\n\004u" +
      "ser\030\001 \001(\t\022\n\n\002y1\030\002 \001(\t\022\n\n\002y2\030\003 \001(\t\"\022\n\020Reg" +
      "isterResponse\"F\n\036AuthenticationChallenge" +
      "Request\022\014\n\004user\030\001 \001(\t\022\n\n\002r1\030\002 \001(\t\022\n\n\002r2\030" +
      "\003 \001(\t\"=\n\037AuthenticationChallengeResponse" +
      "\022\017\n\007auth_id\030\001 \001(\t\022\t\n\001c\030\002 \001(\003\"9\n\033Authenti" +
      "cationAnswerRequest\022\017\n\007auth_id\030\001 \001(\t\022\t\n\001" +
      "s\030\002 \001(\003\"2\n\034AuthenticationAnswerResponse\022" +
      "\022\n\nsession_id\030\001 \001(\t2\216\002\n\004Auth\0229\n\010Register" +
      "\022\024.ZKP.RegisterRequest\032\025.ZKP.RegisterRes" +
      "ponse\"\000\022l\n\035CreateAuthenticationChallenge" +
      "\022#.ZKP.AuthenticationChallengeRequest\032$." +
      "ZKP.AuthenticationChallengeResponse\"\000\022]\n" +
      "\024VerifyAuthentication\022 .ZKP.Authenticati" +
      "onAnswerRequest\032!.ZKP.AuthenticationAnsw" +
      "erResponse\"\000B \n\014com.zkp.implB\010ZKPProtoP\001" +
      "\242\002\003ZKPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ZKP_RegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ZKP_RegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ZKP_RegisterRequest_descriptor,
        new java.lang.String[] { "User", "Y1", "Y2", });
    internal_static_ZKP_RegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ZKP_RegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ZKP_RegisterResponse_descriptor,
        new java.lang.String[] { });
    internal_static_ZKP_AuthenticationChallengeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ZKP_AuthenticationChallengeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ZKP_AuthenticationChallengeRequest_descriptor,
        new java.lang.String[] { "User", "R1", "R2", });
    internal_static_ZKP_AuthenticationChallengeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ZKP_AuthenticationChallengeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ZKP_AuthenticationChallengeResponse_descriptor,
        new java.lang.String[] { "AuthId", "C", });
    internal_static_ZKP_AuthenticationAnswerRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ZKP_AuthenticationAnswerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ZKP_AuthenticationAnswerRequest_descriptor,
        new java.lang.String[] { "AuthId", "S", });
    internal_static_ZKP_AuthenticationAnswerResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ZKP_AuthenticationAnswerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ZKP_AuthenticationAnswerResponse_descriptor,
        new java.lang.String[] { "SessionId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}