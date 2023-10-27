package org.example.inheritance;
// kalıtım


public class Dog extends Animal {

    @Override
    public void animalSound() {
        System.out.println("Hav hav..");
        //super.animalSound();
    }

    public void walk(){
        System.out.println("Dog is walking");
    }
}
