import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, the student of mca A2 .";

    
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println(" already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Successfully .");

        } catch (IOException e) {
            System.out.println("Writing error ");
            e.printStackTrace();
        }

        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Content in the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Reading error  ");
            e.printStackTrace();
        }
    }
}
