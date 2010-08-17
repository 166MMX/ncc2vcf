package com.mmxtvr.ncc2vcf.reader.ncc.impl;

import com.mmxtvr.ncc2vcf.model.ncc.impl.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NccReader
{
    private BufferedReader br;

    public NccReader(InputStream is, String charsetName) throws UnsupportedEncodingException
    {
        InputStreamReader isr = new InputStreamReader(is, charsetName);
        this.br = new BufferedReader(isr);
    }

    public NccData readData()
    {
        NccData data = new NccData();
        try
        {
            readEntries(data);
        }
        catch (IOException ex)
        {
            return null;
        }
        return data;
    }

    private NccData readEntries(NccData data) throws IOException
    {
        NccEntry entry;
        String line = br.readLine();
        while (line != null)
        {
            entry = readyEntry(line);
            data.addEntry(entry);
            line = br.readLine();
        }
        return data;
    }

    private NccEntry readyEntry(String line)
    {
        NccEntry entry = new NccEntry();
        StringTokenizer st = new StringTokenizer(line, "\t");

        if (!st.hasMoreTokens())
        {
            return  null;
        }
        String k = st.nextToken();
        if (!st.hasMoreTokens())
        {
            return  null;
        }
        String v = st.nextToken();

        int key = Integer.parseInt(k);
        NccEntryType entryType = NccEntryType.getTypeByKey(key);
        entry.setType(entryType);

        List<NccEntryField> fields = readEntryFields(st);
        entry.setFields(fields);

        return entry;
    }

    private List<NccEntryField> readEntryFields(StringTokenizer st)
    {
        List<NccEntryField> entries = new ArrayList<NccEntryField>();
        while (st.hasMoreTokens())
        {
            String k = st.nextToken();
            if (!st.hasMoreTokens())
            {
                break;
            }
            String v = st.nextToken();

            NccEntryField field = readEntryField(k, v);
            entries.add(field);
        }
        return entries;
    }

    private NccEntryField readEntryField(String k, String v)
    {
        NccEntryField field = new NccEntryField();

        int key = Integer.parseInt(k);
        NccEntryFieldType fieldType = NccEntryFieldType.getTypeByKey(key);
        field.setType(fieldType);

        field.setValue(v);

        return field;
    }

}
