package chapter11b;

public class Duck extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Quack quack");
    }

    @Override
    public void eat() {
        System.out.println("Duck must eat");

    }
}
