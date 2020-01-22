package exercises;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's height?");
        Float height = input.nextFloat();
        System.out.println("What is the rectangle's width?");
        Float width = input.nextFloat();
        input.close();

        Float area = width * height;
        System.out.println("Rectangle area is: " + area);
    }
}
