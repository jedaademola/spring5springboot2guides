package com.spring5.springboot2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestClass {


    public static void main(String args [])
    {
        final HashMap<Integer,String> hashFinalTest = new HashMap<> ();

        hashFinalTest.put(1,"Lukman");
        hashFinalTest.put(2,"Hawwa");

       Set<Integer> s = hashFinalTest.keySet();
       s.forEach( a-> System.out.println(a));

       hashFinalTest.replace(1,"Lukman Ademola");
       hashFinalTest.remove(2,"Hawwa");

       Collection s1 = hashFinalTest.values();
       s1.forEach( b-> System.out.println(b));

    }
}
