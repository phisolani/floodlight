/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sdnplatform.sync.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;

@SuppressWarnings("all") public class PutRequestMessage implements org.apache.thrift.TBase<PutRequestMessage, PutRequestMessage._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PutRequestMessage");

  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STORE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("storeName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField VERSIONED_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("versionedValue", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutRequestMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutRequestMessageTupleSchemeFactory());
  }

  public AsyncMessageHeader header; // required
  public String storeName; // required
  public ByteBuffer key; // required
  public VersionedValue versionedValue; // optional
  public ByteBuffer value; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HEADER((short)1, "header"),
    STORE_NAME((short)2, "storeName"),
    KEY((short)3, "key"),
    VERSIONED_VALUE((short)4, "versionedValue"),
    VALUE((short)5, "value");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HEADER
          return HEADER;
        case 2: // STORE_NAME
          return STORE_NAME;
        case 3: // KEY
          return KEY;
        case 4: // VERSIONED_VALUE
          return VERSIONED_VALUE;
        case 5: // VALUE
          return VALUE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
	public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
	public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.VERSIONED_VALUE,_Fields.VALUE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AsyncMessageHeader.class)));
    tmpMap.put(_Fields.STORE_NAME, new org.apache.thrift.meta_data.FieldMetaData("storeName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.VERSIONED_VALUE, new org.apache.thrift.meta_data.FieldMetaData("versionedValue", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, VersionedValue.class)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PutRequestMessage.class, metaDataMap);
  }

  public PutRequestMessage() {
  }

  public PutRequestMessage(
    AsyncMessageHeader header,
    String storeName,
    ByteBuffer key)
  {
    this();
    this.header = header;
    this.storeName = storeName;
    this.key = key;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutRequestMessage(PutRequestMessage other) {
    if (other.isSetHeader()) {
      this.header = new AsyncMessageHeader(other.header);
    }
    if (other.isSetStoreName()) {
      this.storeName = other.storeName;
    }
    if (other.isSetKey()) {
      this.key = org.apache.thrift.TBaseHelper.copyBinary(other.key);
;
    }
    if (other.isSetVersionedValue()) {
      this.versionedValue = new VersionedValue(other.versionedValue);
    }
    if (other.isSetValue()) {
      this.value = org.apache.thrift.TBaseHelper.copyBinary(other.value);
;
    }
  }

  @Override
public PutRequestMessage deepCopy() {
    return new PutRequestMessage(this);
  }

  @Override
  public void clear() {
    this.header = null;
    this.storeName = null;
    this.key = null;
    this.versionedValue = null;
    this.value = null;
  }

  public AsyncMessageHeader getHeader() {
    return this.header;
  }

  public PutRequestMessage setHeader(AsyncMessageHeader header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public String getStoreName() {
    return this.storeName;
  }

  public PutRequestMessage setStoreName(String storeName) {
    this.storeName = storeName;
    return this;
  }

  public void unsetStoreName() {
    this.storeName = null;
  }

  /** Returns true if field storeName is set (has been assigned a value) and false otherwise */
  public boolean isSetStoreName() {
    return this.storeName != null;
  }

  public void setStoreNameIsSet(boolean value) {
    if (!value) {
      this.storeName = null;
    }
  }

  public byte[] getKey() {
    setKey(org.apache.thrift.TBaseHelper.rightSize(key));
    return key == null ? null : key.array();
  }

  public ByteBuffer bufferForKey() {
    return key;
  }

  public PutRequestMessage setKey(byte[] key) {
    setKey(key == null ? (ByteBuffer)null : ByteBuffer.wrap(key));
    return this;
  }

  public PutRequestMessage setKey(ByteBuffer key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public VersionedValue getVersionedValue() {
    return this.versionedValue;
  }

  public PutRequestMessage setVersionedValue(VersionedValue versionedValue) {
    this.versionedValue = versionedValue;
    return this;
  }

  public void unsetVersionedValue() {
    this.versionedValue = null;
  }

  /** Returns true if field versionedValue is set (has been assigned a value) and false otherwise */
  public boolean isSetVersionedValue() {
    return this.versionedValue != null;
  }

  public void setVersionedValueIsSet(boolean value) {
    if (!value) {
      this.versionedValue = null;
    }
  }

  public byte[] getValue() {
    setValue(org.apache.thrift.TBaseHelper.rightSize(value));
    return value == null ? null : value.array();
  }

  public ByteBuffer bufferForValue() {
    return value;
  }

  public PutRequestMessage setValue(byte[] value) {
    setValue(value == null ? (ByteBuffer)null : ByteBuffer.wrap(value));
    return this;
  }

  public PutRequestMessage setValue(ByteBuffer value) {
    this.value = value;
    return this;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  @Override
public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((AsyncMessageHeader)value);
      }
      break;

    case STORE_NAME:
      if (value == null) {
        unsetStoreName();
      } else {
        setStoreName((String)value);
      }
      break;

    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((ByteBuffer)value);
      }
      break;

    case VERSIONED_VALUE:
      if (value == null) {
        unsetVersionedValue();
      } else {
        setVersionedValue((VersionedValue)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((ByteBuffer)value);
      }
      break;

    }
  }

  @Override
public Object getFieldValue(_Fields field) {
    switch (field) {
    case HEADER:
      return getHeader();

    case STORE_NAME:
      return getStoreName();

    case KEY:
      return getKey();

    case VERSIONED_VALUE:
      return getVersionedValue();

    case VALUE:
      return getValue();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HEADER:
      return isSetHeader();
    case STORE_NAME:
      return isSetStoreName();
    case KEY:
      return isSetKey();
    case VERSIONED_VALUE:
      return isSetVersionedValue();
    case VALUE:
      return isSetValue();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutRequestMessage)
      return this.equals((PutRequestMessage)that);
    return false;
  }

  public boolean equals(PutRequestMessage that) {
    if (that == null)
      return false;

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_storeName = true && this.isSetStoreName();
    boolean that_present_storeName = true && that.isSetStoreName();
    if (this_present_storeName || that_present_storeName) {
      if (!(this_present_storeName && that_present_storeName))
        return false;
      if (!this.storeName.equals(that.storeName))
        return false;
    }

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_versionedValue = true && this.isSetVersionedValue();
    boolean that_present_versionedValue = true && that.isSetVersionedValue();
    if (this_present_versionedValue || that_present_versionedValue) {
      if (!(this_present_versionedValue && that_present_versionedValue))
        return false;
      if (!this.versionedValue.equals(that.versionedValue))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
public int compareTo(PutRequestMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PutRequestMessage typedOther = other;

    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(typedOther.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, typedOther.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStoreName()).compareTo(typedOther.isSetStoreName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStoreName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.storeName, typedOther.storeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKey()).compareTo(typedOther.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, typedOther.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersionedValue()).compareTo(typedOther.isSetVersionedValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersionedValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionedValue, typedOther.versionedValue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(typedOther.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, typedOther.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @Override
public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  @Override
public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PutRequestMessage(");
    boolean first = true;

    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("storeName:");
    if (this.storeName == null) {
      sb.append("null");
    } else {
      sb.append(this.storeName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.key, sb);
    }
    first = false;
    if (isSetVersionedValue()) {
      if (!first) sb.append(", ");
      sb.append("versionedValue:");
      if (this.versionedValue == null) {
        sb.append("null");
      } else {
        sb.append(this.versionedValue);
      }
      first = false;
    }
    if (isSetValue()) {
      if (!first) sb.append(", ");
      sb.append("value:");
      if (this.value == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.value, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (header == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'header' was not present! Struct: " + toString());
    }
    if (storeName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'storeName' was not present! Struct: " + toString());
    }
    if (key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'key' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (header != null) {
      header.validate();
    }
    if (versionedValue != null) {
      versionedValue.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PutRequestMessageStandardSchemeFactory implements SchemeFactory {
    @Override
	public PutRequestMessageStandardScheme getScheme() {
      return new PutRequestMessageStandardScheme();
    }
  }

  private static class PutRequestMessageStandardScheme extends StandardScheme<PutRequestMessage> {

    @Override
	public void read(org.apache.thrift.protocol.TProtocol iprot, PutRequestMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new AsyncMessageHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STORE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.storeName = iprot.readString();
              struct.setStoreNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readBinary();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VERSIONED_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.versionedValue = new VersionedValue();
              struct.versionedValue.read(iprot);
              struct.setVersionedValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readBinary();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    @Override
	public void write(org.apache.thrift.protocol.TProtocol oprot, PutRequestMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        struct.header.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.storeName != null) {
        oprot.writeFieldBegin(STORE_NAME_FIELD_DESC);
        oprot.writeString(struct.storeName);
        oprot.writeFieldEnd();
      }
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeBinary(struct.key);
        oprot.writeFieldEnd();
      }
      if (struct.versionedValue != null) {
        if (struct.isSetVersionedValue()) {
          oprot.writeFieldBegin(VERSIONED_VALUE_FIELD_DESC);
          struct.versionedValue.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        if (struct.isSetValue()) {
          oprot.writeFieldBegin(VALUE_FIELD_DESC);
          oprot.writeBinary(struct.value);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutRequestMessageTupleSchemeFactory implements SchemeFactory {
    @Override
	public PutRequestMessageTupleScheme getScheme() {
      return new PutRequestMessageTupleScheme();
    }
  }

  private static class PutRequestMessageTupleScheme extends TupleScheme<PutRequestMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PutRequestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.header.write(oprot);
      oprot.writeString(struct.storeName);
      oprot.writeBinary(struct.key);
      BitSet optionals = new BitSet();
      if (struct.isSetVersionedValue()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetVersionedValue()) {
        struct.versionedValue.write(oprot);
      }
      if (struct.isSetValue()) {
        oprot.writeBinary(struct.value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PutRequestMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.header = new AsyncMessageHeader();
      struct.header.read(iprot);
      struct.setHeaderIsSet(true);
      struct.storeName = iprot.readString();
      struct.setStoreNameIsSet(true);
      struct.key = iprot.readBinary();
      struct.setKeyIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.versionedValue = new VersionedValue();
        struct.versionedValue.read(iprot);
        struct.setVersionedValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readBinary();
        struct.setValueIsSet(true);
      }
    }
  }

}

