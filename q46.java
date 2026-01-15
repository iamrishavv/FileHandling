package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;

//wap to find how many character , words and lines are available in the file.
public class q46 {
    public static void main(String[] args) {
        int charCounter = 0;
        int wordCounter = 0;
        int lineCounter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("ab.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCounter++;
                charCounter += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCounter += words.length;
                }
            }
            System.out.println("Lines: " + lineCounter);
            System.out.println("Words: " + wordCounter);
            System.out.println("Characters: " + charCounter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
