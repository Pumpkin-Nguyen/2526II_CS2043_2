import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> map;

    public WordCounter() {
        this.map = new HashMap<>();
    }

    public void analyze(String text) {
        String cleanedText = text.toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] words = cleanedText.split(" ");

        for (String word : words){
            if (word.length() <= 0) continue;

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
    } 

    public void displayResult() {
        String maxWord = "";
        int maxCount = 0;

        System.out.println("---Tần suất xuất hiện---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            } 

            System.out.printf("Từ \"%s\": %d lần\n", word, count);
        }

        System.out.printf("Từ khóa chính: %s (%d lần)", maxWord, maxCount);
    }
}
