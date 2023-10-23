import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "D:\\JAVA PROJECTS\\Sample.txt"; // Replace with your file path

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            StringBuilder text = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }

            reader.close();

            // Split the text into words using whitespace as the delimiter
            String[] words = text.toString().split("\\s+");

            // Count the total number of words
            int wordCount = words.length;

            // Calculate the average word length
            int totalWordLength = 0;
            for (String word : words) {
                totalWordLength += word.length();
            }
            double averageWordLength = (double) totalWordLength / wordCount;

            // Create a map to store word frequencies
            Map<String, Integer> wordFrequency = new HashMap<>();
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }

            // Display the results
            System.out.println("Total words: " + wordCount);
            System.out.println("Average word length: " + averageWordLength);
            System.out.println("Word frequencies:");
            for (String word : wordFrequency.keySet()) {
                System.out.println(word + ": " + wordFrequency.get(word));
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
