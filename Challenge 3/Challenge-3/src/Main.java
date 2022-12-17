import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr={47, 84, 75, 21, 14, 14, 79};
        int temp = 0;
        int median;

        //sorting the array
        for(int i=0; i<arr.length; i++){
            for(int j=1; j< arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //print sorted array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");

        //median
        if(arr.length%2 ==0 ){
            median = (arr[arr.length/2]+arr[(arr.length+1)/2])/2;
        }else{
            median = arr[(arr.length)/2];
        }
        System.out.println("Median is: "+median);

        //highest value
        System.out.println("Highest value is: "+arr[arr.length-1]);

        //mode


        //prime numbers
        List<Integer> primes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(arr[i]);
            }
        }

        System.out.println("Prime numbers are: "+ primes);

    }
}