package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String alice = "Alice was beginning to get " +
                "very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for?");
        String word = input.nextLine();

        if (alice.toLowerCase().contains(word.toLowerCase())){
            int indexOfWord = alice.indexOf(word.toLowerCase());
            int lengthOfWord = word.length();
            int indexOfLastLetter = indexOfWord + lengthOfWord + 1;
            int indexEnd = alice.length();
            String part1 = alice.substring(0, indexOfWord);
            String part2 = alice.substring(indexOfLastLetter, indexEnd);

            System.out.println("Yes, " + word + " was found.");
            System.out.println(word + " has an index of: " + indexOfWord );
            System.out.println(word + " has a length of: " + lengthOfWord);
            System.out.println(part1 + part2);

        }
        else {
             System.out.println("No, " + word + " was not found.");
         }
    }
}
