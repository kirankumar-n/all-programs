public class Fibonacci {

    public static void main(String[] args) {
        int numOne = 0;
        int numTwo = 1;

        for(int i=0;i<100;i++){
            System.out.println(numOne + " ");
            int sum = numOne + numTwo;
            numOne = numTwo;
            numTwo = sum;
        }
    }
}
