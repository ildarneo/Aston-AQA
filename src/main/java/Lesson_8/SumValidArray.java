package Lesson_8;

//Исключение MyArrayDataException, выходит при неверных данных в ячейке размере массива.

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
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