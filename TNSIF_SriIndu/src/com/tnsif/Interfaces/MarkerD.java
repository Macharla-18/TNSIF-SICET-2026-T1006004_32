package com.tnsif.Interfaces;
class Entity implements Marker {
    void display() { System.out.println("Entity is a marked class."); }
}

public class MarkerD {
    public static void main(String[] args) {
        Entity obj = new Entity();
        if (obj instanceof Marker) {
            obj.display();
        }
    }
}