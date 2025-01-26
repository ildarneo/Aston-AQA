package Lesson_6.DZ_1;

public class Dog extends Animal {
    int MAX_RUN_DISTANCE = 400;
    int MAX_SWIM_DISTANCE = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override

    public void run(int lenght) {
        if (lenght >= MAX_RUN_DISTANCE ) {
            System.out.println(name + " не может пробежать " + lenght + " м.");
        } else {
            System.out.println(name + " пробежал " + lenght + " м.");
        }
    }

    @Override
    public void swim(int lenght) {
        if (lenght >= MAX_SWIM_DISTANCE ) {
            System.out.println(name + " не может проплыть " + lenght + " м.");
        } else {
            System.out.println("И еще " + name + "  проплыл " + lenght + " м.  Какой он молодец");
        }
    }
    public static int getDogCount() {
        return dogCount;
    }

}
