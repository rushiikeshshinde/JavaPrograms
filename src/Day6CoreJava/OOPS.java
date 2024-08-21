package Day6CoreJava;

interface Animal {
    void walk();
}

interface Herbivorous {
    void eat();
}

class Horse implements Animal,Herbivorous {
    public void walk(){
        System.out.println("Horse walks on four legs");
    }
    public void eat(){
        System.out.println("Horse eats.");
    }
}

class Chicken implements Animal {
        public void walk() {
            System.out.println("Chicken walks on two legs");
        }
//        public void eat(){
//            System.out.println("Chicken eats seeds.");
//            }
    }

public class OOPS {

    public static void main(String[] args) {

        Horse horse = new Horse();
        Chicken chicken = new Chicken();
        horse.walk();
        horse.eat();

        chicken.walk();
//        chicken.eat();
    }

}
