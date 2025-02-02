package Lesson_9;


public  class Main {
    public static void main(String[] args) {
        // Task # 1
        System.out.println("---------Задача 1  вывод слов из массива --------- \n");
        String[] wordsFlower = {"лиана", "хризантема", "роза", "лепесток","георгин", "гладиолус", "ромашка", "одуванчик",
                "лимон", "тюльпан", "ромашка", "настурция", "лепесток",  "эвкалипт", "нарцисс", "тюльпан"};
        Word wordCounter = new Word(wordsFlower);

        // Task # 2
        System.out.println("\n---------Задача 2- Телефонный справочник----\n");
        PhoneTable contact = new PhoneTable();
        contact.add("Зарипов Дамир", "123456789");
        contact.add("Анашкин Вадим", "432424324");
        contact.add("Семенов Санчо", "324324324324");
        contact.add("Илон Маск", "23432432432");
        contact.add("Семенов Санчо", "324324");

        System.out.println("Телефон Зарипова Дамира: " + contact.get("Зарипов Дамир"));
        System.out.println("Телефон Анашкин Вадим: " + contact.get("Анашкин Вадим"));
        System.out.println("Телефон Семенов Санчо: " + contact.get("Семенов Санчо"));
        System.out.println("Телефон Илон Маск: " + contact.get("Илон Маск"));

    }
}