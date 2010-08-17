package com.mmxtvr.ncc2vcf.model.ncc.impl;

public class NccEntryField
{
    private NccEntryFieldType type;
    private String value;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public NccEntryFieldType getType()
    {
        return type;
    }

    public void setType(NccEntryFieldType type)
    {
        this.type = type;
    }

}
