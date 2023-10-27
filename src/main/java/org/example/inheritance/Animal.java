package org.example.inheritance;

public abstract class Animal {
    // Animal classından türetiliyor ise o class bu methodu somut hale getirmek zorundadır..
    public abstract void animalSound();
    public void eat(){
        System.out.println("Animal is eating..");
    }

    public void breathe(){
        System.out.println("Animal is breathing..");
    }
}
