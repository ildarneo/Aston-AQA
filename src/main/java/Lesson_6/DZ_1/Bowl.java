package Lesson_6.DZ_1;

/**
 *  Bowl представляет миску с едой.
 * получегие еды из миски и для добавления еды в миску.
 */
public class Bowl {
    private int foodAmount;

    /**
     * новая с заданным количеством еды.
     * @param foodAmount Количество еды в миске
     */
    public Bowl(int foodAmount) {

        this.foodAmount = foodAmount;
    }

    /**
     * Метод getFood позволяет кушать из миски.
     * Если в миске не хватает еды, нельзя покушать.
     */
    public int getFood(int countFood) {
        if (foodAmount >= countFood) {
            foodAmount -= countFood;
            return countFood;
        } else {
            foodAmount = 0;
            return 0; // Возвращаем 0, если в миске недостаточно еды
        }
    }
    /**
     * Метод addFood позволяет добавить еду в миску.
     * @param amount Количество еды для добавления
     */
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Докинули еды " + amount);
        }
    }
    /**
     * Метод FoodAmount возвращает количество еды в миске
     */
    public int FoodAmount() {
        return foodAmount;
    }


}
