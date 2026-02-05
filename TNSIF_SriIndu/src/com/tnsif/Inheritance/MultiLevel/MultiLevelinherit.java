package com.tnsif.Inheritance.MultiLevel;

class Animal {
    void eat() { System.out.println("Eating..."); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking..."); }
}

class BabyDog extends Dog {
    void weep() { System.out.println("Weeping..."); }
}