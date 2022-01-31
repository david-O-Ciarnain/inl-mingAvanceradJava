package uppgift3;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Three {

    public static void main(String[] args) {




       // Arrays.stream(generateRandomWords(10,10)).sorted().forEach(System.out::println);
    }



    //inte del av uppgiften men en rolig grej om man inte orkar komma på några engelska ord
    public static String[] generateRandomWords(int numberOfWords,int lengthOfWord) {

        String[] randomString = new String[numberOfWords];

        Random random = new Random();

        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(lengthOfWord) + 3];

            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));

            }
            randomString[i] = new String(word);

        }
        return randomString;
    }
}
