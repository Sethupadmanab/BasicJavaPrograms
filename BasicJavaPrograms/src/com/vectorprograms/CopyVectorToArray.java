package com.vectorprograms;

import java.util.Vector;

public class CopyVectorToArray {
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        String[] copyArr =vct.toArray(new String[vct.size()]);
        // or another mehtod,see below
//        String[] copyArr = new String([vct.size()]); 
//        vct.copyInto(copyArr); // You can copy all elements of a vector object to an array. By passing an array object to copyInto() method, you can copy content of a vector object to an array.
        System.out.println("Copied Array content:");
        for(String str:copyArr){
            System.out.println(str);
        }
    }
}
