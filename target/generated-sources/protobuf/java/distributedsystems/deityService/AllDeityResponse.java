// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deity.proto

package distributedsystems.deityService;

/**
 * Protobuf type {@code distributedsystems.deityService.AllDeityResponse}
 */
public final class AllDeityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:distributedsystems.deityService.AllDeityResponse)
    AllDeityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllDeityResponse.newBuilder() to construct.
  private AllDeityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllDeityResponse() {
    deity_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllDeityResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllDeityResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              deity_ = new java.util.ArrayList<distributedsystems.deityService.DeityResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            deity_.add(
                input.readMessage(distributedsystems.deityService.DeityResponse.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        deity_ = java.util.Collections.unmodifiableList(deity_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return distributedsystems.deityService.Deity.internal_static_distributedsystems_deityService_AllDeityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return distributedsystems.deityService.Deity.internal_static_distributedsystems_deityService_AllDeityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            distributedsystems.deityService.AllDeityResponse.class, distributedsystems.deityService.AllDeityResponse.Builder.class);
  }

  public static final int DEITY_FIELD_NUMBER = 1;
  private java.util.List<distributedsystems.deityService.DeityResponse> deity_;
  /**
   * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public java.util.List<distributedsystems.deityService.DeityResponse> getDeityList() {
    return deity_;
  }
  /**
   * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends distributedsystems.deityService.DeityResponseOrBuilder> 
      getDeityOrBuilderList() {
    return deity_;
  }
  /**
   * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public int getDeityCount() {
    return deity_.size();
  }
  /**
   * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public distributedsystems.deityService.DeityResponse getDeity(int index) {
    return deity_.get(index);
  }
  /**
   * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public distributedsystems.deityService.DeityResponseOrBuilder getDeityOrBuilder(
      int index) {
    return deity_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < deity_.size(); i++) {
      output.writeMessage(1, deity_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deity_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, deity_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof distributedsystems.deityService.AllDeityResponse)) {
      return super.equals(obj);
    }
    distributedsystems.deityService.AllDeityResponse other = (distributedsystems.deityService.AllDeityResponse) obj;

    if (!getDeityList()
        .equals(other.getDeityList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDeityCount() > 0) {
      hash = (37 * hash) + DEITY_FIELD_NUMBER;
      hash = (53 * hash) + getDeityList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static distributedsystems.deityService.AllDeityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static distributedsystems.deityService.AllDeityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static distributedsystems.deityService.AllDeityResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(distributedsystems.deityService.AllDeityResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code distributedsystems.deityService.AllDeityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:distributedsystems.deityService.AllDeityResponse)
      distributedsystems.deityService.AllDeityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return distributedsystems.deityService.Deity.internal_static_distributedsystems_deityService_AllDeityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return distributedsystems.deityService.Deity.internal_static_distributedsystems_deityService_AllDeityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              distributedsystems.deityService.AllDeityResponse.class, distributedsystems.deityService.AllDeityResponse.Builder.class);
    }

    // Construct using distributedsystems.deityService.AllDeityResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDeityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deityBuilder_ == null) {
        deity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        deityBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return distributedsystems.deityService.Deity.internal_static_distributedsystems_deityService_AllDeityResponse_descriptor;
    }

    @java.lang.Override
    public distributedsystems.deityService.AllDeityResponse getDefaultInstanceForType() {
      return distributedsystems.deityService.AllDeityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public distributedsystems.deityService.AllDeityResponse build() {
      distributedsystems.deityService.AllDeityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public distributedsystems.deityService.AllDeityResponse buildPartial() {
      distributedsystems.deityService.AllDeityResponse result = new distributedsystems.deityService.AllDeityResponse(this);
      int from_bitField0_ = bitField0_;
      if (deityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deity_ = java.util.Collections.unmodifiableList(deity_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deity_ = deity_;
      } else {
        result.deity_ = deityBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof distributedsystems.deityService.AllDeityResponse) {
        return mergeFrom((distributedsystems.deityService.AllDeityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(distributedsystems.deityService.AllDeityResponse other) {
      if (other == distributedsystems.deityService.AllDeityResponse.getDefaultInstance()) return this;
      if (deityBuilder_ == null) {
        if (!other.deity_.isEmpty()) {
          if (deity_.isEmpty()) {
            deity_ = other.deity_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeityIsMutable();
            deity_.addAll(other.deity_);
          }
          onChanged();
        }
      } else {
        if (!other.deity_.isEmpty()) {
          if (deityBuilder_.isEmpty()) {
            deityBuilder_.dispose();
            deityBuilder_ = null;
            deity_ = other.deity_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deityBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeityFieldBuilder() : null;
          } else {
            deityBuilder_.addAllMessages(other.deity_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      distributedsystems.deityService.AllDeityResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (distributedsystems.deityService.AllDeityResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<distributedsystems.deityService.DeityResponse> deity_ =
      java.util.Collections.emptyList();
    private void ensureDeityIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deity_ = new java.util.ArrayList<distributedsystems.deityService.DeityResponse>(deity_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        distributedsystems.deityService.DeityResponse, distributedsystems.deityService.DeityResponse.Builder, distributedsystems.deityService.DeityResponseOrBuilder> deityBuilder_;

    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public java.util.List<distributedsystems.deityService.DeityResponse> getDeityList() {
      if (deityBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deity_);
      } else {
        return deityBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public int getDeityCount() {
      if (deityBuilder_ == null) {
        return deity_.size();
      } else {
        return deityBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public distributedsystems.deityService.DeityResponse getDeity(int index) {
      if (deityBuilder_ == null) {
        return deity_.get(index);
      } else {
        return deityBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder setDeity(
        int index, distributedsystems.deityService.DeityResponse value) {
      if (deityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeityIsMutable();
        deity_.set(index, value);
        onChanged();
      } else {
        deityBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder setDeity(
        int index, distributedsystems.deityService.DeityResponse.Builder builderForValue) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.set(index, builderForValue.build());
        onChanged();
      } else {
        deityBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(distributedsystems.deityService.DeityResponse value) {
      if (deityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeityIsMutable();
        deity_.add(value);
        onChanged();
      } else {
        deityBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(
        int index, distributedsystems.deityService.DeityResponse value) {
      if (deityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeityIsMutable();
        deity_.add(index, value);
        onChanged();
      } else {
        deityBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(
        distributedsystems.deityService.DeityResponse.Builder builderForValue) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.add(builderForValue.build());
        onChanged();
      } else {
        deityBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(
        int index, distributedsystems.deityService.DeityResponse.Builder builderForValue) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.add(index, builderForValue.build());
        onChanged();
      } else {
        deityBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder addAllDeity(
        java.lang.Iterable<? extends distributedsystems.deityService.DeityResponse> values) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, deity_);
        onChanged();
      } else {
        deityBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder clearDeity() {
      if (deityBuilder_ == null) {
        deity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deityBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public Builder removeDeity(int index) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.remove(index);
        onChanged();
      } else {
        deityBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public distributedsystems.deityService.DeityResponse.Builder getDeityBuilder(
        int index) {
      return getDeityFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public distributedsystems.deityService.DeityResponseOrBuilder getDeityOrBuilder(
        int index) {
      if (deityBuilder_ == null) {
        return deity_.get(index);  } else {
        return deityBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public java.util.List<? extends distributedsystems.deityService.DeityResponseOrBuilder> 
         getDeityOrBuilderList() {
      if (deityBuilder_ != null) {
        return deityBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deity_);
      }
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public distributedsystems.deityService.DeityResponse.Builder addDeityBuilder() {
      return getDeityFieldBuilder().addBuilder(
          distributedsystems.deityService.DeityResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public distributedsystems.deityService.DeityResponse.Builder addDeityBuilder(
        int index) {
      return getDeityFieldBuilder().addBuilder(
          index, distributedsystems.deityService.DeityResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .distributedsystems.deityService.DeityResponse Deity = 1;</code>
     */
    public java.util.List<distributedsystems.deityService.DeityResponse.Builder> 
         getDeityBuilderList() {
      return getDeityFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        distributedsystems.deityService.DeityResponse, distributedsystems.deityService.DeityResponse.Builder, distributedsystems.deityService.DeityResponseOrBuilder> 
        getDeityFieldBuilder() {
      if (deityBuilder_ == null) {
        deityBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            distributedsystems.deityService.DeityResponse, distributedsystems.deityService.DeityResponse.Builder, distributedsystems.deityService.DeityResponseOrBuilder>(
                deity_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deity_ = null;
      }
      return deityBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:distributedsystems.deityService.AllDeityResponse)
  }

  // @@protoc_insertion_point(class_scope:distributedsystems.deityService.AllDeityResponse)
  private static final distributedsystems.deityService.AllDeityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new distributedsystems.deityService.AllDeityResponse();
  }

  public static distributedsystems.deityService.AllDeityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllDeityResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllDeityResponse>() {
    @java.lang.Override
    public AllDeityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllDeityResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllDeityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllDeityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public distributedsystems.deityService.AllDeityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
