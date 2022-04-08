package operationsWithString;

import java.util.Arrays;

public class ArrayOfStrings {

    public static void sortArray(String[]words){
        Arrays.sort(words);
        for(String word: words){
            System.out.println(word);
        }
    }
}
