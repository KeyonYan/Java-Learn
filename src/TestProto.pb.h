// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestProto.proto

#ifndef PROTOBUF_INCLUDED_TestProto_2eproto
#define PROTOBUF_INCLUDED_TestProto_2eproto

#include <limits>
#include <string>

#include <google/protobuf/port_def.inc>
#if PROTOBUF_VERSION < 3007000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers. Please update
#error your headers.
#endif
#if 3007001 < PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers. Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/port_undef.inc>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_table_driven.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/inlined_string_field.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/unknown_field_set.h>
#include <google/protobuf/descriptor.pb.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>
#define PROTOBUF_INTERNAL_EXPORT_TestProto_2eproto

// Internal implementation detail -- do not use these members.
struct TableStruct_TestProto_2eproto {
  static const ::google::protobuf::internal::ParseTableField entries[]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::google::protobuf::internal::AuxillaryParseTableField aux[]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::google::protobuf::internal::ParseTable schema[1]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::google::protobuf::internal::FieldMetadata field_metadata[];
  static const ::google::protobuf::internal::SerializationTable serialization_table[];
  static const ::google::protobuf::uint32 offsets[];
};
void AddDescriptors_TestProto_2eproto();
namespace com {
namespace example {
namespace protobuf {
class Msg;
class MsgDefaultTypeInternal;
extern MsgDefaultTypeInternal _Msg_default_instance_;
}  // namespace protobuf
}  // namespace example
}  // namespace com
namespace google {
namespace protobuf {
template<> ::com::example::protobuf::Msg* Arena::CreateMaybeMessage<::com::example::protobuf::Msg>(Arena*);
}  // namespace protobuf
}  // namespace google
namespace com {
namespace example {
namespace protobuf {

// ===================================================================

class Msg :
    public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:com.example.protobuf.Msg) */ {
 public:
  Msg();
  virtual ~Msg();

  Msg(const Msg& from);

  inline Msg& operator=(const Msg& from) {
    CopyFrom(from);
    return *this;
  }
  #if LANG_CXX11
  Msg(Msg&& from) noexcept
    : Msg() {
    *this = ::std::move(from);
  }

  inline Msg& operator=(Msg&& from) noexcept {
    if (GetArenaNoVirtual() == from.GetArenaNoVirtual()) {
      if (this != &from) InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }
  #endif
  static const ::google::protobuf::Descriptor* descriptor() {
    return default_instance().GetDescriptor();
  }
  static const Msg& default_instance();

  static void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  static inline const Msg* internal_default_instance() {
    return reinterpret_cast<const Msg*>(
               &_Msg_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  void Swap(Msg* other);
  friend void swap(Msg& a, Msg& b) {
    a.Swap(&b);
  }

  // implements Message ----------------------------------------------

  inline Msg* New() const final {
    return CreateMaybeMessage<Msg>(nullptr);
  }

  Msg* New(::google::protobuf::Arena* arena) const final {
    return CreateMaybeMessage<Msg>(arena);
  }
  void CopyFrom(const ::google::protobuf::Message& from) final;
  void MergeFrom(const ::google::protobuf::Message& from) final;
  void CopyFrom(const Msg& from);
  void MergeFrom(const Msg& from);
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  size_t ByteSizeLong() const final;
  #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  static const char* _InternalParse(const char* begin, const char* end, void* object, ::google::protobuf::internal::ParseContext* ctx);
  ::google::protobuf::internal::ParseFunc _ParseFunc() const final { return _InternalParse; }
  #else
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input) final;
  #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const final;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      ::google::protobuf::uint8* target) const final;
  int GetCachedSize() const final { return _cached_size_.Get(); }

  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(Msg* other);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return nullptr;
  }
  inline void* MaybeArenaPtr() const {
    return nullptr;
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string create_time = 2 [(.com.example.protobuf.over_write) = 0];
  void clear_create_time();
  static const int kCreateTimeFieldNumber = 2;
  const ::std::string& create_time() const;
  void set_create_time(const ::std::string& value);
  #if LANG_CXX11
  void set_create_time(::std::string&& value);
  #endif
  void set_create_time(const char* value);
  void set_create_time(const char* value, size_t size);
  ::std::string* mutable_create_time();
  ::std::string* release_create_time();
  void set_allocated_create_time(::std::string* create_time);

  // string content = 3 [(.com.example.protobuf.over_write) = 1];
  void clear_content();
  static const int kContentFieldNumber = 3;
  const ::std::string& content() const;
  void set_content(const ::std::string& value);
  #if LANG_CXX11
  void set_content(::std::string&& value);
  #endif
  void set_content(const char* value);
  void set_content(const char* value, size_t size);
  ::std::string* mutable_content();
  ::std::string* release_content();
  void set_allocated_content(::std::string* content);

  // uint32 id = 1;
  void clear_id();
  static const int kIdFieldNumber = 1;
  ::google::protobuf::uint32 id() const;
  void set_id(::google::protobuf::uint32 value);

  // @@protoc_insertion_point(class_scope:com.example.protobuf.Msg)
 private:
  class HasBitSetters;

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr create_time_;
  ::google::protobuf::internal::ArenaStringPtr content_;
  ::google::protobuf::uint32 id_;
  mutable ::google::protobuf::internal::CachedSize _cached_size_;
  friend struct ::TableStruct_TestProto_2eproto;
};
// ===================================================================

static const int kOverWriteFieldNumber = 50001;
extern ::google::protobuf::internal::ExtensionIdentifier< ::google::protobuf::FieldOptions,
    ::google::protobuf::internal::PrimitiveTypeTraits< ::google::protobuf::int32 >, 5, false >
  over_write;

// ===================================================================

#ifdef __GNUC__
  #pragma GCC diagnostic push
  #pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// Msg

// uint32 id = 1;
inline void Msg::clear_id() {
  id_ = 0u;
}
inline ::google::protobuf::uint32 Msg::id() const {
  // @@protoc_insertion_point(field_get:com.example.protobuf.Msg.id)
  return id_;
}
inline void Msg::set_id(::google::protobuf::uint32 value) {
  
  id_ = value;
  // @@protoc_insertion_point(field_set:com.example.protobuf.Msg.id)
}

// string create_time = 2 [(.com.example.protobuf.over_write) = 0];
inline void Msg::clear_create_time() {
  create_time_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Msg::create_time() const {
  // @@protoc_insertion_point(field_get:com.example.protobuf.Msg.create_time)
  return create_time_.GetNoArena();
}
inline void Msg::set_create_time(const ::std::string& value) {
  
  create_time_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:com.example.protobuf.Msg.create_time)
}
#if LANG_CXX11
inline void Msg::set_create_time(::std::string&& value) {
  
  create_time_.SetNoArena(
    &::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::move(value));
  // @@protoc_insertion_point(field_set_rvalue:com.example.protobuf.Msg.create_time)
}
#endif
inline void Msg::set_create_time(const char* value) {
  GOOGLE_DCHECK(value != nullptr);
  
  create_time_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:com.example.protobuf.Msg.create_time)
}
inline void Msg::set_create_time(const char* value, size_t size) {
  
  create_time_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:com.example.protobuf.Msg.create_time)
}
inline ::std::string* Msg::mutable_create_time() {
  
  // @@protoc_insertion_point(field_mutable:com.example.protobuf.Msg.create_time)
  return create_time_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Msg::release_create_time() {
  // @@protoc_insertion_point(field_release:com.example.protobuf.Msg.create_time)
  
  return create_time_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Msg::set_allocated_create_time(::std::string* create_time) {
  if (create_time != nullptr) {
    
  } else {
    
  }
  create_time_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), create_time);
  // @@protoc_insertion_point(field_set_allocated:com.example.protobuf.Msg.create_time)
}

// string content = 3 [(.com.example.protobuf.over_write) = 1];
inline void Msg::clear_content() {
  content_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Msg::content() const {
  // @@protoc_insertion_point(field_get:com.example.protobuf.Msg.content)
  return content_.GetNoArena();
}
inline void Msg::set_content(const ::std::string& value) {
  
  content_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:com.example.protobuf.Msg.content)
}
#if LANG_CXX11
inline void Msg::set_content(::std::string&& value) {
  
  content_.SetNoArena(
    &::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::move(value));
  // @@protoc_insertion_point(field_set_rvalue:com.example.protobuf.Msg.content)
}
#endif
inline void Msg::set_content(const char* value) {
  GOOGLE_DCHECK(value != nullptr);
  
  content_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:com.example.protobuf.Msg.content)
}
inline void Msg::set_content(const char* value, size_t size) {
  
  content_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:com.example.protobuf.Msg.content)
}
inline ::std::string* Msg::mutable_content() {
  
  // @@protoc_insertion_point(field_mutable:com.example.protobuf.Msg.content)
  return content_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Msg::release_content() {
  // @@protoc_insertion_point(field_release:com.example.protobuf.Msg.content)
  
  return content_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Msg::set_allocated_content(::std::string* content) {
  if (content != nullptr) {
    
  } else {
    
  }
  content_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), content);
  // @@protoc_insertion_point(field_set_allocated:com.example.protobuf.Msg.content)
}

#ifdef __GNUC__
  #pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace example
}  // namespace com

// @@protoc_insertion_point(global_scope)

#include <google/protobuf/port_undef.inc>
#endif  // PROTOBUF_INCLUDED_TestProto_2eproto
