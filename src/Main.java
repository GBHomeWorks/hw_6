public class Main {
    public static void main(String[] args) {
//        int animalsCount;

        Cat cat = new Cat("Murzik", "white", 3);
        Dog dog = new Dog("Bim", "white", 7);
        Cat cat1 = new Cat("Gosha", "red", 25);
        Dog dog1 = new Dog("Jek", "black", 10);

        System.out.println("Бег:");
        cat.run(200);
        dog.run(500);
        cat1.run(201);
        dog1.run(501);
        System.out.println();

        System.out.println("Плавание:");
        cat.swim(5);
        dog.swim(10);
        dog1.swim(11);
        System.out.println();

        System.out.println("Создано " + Animal.animalsCount + " животных");
        System.out.println("Котов: " + Cat.catsCount + " любимчиков");
        System.out.println("Собак: " + Dog.dogsCount + " дружков");
    }
}
