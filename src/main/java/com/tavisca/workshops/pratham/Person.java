package com.tavisca.workshops.pratham;

public class Person
{
    private String name;
    private String gender;
    private int age;
    private String country;

    Person(String name,String gender, int age,String country)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public  String getCountry()
    {
        return country;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }

    public  void setGender(String gender)
    {
        this.gender = gender;
    }

    public  String getGender()
    {
        return gender;
    }

    public  void setAge(int age)
    {
        this.age = age;
    }

    public  int getAge()
    {
        return age;
    }
}
