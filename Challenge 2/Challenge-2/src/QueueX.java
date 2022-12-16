public class QueueX {
    private int maxSize; //size of queue array
    private char[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueX(int s) {
        maxSize = s;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems=0; //no items
    }

    public void insert(char j) {
        //check whether queue is full
        if(rear == maxSize-1) {
            System.out.println("Queue is full");
        }else{
            queueArray[++rear] = j;
            nItems++;
        }
    }

    public char remove(){
        if(nItems==0){
            System.out.println("Queue is empty");
            return ' ';
        }else{
            nItems--;
            return queueArray[front++];
        }
    }

    public char peekFront(){
        if(nItems==0){
            System.out.println("Queue is empty");
            return ' ';
        }else{
            return queueArray[front];
        }
    }

}
