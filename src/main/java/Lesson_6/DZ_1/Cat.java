package Lesson_6.DZ_1;

/**
 * Класс Cat является подклассом Animal и представляет кота.
 * Унаследованы методы и поля от класса Animal, а также добавлено поле fullness для отслеживания сытости.
 */
public class Cat extends Animal {
    int MAX_RUN_DISTANCE = 250;
    private static int CatCount = 0;
    boolean  fullness;

    public Cat(String name) {
        super(name);
        CatCount++;
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
        System.out.println(name + ": это кот, поэтому не может плавать. А умел бы плавать,цены бы ему не было :)" );
    }

    public static int getCatCount() {
        return CatCount;
    }

    //-----------------------------------------------
    /**
     * Метод eat позволяет коту покушать из миски.
     * Если в миске достаточно еды, кот становится сытым (fullness = true).
     * @param foodAmount Количество еды в миске
     */
    public void eat(int foodAmount) {
        if (foodAmount > 0 ) {
            fullness = true;
            System.out.print(name + " покушал из миски и пошел спать.");
        } else {
            fullness = false; // Кот голодец, так как не хватает еды. по идее сам винован
            System.out.println(name + " не может покушать из миски, так как не хватает еды. Надо вовремя приходить на обед !");
        }
    }


}