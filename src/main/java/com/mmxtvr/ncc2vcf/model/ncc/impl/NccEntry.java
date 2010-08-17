package com.mmxtvr.ncc2vcf.model.ncc.impl;

import java.util.List;

public class NccEntry
{
    private NccEntryType type;
    private List<NccEntryField> fields;
    private NccEntryField standardField;

    public NccEntryType getType()
    {
        return type;
    }

    public void setType(NccEntryType type)
    {
        this.type = type;
    }

    public List<NccEntryField> getFields()
    {
        return fields;
    }

    public void setFields(List<NccEntryField> fields)
    {
        this.fields = fields;
    }

    public void addField(NccEntryField e)
    {
        this.fields.add(e);
    }

    public NccEntryField getStandardField()
    {
        return standardField;
    }

    public void setStandardField(NccEntryField standardField)
    {
        this.standardField = standardField;
    }
}
