public class Dog extends Animal {
    public static int dogsCount;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        dogsCount++;
    }

    @Override
    public void run(int dist) {
        while (dist >= 0) {
            if (dist <= 500) {
                System.out.println(name + " пробежал " + dist + " метров."); ;
            } else {
                System.out.println(name + " так далеко не пробежит. " + dist + " метров многовато."); ;
            } break;
        }
    }

    @Override
    public void swim(int dist) {
        while (dist >= 0) {
            if (dist <= 10) {
                System.out.println(name + " проплыл " + dist + " метров."); ;
            } else {
                System.out.println(name + " далеко не плавает. " + dist + " метров много для него."); ;
            } break;
        }
    }
}
