package com.tnsif.AccessModifiers.Different;
import com.tnsif.AccessModifiers.Same.Accessmodifiers;

public class DifferentClass {
    public void test() {
        Accessmodifiers obj = new Accessmodifiers();
        System.out.println(obj.publicVar); 
        // Others (private, protected, default) are not visible here
    }
}