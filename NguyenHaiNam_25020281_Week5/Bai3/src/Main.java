import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("long-doc.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ");
                
                for (String word : words) {
                    if (word.length() <= 0) continue;
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read file.");
        }

        analyzeStats(map);
    }

    public static void analyzeStats(Map<String, Integer> map) {
        String maxWord = "";
        int maxCount = 0;
        List<String> uniqueWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }

            if (count == 1) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Tổng số từ khác nhau: " + map.size());
        System.out.printf("Từ xuất hiện nhiều nhất: %s (%d lần)\n", maxWord, maxCount);
        System.out.println("Các từ xuất hiện 1 lần: " + uniqueWords);
    } 
}
