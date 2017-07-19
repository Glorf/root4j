package org.dianahep.root4j.refactor;

import org.dianahep.root4j.core.*;
import org.dianahep.root4j.interfaces.*;
import java.io.*;
import java.util.*;

public class SRShort extends SRSimpleType {
    String name;
    TBranch b;
    TLeaf l;

    SRShort(String name,TBranch b,TLeaf l){
        super(name,b,l);
    }

    @Override Short read(RootInput buffer)throws IOException{
        short temp = buffer.readShort();
        entry+=1L;
        return temp;
    }

    @Override Short read()throws IOException{
        RootInput buffer = b.setPosition(l,entry);
        return read(buffer);
    }

    @Override List<Short> readArray(RootInput buffer, int size)throws IOException{
        short t;
        List<Short> temp = new ArrayList();
        for (int i=0;i<size;i++){
            t=buffer.readShort();
            temp.add(t);
        }
        entry+=1L;
        return temp;
    }

    @Override List<Short> readArray(int size)throws IOException{
        RootInput buffer = b.setPosition(l,entry);
        return readArray(buffer,size);
    }

    @Override boolean hasNext(){
        return entry<b.getEntries();
    }

}
