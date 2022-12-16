import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueX queue1 = new QueueX(10);
        QueueX queue2 = new QueueX(10);
        StackX stack = new StackX(10);
        String input;
        Boolean output=false;
        char[] inputArray;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input : ");
        input = sc.nextLine();
        inputArray = input.toCharArray();

        //add opening and closing brackets to separate queues
        for(int i=0; i < inputArray.length; i++){
            if(inputArray[i]=='{' || inputArray[i]=='[' || inputArray[i]=='('){
                queue1.insert(inputArray[i]);
            }
            if(inputArray[i]=='}' || inputArray[i]==']' || inputArray[i]==')'){
                queue2.insert(inputArray[i]);
            }
        }

        //for reverse the pattern in queue 2
        while(!queue2.isEmpty()){
            stack.push(queue2.remove());
        }
        while(!stack.isEmpty()){
            queue2.insert(stack.pop());
        }

        //check whether number of opening brackets and closing brackets are same
        if(queue1.getnItems()==queue2.getnItems()){
            //check whether all opening bracket has a closing bracket
            for(int j=0; j < queue1.getnItems(); j++){
                if(queue1.remove()=='{' && queue2.remove()=='}'){
                    output=true;
                }else if(queue1.remove()=='[' && queue2.remove()==']'){
                    output=true;
                }else if(queue1.remove()=='(' && queue2.remove()==')'){
                    output=true;
                }else{
                    output=false;
                    break;
                }
            }
            System.out.println("Output : " + output);
        }else{
            System.out.println("Output : " + false);
        }


    }
}