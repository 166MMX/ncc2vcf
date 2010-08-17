package com.mmxtvr.ncc2vcf.model.ncc.impl;

import java.util.HashMap;
import java.util.Map;

public enum NccEntryType
{
    CONTACT(200, "PIT_CONTACT"),
    CALLERGROUP(300, "PIT_CALLERGROUP");

    private static final Map<Integer,NccEntryType> typeMap = new HashMap<Integer,NccEntryType>();

    static
    {
        for(NccEntryType type : NccEntryType.values())
        {
            typeMap.put(type.getKey(), type);
        }
    }

    private int key;
    private String name;

    private NccEntryType(int key, String value)
    {
        this.key = key;
        this.name = value;
    }

    public int getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public static NccEntryType getTypeByKey(int key)
    {
        return typeMap.get(key);
    }
}
