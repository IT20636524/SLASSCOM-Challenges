import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueX queue = new QueueX(10);
        Scanner sc = new Scanner(System.in);
        String input;
        char[] inputArray;

        System.out.println("Input : ");
        input = sc.nextLine();
        inputArray = input.toCharArray();

        for(int i=0; i < inputArray.length; i++){
            queue.insert(inputArray[i]);
        }
        


    }
}