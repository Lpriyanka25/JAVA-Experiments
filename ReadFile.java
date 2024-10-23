import java.io.*;
import java.util.Scanner;

public class ReadFile {
    private String fileName;
    private Scanner scanner;

    // Constructor to initialize the class and get file name from user
    public ReadFile() {
        scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        fileName = scanner.nextLine();
    }

    // Method to read contents from the file
    public void readFile() {
        File file = new File(fileName);
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(file)) {
                System.out.println("File Contents:");
                int i;
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println();
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    // Method to ask user if they want to add contents to the file
    public void writeFile() {
        System.out.print("Do you want to add contents to the file? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the content to write into the file: ");
            String content = scanner.nextLine();

            try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
                fos.write(content.getBytes());
                fos.write("\n".getBytes());  // To add a newline after the written content
                System.out.println("Content written to the file successfully.");
            } catch (IOException e) {
                System.out.println("Error writing to the file: " + e.getMessage());
            }
        } else {
            System.out.println("No content added to the file.");
        }
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();

        // Reading the file
        readFile.readFile();

        // Writing to the file if user wishes
        readFile.writeFile();
    }
}
