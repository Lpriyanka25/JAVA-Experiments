import java.io.*;

public class StudentInfo {
    private String name;
    private int age;
    private String grade;

    // Method to get student details from the user using DataInputStream
    public void getStudentDetails() {
        try (DataInputStream dis = new DataInputStream(System.in)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter student's name: ");
            name = reader.readLine();
            
            System.out.print("Enter student's age: ");
            age = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter student's grade: ");
            grade = reader.readLine();
            
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }

    // Method to write student details to a file using FileOutputStream
    public void saveStudentDetailsToFile() {
        try (FileOutputStream fos = new FileOutputStream("student_info.txt", true);
             PrintWriter writer = new PrintWriter(fos)) {
             
            writer.println("Name: " + name);
            writer.println("Age: " + age);
            writer.println("Grade: " + grade);
            writer.println("---------------------------");
            System.out.println("Student details saved to file successfully.");
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read student details from the file using FileInputStream
    public void readStudentDetailsFromFile() {
        try (FileInputStream fis = new FileInputStream("student_info.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {
             
            String line;
            System.out.println("\nStudent Details from File:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        
        // Getting student details
        studentInfo.getStudentDetails();
        
        // Saving student details to the file
        studentInfo.saveStudentDetailsToFile();
        
        // Reading and displaying student details from the file
        studentInfo.readStudentDetailsFromFile();
    }
}
