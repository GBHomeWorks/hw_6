public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public abstract void run(int dist);

    public abstract void swim(int dist);
}
