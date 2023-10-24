public class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog sound");
    }
}

class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}