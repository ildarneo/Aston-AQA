package org.example;

/**
 * массив Person для 5 сотрудников.
 */

public class Person {
    public static void main (String [] args) {
        Person [] perArray = new Person[5];
        perArray [0] = new Person(" Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", "30000", "30");
        perArray [1] = new Person(" Dima Petrov", "Devops", "sdsvan@mail.com", "8923123212", "35000", "31");
        perArray [2] = new Person(" Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", "30000", "30");
        perArray [3] = new Person(" Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", "30000", "30");
        perArray [4] = new Person(" Ivan Volkoı", "Engineer", "ivivan@mailbox.com", "892312312", "30000", "30");

    }
}

//немного не понял задание. только создать массив или что то надо выводить ?