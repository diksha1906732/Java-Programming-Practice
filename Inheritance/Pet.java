/*2. Create an Animal class with an eat() method. Create Dog and Cat classes with their own methods.*/
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barkig at pepole");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat is mewoing");
    }
}
public class Pet{
    public static void main(String[] args){

        Dog d =new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();
        c.eat();
        c.meow();

    }
}