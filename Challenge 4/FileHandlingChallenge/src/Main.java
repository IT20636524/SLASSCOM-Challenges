import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Read student information from input file
        List<Student> students = readStudentsFromFile("input.txt");

        // Compute final grades for all students
        for (Student student : students) {
            student.getFinalAverage();
        }

        // Print summary report to output file
        printSummaryReport(students, "output.txt");
    }

    private static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int numStudents = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numStudents; i++) {
                String[] name = reader.readLine().split(", ");
                String firstName = name[1];
                String lastName = name[0];
                String[] line = reader.readLine().split(" ");
                String course = line[0];
                if (course.equals("English")) {
                    int termPaper = Integer.parseInt(line[1]);
                    int midterm = Integer.parseInt(line[2]);
                    int finalExam = Integer.parseInt(line[3]);
                    students.add(new EnglishStudent(firstName, lastName, termPaper, midterm, finalExam));
                } else if (course.equals("Science")) {
                    int attendance = Integer.parseInt(line[1]);
                    int project = Integer.parseInt(line[2]);
                    int midterm = Integer.parseInt(line[3]);
                    int finalExam = Integer.parseInt(line[4]);
                    students.add(new ScienceStudent(firstName, lastName, attendance, project, midterm, finalExam));
                } else if (course.equals("Math")) {
//                    int quiz1 = Integer.parseInt(line[1]);
//                    int quiz2 = Integer.parseInt(line[2]);
//                    int quiz3 = Integer.parseInt(line[3]);
//                    int quiz4 = Integer.parseInt(line[4]);
//                    int quiz5 = Integer.parseInt(line[5]);
                    int[] quizzes =new int[5];
                    for(int j=0; j<5; j++){
                        quizzes[j] = Integer.parseInt(line[j+1]);
                    }
                    int test1 = Integer.parseInt(line[6]);
                    int test2 = Integer.parseInt(line[7]);
                    int finalExam = Integer.parseInt(line[8]);
                    students.add(new MathStudent(firstName, lastName, quizzes, test1, test2, finalExam));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    private static void printSummaryReport(List<Student> students, String filename){
        try {
            FileWriter writer = new FileWriter(filename);
            for (Student student : students) {
                writer.write(student.getFirstName() + " " + student.getLastName() + ",");
                writer.write(student.getFinalExamGrade() + ",");
                writer.write(student.getFinalAverage() + ",");
                writer.write(student.getLetterGrade(student.getFinalAverage()) + "\n");
            }

            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}