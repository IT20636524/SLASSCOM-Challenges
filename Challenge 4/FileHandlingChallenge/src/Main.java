import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try{
            File file = new File("marks.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }

        }catch(FileNotFoundException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}