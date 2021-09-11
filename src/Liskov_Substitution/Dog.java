package Liskov_Substitution;

public class Dog extends Cat
{
    void makeNoise()
    {
        Dog d=new Dog();
        System.out.println("Dog is speaking bow wow");
    }
}