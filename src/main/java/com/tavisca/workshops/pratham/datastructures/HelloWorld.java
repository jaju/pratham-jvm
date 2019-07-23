package com.tavisca.workshops.pratham.datastructures;
//import java.util.Scanner;

public class HelloWorld {
    String name = "";
    char gender ;
    int age;
    String country;
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String name = sc.next();

        HelloWorld obj1 = new HelloWorld();
        obj1.setName("Akshay",'m',21,"India");

        if(obj1.getCountry().equals("Spain")){
            System.out.println("Hola "+ obj1.getName());
        }else
            System.out.println("Hello "+ obj1.getName());
    }

    public void setName(String name, char gender, int age, String country){
        this.name =  name;
        this.gender = gender;
        this.age = age;
        this.country = country;
    }

    public String getName(){
        if(age > 0) {
            if (gender == 'f') {
                return "Miss " + name;
            } else if (gender == 'm') {
                if (age < 18) {
                    return "Master " + name;
                } else if (age >= 18)
                    return "Mr " + name;
            } else {
                return "gender not specified";
            }
        }else
            return "incorrect age";
        return "";
        }

        public String getCountry(){
            return country;
        }
    }


