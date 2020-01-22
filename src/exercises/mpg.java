package exercises;
import java.util.Scanner;


public class mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        Float milesDriven = input.nextFloat();
        System.out.println("How many gallons of gas have you used?");
        Float gallonsGas = input.nextFloat();
        input.close();
        System.out.println("MPG: " + milesDriven / gallonsGas);
    }
}
