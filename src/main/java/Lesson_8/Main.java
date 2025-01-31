package Lesson_8;


 //Исключение MyArraySizeException, выходит при неверном размере массива.

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неверный размер массива!");
    }
}

//Исключение MyArraySizeException, выходит при неверном размере массива.


class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}


 //новый класс Main содержит метод для работы с двумерным  массивом.

class Main {

    public static void main(String[] args) {
        String[][] validData = {
                {"10", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "ds", "110", "120"},
                {"130", "140", "150", "160"}
        };

        String[][] invalidData = {
                {"10", "20", "30"},
                {"40", "50", "60"},
                {"70", "80", "90"},
                {"100", "110", "120"},
                {"a", "b", "c"}
        };

        try {
            int sum = SumValidArray.sumValidArray(validData);
            System.out.println("Сумма всех элементов корректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = SumValidArray.sumValidArray(invalidData);
            System.out.println("Сумма всех элементов некорректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


}

class SumValidArray {
    public static int sumValidArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = Integer.parseInt(array[i][j]) + sum;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные  ячейки [" + i +"][" + 1 + j + "]");
                }
            }
        }

        return sum;
    }
}