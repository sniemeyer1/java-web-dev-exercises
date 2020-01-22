package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Letters {
    public static ArrayList<String> printWords() {
        ArrayList<String> words = new ArrayList<>();
        words.add("cow");
        words.add("cat");
        words.add("koala");
        words.add("panda");
        words.add("puppy");
        System.out.println("How many letters? ");

        Scanner input;
        input = new Scanner(System.in);
        int wordLength = input.nextInt();

        for (String word : words)
            if (word.length() == wordLength){
            System.out.println(word);
            };

        return words;
    }
}
