package exercises;

import java.util.Arrays;
import java.lang.String;

public class Boxfox {
    public static void main(String[] args) {
    String someString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newArray = someString.split(" ");
        System.out.println(Arrays.toString(newArray));
        String[] sentence = someString.split("\\.");
        System.out.println(Arrays.toString(sentence));
    }
}