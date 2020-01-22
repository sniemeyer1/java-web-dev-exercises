package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingChars {
    public static void main(String[] args){
        HashMap<Character, Integer> charMap = new HashMap<>();
        String hiddenFigures = "If the product of two terms is zero then " +
                "common sense says at least one of the two terms has to be zero " +
                "to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve " +
                "done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();

        //int charCount = 0;

        for (char newChar : charactersInString){
                if(charMap.containsKey(newChar)){
                    charMap.put(newChar, charMap.get(newChar) + 1);

                }else {
                    charMap.put(newChar, 1);
                }
        }

        for (Map.Entry<Character, Integer> letter : charMap.entrySet()){
            System.out.println(letter.getKey() + " - " + letter.getValue());
        }




    }
}
