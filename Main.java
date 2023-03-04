public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("white", 2, true);
        Animal b = new Animal("black", 1, false);

        System.out.println(a.getDescription());
        System.out.println(b.getDescription());

        Dog d = new Dog();
        Bird bird = new Bird();

        System.out.println(d.getDescription());
        System.out.println(bird.getDescription());
    }
}