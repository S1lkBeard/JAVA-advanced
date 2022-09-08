package JavaCollections;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileRead {
    public static void main(String[] args) {
        try {
            //Чтение слов из файла и запись в массив
            FileReader read = new FileReader("C:\\Users\\work\\Documents\\IBS\\Обучение\\06. JAVA advanced\\JAVA_adv\\JAVA-advanced.git\\JavaCollections\\file.txt");
            Scanner scan = new Scanner(read);
            String msv = scan.nextLine();
            System.out.println(msv);
            String[] words = msv.split(" ");
            scan.close();

            //Сортировка слов в алфавитном порядке
            Arrays.sort(words);
            System.out.println(Arrays.toString(words));

            //Подсчёт повторений каждого слова
            Map<String, Integer> wordsByCount = new HashMap<>();
            for (String word : words) {
                if (!wordsByCount.containsKey(word)) {
                    wordsByCount.put(word, 1);
                } else {
                    int count = wordsByCount.get(word);
                    wordsByCount.put(word, count + 1);
                }
            }

            //Вывод статистики на консоль
            System.out.println("Количество повторений каждого слова");
            for (Map.Entry<String, Integer> word : wordsByCount.entrySet()) {
                System.out.println(word.getKey() + ": " + word.getValue());
            }

            //Поиск слова с максимальным количеством повторений
            HashMap<String, Integer> wordWithMaxCount = new HashMap<String, Integer>();
            for (int i = 0; i < words.length; i++) {
                if (wordWithMaxCount.containsKey(words[i])) {
                    wordWithMaxCount.replace(words[i], wordWithMaxCount.get(words[i]) + 1);
                } else {
                    wordWithMaxCount.put(words[i], 1);
                }
            }

            //Вывод этого слова и его количества повторений
            String maxCountsWord = null;
            int count = 0;
            for (String word : wordWithMaxCount.keySet()) {
                if (count < wordWithMaxCount.get(word)) {
                    count = wordWithMaxCount.get(word);
                    maxCountsWord = word;
                }
            }
            System.out.println("Самое повторяющееся слово: " + maxCountsWord + " (встречается " + wordWithMaxCount.get(maxCountsWord) + " раз/раза)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
