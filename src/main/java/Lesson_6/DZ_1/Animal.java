package Lesson_6.DZ_1;
// животные класс
public abstract class Animal {
    static int animalCount = 0;
    String name;
    static int count;
    /**
     * Конструктор класса Animal.
     *
     * @param name   Имя животного
     */
    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);

}