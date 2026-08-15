import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32)*5/9;
        System.out.printf("%.2f\u00B0F = %.2f\u00B0C" ,fahrenheit , celsius);

    }
}
