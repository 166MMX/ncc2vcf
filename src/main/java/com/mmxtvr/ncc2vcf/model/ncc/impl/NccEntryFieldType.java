package com.mmxtvr.ncc2vcf.model.ncc.impl;

import java.util.HashMap;
import java.util.Map;

public enum NccEntryFieldType
{
    NAME(202),
    PHONE_GENERAL(208),
    PHONE_HOME(209),
    PHONE_MOBILE(210),
    PHONE_OFFICE(213),
    PHONE_FAX(219),
    DETAIL_EMAIL(205),
    DETAIL_WEB(200),
    DETAIL_POSTAL(200),
    DETAIL_NOTE(204),
    CALLER_GROUP_REF(217);

    private int key;

    private static final Map<Integer,NccEntryFieldType> typeMap = new HashMap<Integer,NccEntryFieldType>();

    static
    {
        for(NccEntryFieldType type : NccEntryFieldType.values())
        {
            typeMap.put(type.getKey(), type);
        }
    }

    private NccEntryFieldType(int key)
    {
        this.key = key;
    }

    public int getKey()
    {
        return key;
    }

    public static NccEntryFieldType getTypeByKey(int key)
    {
        return typeMap.get(key);
    }
}
