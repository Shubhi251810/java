import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {
        File file = new File("sample.txt"); 

        int vowelCount = 0;
        int consonantCount = 0;

        try (FileReader fr = new FileReader(file); Scanner scanner = new Scanner(fr)) {
            
            while (scanner.hasNext()) {
                String line = scanner.nextLine().toLowerCase();
                
                
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    
                    
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }
                    
                    else if (ch >= 'a' && ch <= 'z') {
                        consonantCount++;
                    }
                }
            }

            
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
