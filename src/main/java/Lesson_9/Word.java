

package Lesson_9;

import java.util.HashMap;
import java.util.Map;

public class Word {

    public Word(String[] words) {

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Подсчитывание повторящихся слов
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Вывод уникальных слов и их совпадений
        System.out.println("Полученный уникальные слова и их количество совпадений:");
        wordCountMap.forEach((key, value) -> {
            System.out.print("[" + key + ": " + value + "] ");
        });
    }
}