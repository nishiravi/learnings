package com.nishiravi;

public class MainRunner{
  public static void main (String[] args){
     Cat c=new Cat();
     Dog d=new Dog();
     c.sleep();
     c.meaw();
     c.eat();
     d.bark();
     d.sleep();
     d.eat();
     System.out.println("done");
  }
}
