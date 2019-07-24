package com.tavisca.workshops.pratham;

public class HelloWorld {

    private static String wishUser(String name, String gender, int age){
        if(gender.equals("M")){
            if(age < 18){
                return "Hello, Master " + name;
            }
            else{
                return "Hello, Mr. " + name;
            }
        }

        else if(gender.equals("F"))
            return "Hello, Ms. " + name;
        else
            return "Hello, " + name;
    }

    public static void main(String[] args){
        System.out.println(wishUser("Rishabh", "M", 22));
        System.out.println(wishUser("ABCD", "F", 33));
    }
}
