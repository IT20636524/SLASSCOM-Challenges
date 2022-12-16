import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SIZE;
        int extra=1;
        String input;
        char[] inputArray;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input : ");
        input = sc.nextLine();
        inputArray = input.toCharArray();
        SIZE=inputArray.length;

        StackX stack = new StackX(SIZE);

        for(int i=0; i<SIZE ; i++){
            if(inputArray[i]=='{' || inputArray[i]=='[' || inputArray[i]=='('){
                stack.push(inputArray[i]);
            } else {
                if(stack.isEmpty()){
                    extra = 1; //extra closing bracket
                    break;
                }
                char openBracket = stack.pop();
                if(inputArray[i] == ')' && openBracket!= '(' || inputArray[i] == '}' && openBracket!= '{' || inputArray[i] == ']' && openBracket!= '['){
                    extra=1;
                    break;
                }else{
                    extra=0;
                }
            }
        }

        //check
        if(stack.isEmpty() && extra == 0){
            System.out.println("output : "+true );
        }else{
            System.out.println("output : "+false);
        }
        
    }
}