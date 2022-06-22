package com;

//Inheritance (Parent, Child)
//Polymorphism (Method extends by multiple class)
//Encapsulation (Sensitive Data in Username Class)

class User{
    private String name,address;


    public String getName(){
        return name;
    }

    public void setName(String s){
        this.name=s;
    }
}

class Parent{
    String s = "Parent";
    void honk(){
        System.out.println(s);
    }
}

class Parent2 extends Parent{
    String s = "Parent2";
    void honk(){
        System.out.println(s);
    }
}

class Parent3 extends Parent{
    String s = "Parent3";
    void honk(){
        System.out.println(s);
    }
}

public class BasicOOP{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent2 p2 = new Parent2();
        Parent3 p3 = new Parent3();
        p1.honk();
        p2.honk();
        p3.honk();
        User user = new User();
        user.setName("Jaury");
        System.out.println(user.getName());;
    }
}
