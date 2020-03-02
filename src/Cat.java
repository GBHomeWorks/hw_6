public class  Cat extends Animal {
    public static int catsCount;

    public Cat (String name, String color, int age){
        super(name, color, age);
        catsCount++;
    }

    @Override
    public void run(int dist) {
        while (dist >= 0) {
            if (dist <= 200) {
                System.out.println(name + " пробежал " + dist + " метров."); ;
            } else {
                System.out.println(name + " так далеко не побежит. Кот " + name + " сидит на дереве."); ;
            } break;
        }
    }
    @Override
    public void swim(int dist) {
        System.out.println("Помилуйте, коты не плавaют. Кот " + name + " в шоке от предложения");
    }
}
