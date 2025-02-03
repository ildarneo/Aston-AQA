package Lesson_8;

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неверный размер массива!");
    }
}


//новый класс Main содержит метод для работы с двумерным  массивом.

class Main {

    public static void main(String[] args) {
        String[][] validData = {
                {"10", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "100", "110", "120"},
                {"130", "140", "150"}
        };

        String[][] invalidData = {
                {"10", "20", "30"},
                {"40", "50", "60"},
                {"70", "80", "90"},
                {"100", "ds", "120"}

        };

        try {
            int sum = SumValidArray.sumValidArray(invalidData);
            System.out.println("Сумма всех элементов некорректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(" Задание №1 Ошибка: " + e.getMessage());



        }
        try {
            int sum = SumValidArray.sumValidArray(validData);
            System.out.println("Задание №2  Сумма всех элементов корректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(" Задание №2 Ошибка: " + e.getMessage());

        }
    }


}

