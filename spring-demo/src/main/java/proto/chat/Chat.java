// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package proto.chat;

public final class Chat {
  private Chat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_chat_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_chat_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_chat_UserInChat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_chat_UserInChat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_chat_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_chat_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nchat.proto\022\nproto.chat\"R\n\013ChatMessage\022" +
      "\014\n\004from\030\001 \001(\t\022\013\n\003msg\030\002 \001(\t\022\n\n\002to\030\003 \001(\t\022\016" +
      "\n\006typing\030\004 \001(\010\022\014\n\004read\030\005 \001(\010\"\036\n\nUserInCh" +
      "at\022\020\n\010username\030\001 \001(\t\"\007\n\005Empty2\211\001\n\013ChatSe" +
      "rvice\0227\n\007sendMsg\022\027.proto.chat.ChatMessag" +
      "e\032\021.proto.chat.Empty\"\000\022A\n\nreceiveMsg\022\026.p" +
      "roto.chat.UserInChat\032\027.proto.chat.ChatMe" +
      "ssage\"\0000\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_proto_chat_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_chat_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_chat_ChatMessage_descriptor,
        new java.lang.String[] { "From", "Msg", "To", "Typing", "Read", });
    internal_static_proto_chat_UserInChat_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_chat_UserInChat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_chat_UserInChat_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_proto_chat_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_chat_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_chat_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}