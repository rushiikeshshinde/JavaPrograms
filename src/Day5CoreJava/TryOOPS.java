package Day5CoreJava;

class Animal{

    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Eating...");
    }
}


class Dog extends Animal{
    String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }
}

public class TryOOPS {

    public static void main(String[] args) {

        Dog d1 = new Dog("Dog", 10, "Female");
        d1.eat();

    }

}
