public class  Cat extends Animal {

    public Cat (String name, String color, int age){
        super(name, color, age);
    }

    @Override
    public void run(int dist) {
        while (dist >= 0) {
            if (dist <= 200) {
                System.out.println(name + " пробежал " + dist + " метров."); ;
            } else {
                System.out.println(name + " так далеко не побежит. Кот сидит на дереве."); ;
            } break;
        }
    }
    @Override
    public void swim(int dist) {
        System.out.println("Помилуйте, коты не плавaют");
    }
}
