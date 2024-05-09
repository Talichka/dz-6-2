import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"mama", "papa", "it was me", "yes", "no", "dad", "22"};
        solver(words);
    }

    public static void solver(String[] wordsNew) {

        List<String> newList = new ArrayList<>();
        for (String word : wordsNew) {
            char[] chars = word.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();
            for (Character character : chars) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    helpMap.put(character, value);
                } else {
                    helpMap.put(character, 1);
                }
            }
            boolean isRightWord = true;
            for (Character key : helpMap.keySet()) {
                if (helpMap.get(key) % 2 != 0) {
                    isRightWord = false;
                }
            }
            if (isRightWord) {
                newList.add(word);
            }
        }
        {System.out.println(newList);}
Set<Character> setSet = new HashSet<>();
        for (String word: newList){
            for (Character character: word.toCharArray()){
                setSet.add(character);
            }
        }
        {System.out.println(setSet);}
        Set<Character> newSet = new HashSet<>();
        for (String word: wordsNew){
            for (Character character: word.toCharArray()){
                newSet.add(character);
            }
        }
        {System.out.println(newSet);}
    }

}

