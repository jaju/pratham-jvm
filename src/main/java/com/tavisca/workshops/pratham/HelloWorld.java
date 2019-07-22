package com.tavisca.workshops.pratham;

import java.util.Scanner;

public class HelloWorld
{
    public static void main(String []args)
    {
        Person p = new Person("Sachin", "Male", 22, "India");
        func(p);
        //sayHello("Raja Sachin", "Male");

    }


    public static void func(Person p)
    {
        String name = p.getName();
        String gender = p.getGender();
        int age = p.getAge();
        String country = p.getCountry();

        if(country.equals("India"))
            System.out.println("Namaste");
        else if(country.equals("Spain"))
            System.out.println("Hola");
        else
            System.out.println("Hello");


        if(age < 18)
            System.out.println("Mr." + name);
        if(gender.equals("Male"))
            System.out.println("Mr." + name);
        else if(gender.equals("Female"))
            System.out.println("Mrs" + name);


    }
    public static void sayHello(String name, String gender, int age, String country)
    {

        if(country.equals(("India")))
            System.out.println("Namaste");
        else if(country.equals("Spain"))
            System.out.println("Hola");
        else
            System.out.println("Hello");


        if(age < 18)
            System.out.println("Mr." + name);
        if(gender.equals("Male"))
            System.out.println("Mr." + name);
        else if(gender.equals("Female"))
            System.out.println("Mrs" + name);
    }
}
