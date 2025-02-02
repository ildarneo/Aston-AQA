package Lesson_9;

import java.util.*;

public class PhoneTable {
    private Map<String, List<String>> contactList = new HashMap<>();



    public void add(String lastName, String phoneNumber) {
        if (contactList.containsKey(lastName)) {
            List<String> phoneNumbers = contactList.get(lastName);
            if (!phoneNumbers.contains(phoneNumber)) {
                phoneNumbers.add(phoneNumber);
            }
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contactList.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return contactList.getOrDefault(lastName, Collections.emptyList());
    }
}