/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package Services.UserService;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-03-13")
public class UserListReq implements org.apache.thrift.TBase<UserListReq, UserListReq._Fields>, java.io.Serializable, Cloneable, Comparable<UserListReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserListReq");

  private static final org.apache.thrift.protocol.TField UID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("uidList", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserListReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserListReqTupleSchemeFactory();

  public java.util.List<java.lang.Integer> uidList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID_LIST((short)1, "uidList");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UID_LIST
          return UID_LIST;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID_LIST, new org.apache.thrift.meta_data.FieldMetaData("uidList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserListReq.class, metaDataMap);
  }

  public UserListReq() {
  }

  public UserListReq(
    java.util.List<java.lang.Integer> uidList)
  {
    this();
    this.uidList = uidList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserListReq(UserListReq other) {
    if (other.isSetUidList()) {
      java.util.List<java.lang.Integer> __this__uidList = new java.util.ArrayList<java.lang.Integer>(other.uidList);
      this.uidList = __this__uidList;
    }
  }

  public UserListReq deepCopy() {
    return new UserListReq(this);
  }

  @Override
  public void clear() {
    this.uidList = null;
  }

  public int getUidListSize() {
    return (this.uidList == null) ? 0 : this.uidList.size();
  }

  public java.util.Iterator<java.lang.Integer> getUidListIterator() {
    return (this.uidList == null) ? null : this.uidList.iterator();
  }

  public void addToUidList(int elem) {
    if (this.uidList == null) {
      this.uidList = new java.util.ArrayList<java.lang.Integer>();
    }
    this.uidList.add(elem);
  }

  public java.util.List<java.lang.Integer> getUidList() {
    return this.uidList;
  }

  public UserListReq setUidList(java.util.List<java.lang.Integer> uidList) {
    this.uidList = uidList;
    return this;
  }

  public void unsetUidList() {
    this.uidList = null;
  }

  /** Returns true if field uidList is set (has been assigned a value) and false otherwise */
  public boolean isSetUidList() {
    return this.uidList != null;
  }

  public void setUidListIsSet(boolean value) {
    if (!value) {
      this.uidList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case UID_LIST:
      if (value == null) {
        unsetUidList();
      } else {
        setUidList((java.util.List<java.lang.Integer>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UID_LIST:
      return getUidList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UID_LIST:
      return isSetUidList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserListReq)
      return this.equals((UserListReq)that);
    return false;
  }

  public boolean equals(UserListReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_uidList = true && this.isSetUidList();
    boolean that_present_uidList = true && that.isSetUidList();
    if (this_present_uidList || that_present_uidList) {
      if (!(this_present_uidList && that_present_uidList))
        return false;
      if (!this.uidList.equals(that.uidList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUidList()) ? 131071 : 524287);
    if (isSetUidList())
      hashCode = hashCode * 8191 + uidList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserListReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUidList()).compareTo(other.isSetUidList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUidList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uidList, other.uidList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserListReq(");
    boolean first = true;

    sb.append("uidList:");
    if (this.uidList == null) {
      sb.append("null");
    } else {
      sb.append(this.uidList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uidList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uidList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserListReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserListReqStandardScheme getScheme() {
      return new UserListReqStandardScheme();
    }
  }

  private static class UserListReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserListReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserListReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.uidList = new java.util.ArrayList<java.lang.Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.uidList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setUidListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserListReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uidList != null) {
        oprot.writeFieldBegin(UID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.uidList.size()));
          for (int _iter3 : struct.uidList)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserListReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserListReqTupleScheme getScheme() {
      return new UserListReqTupleScheme();
    }
  }

  private static class UserListReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserListReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserListReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.uidList.size());
        for (int _iter4 : struct.uidList)
        {
          oprot.writeI32(_iter4);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserListReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.uidList = new java.util.ArrayList<java.lang.Integer>(_list5.size);
        int _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readI32();
          struct.uidList.add(_elem6);
        }
      }
      struct.setUidListIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

