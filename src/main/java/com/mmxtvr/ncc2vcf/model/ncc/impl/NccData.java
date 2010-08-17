package com.mmxtvr.ncc2vcf.model.ncc.impl;

import java.util.List;

public class NccData
{
    private List<NccEntry> entries;

    public List<NccEntry> getEntries()
    {
        return entries;
    }

    public void setEntries(List<NccEntry> entries)
    {
        this.entries = entries;
    }

    public void addEntry(NccEntry e)
    {
        this.entries.add(e);
    }
}
