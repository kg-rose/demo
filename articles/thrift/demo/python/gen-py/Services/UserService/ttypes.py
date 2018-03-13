#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TFrozenDict, TException, TApplicationException
from thrift.protocol.TProtocol import TProtocolException
import sys

from thrift.transport import TTransport


class ErrCodeEnum(object):
    SERVER_ERROR = 10001
    PARAM_ERROR = 20001

    _VALUES_TO_NAMES = {
        10001: "SERVER_ERROR",
        20001: "PARAM_ERROR",
    }

    _NAMES_TO_VALUES = {
        "SERVER_ERROR": 10001,
        "PARAM_ERROR": 20001,
    }


class UserListReq(object):
    """
    Attributes:
     - uidList
    """

    thrift_spec = (
        None,  # 0
        (1, TType.LIST, 'uidList', (TType.I32, None, False), None, ),  # 1
    )

    def __init__(self, uidList=None,):
        self.uidList = uidList

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.uidList = []
                    (_etype3, _size0) = iprot.readListBegin()
                    for _i4 in range(_size0):
                        _elem5 = iprot.readI32()
                        self.uidList.append(_elem5)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('UserListReq')
        if self.uidList is not None:
            oprot.writeFieldBegin('uidList', TType.LIST, 1)
            oprot.writeListBegin(TType.I32, len(self.uidList))
            for iter6 in self.uidList:
                oprot.writeI32(iter6)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.uidList is None:
            raise TProtocolException(message='Required field uidList is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class UserInfo(object):
    """
    Attributes:
     - uid
     - name
     - sex
     - age
     - nick
    """

    thrift_spec = (
        None,  # 0
        (1, TType.I32, 'uid', None, None, ),  # 1
        (2, TType.STRING, 'name', 'UTF8', None, ),  # 2
        (3, TType.BYTE, 'sex', None, None, ),  # 3
        (4, TType.I16, 'age', None, None, ),  # 4
        (5, TType.STRING, 'nick', 'UTF8', "", ),  # 5
    )

    def __init__(self, uid=None, name=None, sex=None, age=None, nick=thrift_spec[5][4],):
        self.uid = uid
        self.name = name
        self.sex = sex
        self.age = age
        self.nick = nick

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.I32:
                    self.uid = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.name = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.BYTE:
                    self.sex = iprot.readByte()
                else:
                    iprot.skip(ftype)
            elif fid == 4:
                if ftype == TType.I16:
                    self.age = iprot.readI16()
                else:
                    iprot.skip(ftype)
            elif fid == 5:
                if ftype == TType.STRING:
                    self.nick = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('UserInfo')
        if self.uid is not None:
            oprot.writeFieldBegin('uid', TType.I32, 1)
            oprot.writeI32(self.uid)
            oprot.writeFieldEnd()
        if self.name is not None:
            oprot.writeFieldBegin('name', TType.STRING, 2)
            oprot.writeString(self.name.encode('utf-8') if sys.version_info[0] == 2 else self.name)
            oprot.writeFieldEnd()
        if self.sex is not None:
            oprot.writeFieldBegin('sex', TType.BYTE, 3)
            oprot.writeByte(self.sex)
            oprot.writeFieldEnd()
        if self.age is not None:
            oprot.writeFieldBegin('age', TType.I16, 4)
            oprot.writeI16(self.age)
            oprot.writeFieldEnd()
        if self.nick is not None:
            oprot.writeFieldBegin('nick', TType.STRING, 5)
            oprot.writeString(self.nick.encode('utf-8') if sys.version_info[0] == 2 else self.nick)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.uid is None:
            raise TProtocolException(message='Required field uid is unset!')
        if self.name is None:
            raise TProtocolException(message='Required field name is unset!')
        if self.sex is None:
            raise TProtocolException(message='Required field sex is unset!')
        if self.age is None:
            raise TProtocolException(message='Required field age is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class UserListResp(object):
    """
    Attributes:
     - lists
    """

    thrift_spec = (
        None,  # 0
        (1, TType.LIST, 'lists', (TType.STRUCT, (UserInfo, UserInfo.thrift_spec), False), None, ),  # 1
    )

    def __init__(self, lists=None,):
        self.lists = lists

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.lists = []
                    (_etype10, _size7) = iprot.readListBegin()
                    for _i11 in range(_size7):
                        _elem12 = UserInfo()
                        _elem12.read(iprot)
                        self.lists.append(_elem12)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('UserListResp')
        if self.lists is not None:
            oprot.writeFieldBegin('lists', TType.LIST, 1)
            oprot.writeListBegin(TType.STRUCT, len(self.lists))
            for iter13 in self.lists:
                iter13.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        if self.lists is None:
            raise TProtocolException(message='Required field lists is unset!')
        return

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)


class ApiErrorException(TException):
    """
    Attributes:
     - errCode
     - errMsg
    """

    thrift_spec = (
        None,  # 0
        (1, TType.I32, 'errCode', None, None, ),  # 1
        (2, TType.STRING, 'errMsg', 'UTF8', None, ),  # 2
    )

    def __init__(self, errCode=None, errMsg=None,):
        self.errCode = errCode
        self.errMsg = errMsg

    def read(self, iprot):
        if iprot._fast_decode is not None and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None:
            iprot._fast_decode(self, iprot, (self.__class__, self.thrift_spec))
            return
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.I32:
                    self.errCode = iprot.readI32()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.errMsg = iprot.readString().decode('utf-8') if sys.version_info[0] == 2 else iprot.readString()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()

    def write(self, oprot):
        if oprot._fast_encode is not None and self.thrift_spec is not None:
            oprot.trans.write(oprot._fast_encode(self, (self.__class__, self.thrift_spec)))
            return
        oprot.writeStructBegin('ApiErrorException')
        if self.errCode is not None:
            oprot.writeFieldBegin('errCode', TType.I32, 1)
            oprot.writeI32(self.errCode)
            oprot.writeFieldEnd()
        if self.errMsg is not None:
            oprot.writeFieldBegin('errMsg', TType.STRING, 2)
            oprot.writeString(self.errMsg.encode('utf-8') if sys.version_info[0] == 2 else self.errMsg)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __str__(self):
        return repr(self)

    def __repr__(self):
        L = ['%s=%r' % (key, value)
             for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)
