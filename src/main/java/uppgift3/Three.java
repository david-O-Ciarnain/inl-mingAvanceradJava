package uppgift3;

import java.util.*;

import java.util.regex.Pattern;


public class Three {

    public static void main(String[] args) {

        //a,e,i,o,u,y


        List<String> stringList = List.of("me", "bean", "girl", "housing", "provoke"
                , "amuse", "execute", "free", "impact", "brush", "eyebrow");


        findWordsWithTwoOreMoreVowels(stringList);

    }


    public static void findWordsWithTwoOreMoreVowels(List<String> stringList) {

        Pattern pattern = Pattern.compile("([aeiouy]\\w+){2,}", Pattern.CASE_INSENSITIVE);

        List<String> list = stringList.stream()
                .filter(word -> pattern.matcher(word).find())
                .toList();

        list.forEach(System.out::println);
    }


    //inte del av uppgiften men en rolig grej om man inte orkar komma på några engelska ord
    public static List<String> generateRandomWords(int numberOfWords, int lengthOfWord) {

        List<String> randomString = new ArrayList<>(numberOfWords);

        Random random = new Random();

        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(lengthOfWord) + 3];

            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));

            }
            randomString.add(new String(word));

        }
        return randomString;
    }
}
