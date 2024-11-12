class Animal{
    public void sound(){
        System.out.println("the Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("the dog barks");
    }
}
public class Overriding{
    public static void main(String[] args){
        Animal myAnimal=new Animal();
        myAnimal.sound();
        Animal myDog=new Dog();
        myDog.sound();
    }
}