import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"mamam", "papa", "it was Ame", "yes", "no", "ddd", "22"};
        solver(words);
    }

    public static void solver(String[] wordsNew) {
        List<String> newList2 = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        UP_LOP: for (String word : wordsNew) {
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
            for (Character key : helpMap.keySet()) {
                if (!newList2.contains(word))
            if (helpMap.get(key) % 2 != 0) {
                newList2.add(word);
            }else{
                if (!newList.contains(word))
                {newList.add(word);}
            }
continue UP_LOP;
                }}
        {System.out.println(newList);}
        {System.out.println(newList2);}
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

