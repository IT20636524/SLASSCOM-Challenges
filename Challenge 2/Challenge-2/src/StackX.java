public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray=new char[maxSize];
        top = -1; //no items
    }

    public void push(char j){
        //check whether stack is full
        if(top==maxSize-1){
            System.out.println("Stack is full");
        }else{
            stackArray[++top] = j;
        }
    }

    public char pop(){
        if(top==-1){
            return ' ';
        }else{
            return stackArray[top--];
        }
    }

    public char peek(){
        if(top==-1){
            return ' ';
        }else{
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
        return(top==-1);
    }

    public boolean isFull(){
        return(top==maxSize-1);
    }

}
