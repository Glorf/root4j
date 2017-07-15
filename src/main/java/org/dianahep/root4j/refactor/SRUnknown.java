package org.dianahep.root4j.refactor;

import org.dianahep.root4j.core.*;
import java.util.*;

public class SRUnknown extends SRType {
    static String name;

    SRUnknown(String name) {
        super(name);
    }

    String readroot(RootInput b){
        return null;
    }

    String readroot(){
        return null;
    }

     List<String> readArrayroot(int size) {
        List<String> temp = new ArrayList();
        for (int i=0;i<size;i++)
        {
            temp.add(null);
        }
        return temp;
     }

     List<String> readArrayroot(RootInput buffer, int size){
        List<String> temp = new ArrayList();
        for (int i=0;i<size;i++){
            temp.add(null);
        }
        return temp;
     }

     @Override boolean hasNext(){
         return false;
     }
}
