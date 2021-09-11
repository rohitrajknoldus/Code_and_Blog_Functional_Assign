package Liskov_Substitution;

class Cat implements Animal
{
    void makeNoise()
    {
        Cat c=new Cat();
        System.out.println("Cat is speaking meow meow");
    }
}