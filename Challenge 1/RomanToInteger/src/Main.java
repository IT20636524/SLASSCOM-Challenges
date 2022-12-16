import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        String s= sc.nextLine();
        Solution solution=new Solution();
        int ans = solution.romanToInt(s);
        System.out.println("Output: "+ ans);

    }
}