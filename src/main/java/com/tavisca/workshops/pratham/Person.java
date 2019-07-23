package com.tavisca.workshops.pratham;

public class Person {
    private int age;
    private String gender;
    private String name;
    private String greeting = "";

    public String country(String country){
        if(country.equals("India"))
            return "Namastey!";
        else if(country.equals("Spain"))
            return "Hola";
        else
            return "Hello";
    }

    public String getTitle(String gender, int age){
        if(gender.equals("M")){
            if(age < 18){
                return " Master";
            }
            else{
                return " Mister";
            }
        }
        else{
            return "Miss";
        }
    }


    public Person(String name, String gender, int age, String Country){

        this.greeting += this.country(Country) + this.getTitle(gender, age) + name;

    }
    public String wishUser(){
        return this.greeting;
    }

}
