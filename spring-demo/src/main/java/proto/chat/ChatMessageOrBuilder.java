// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package proto.chat;

public interface ChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.chat.ChatMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1;</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1;</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>string msg = 2;</code>
   * @return The msg.
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 2;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>string to = 3;</code>
   * @return The to.
   */
  java.lang.String getTo();
  /**
   * <code>string to = 3;</code>
   * @return The bytes for to.
   */
  com.google.protobuf.ByteString
      getToBytes();

  /**
   * <code>bool typing = 4;</code>
   * @return The typing.
   */
  boolean getTyping();

  /**
   * <code>bool read = 5;</code>
   * @return The read.
   */
  boolean getRead();
}