package OOP;

public class main {

    public static void main(String[] args){
        Animal animal = new Animal("blue",1,true);
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(animal.getDescription());
        System.out.println(bird.getDescription()); // bird has more text printed out since the method was
        // overriden and extended with more text while the dog doesn't have that method overridden
        System.out.println(dog.getDescription());


    }
}
