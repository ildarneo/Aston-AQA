package Lesson_6.DZ_2;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8, "Розовый", "Черный");
        circle.showInfo();

        Rectangle rectangle = new Rectangle(5, 6, "Синий", "Красный");
        rectangle.showInfo();

        Triangle triangle = new Triangle(5, 6, 5, "Салатовый", "Серый");
        triangle.showInfo();
    }
}
