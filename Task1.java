package task1;

import java.util.*;

/**
 * 1. Задан текст на английском языке. Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */
public class Task1 {

    public static void main(String[] args) {
        String text = "There are different kinds of animals on our planet," +
                " and all of them are very important for it. For example," +
                " everybody knows that the sharks are dangerous for people," +
                " but they are useful for cleaning seawater. There are two" +
                " types of animals: domestic (or pets) and wild. People keep" +
                " pets in their homes. And some wild animals are very dangerous.";
        String[] words = text.replaceAll("[^a-zA-Z ]", "").split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
