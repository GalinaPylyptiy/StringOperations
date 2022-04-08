package operationsWithString;

public class WordsInString {

    public  static int countNumberOfWordsInString(String sample) {
        String[] words = sample.split(" ");
        return words.length;
    }

    public static int lengthOfTheShortestWordInString(String sample) {
        String[] words = sample.split(" ");
        String theShortestWord = words[0];
        for (int i = 1; i < words.length ; i++) {
            if(words[i].length()<=theShortestWord.length()){
                theShortestWord = words[i];
            }
        }
        return theShortestWord.length();
    }

}