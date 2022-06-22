package com;

class Animal {
    public void talk(){

    }
}

class Elephant extends Animal {
    public void eat(){
    }
}

class Dog extends Animal {
    public void eat(){
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.talk();
    }
}
