import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entere the number terms");
        int number = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        for(int i =1 ; i<=number ; i++){
            System.out.print( num1 + " ");
            int sum = num1 + num2;
            num1 = num2 ;
            num2 = sum;
        }

        
    }
    
}
