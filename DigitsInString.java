package operationsWithString;

public class DigitsInString {

   public static boolean hasNumbers(String sample){
       return !sample.matches("\\D+");
   }
    public static int countDigitsInString(String sample){
        int digit = 0;
        if (hasNumbers(sample)){
            char[] content = sample.toCharArray();
            char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
            for (char c : content) {
                for (char number : numbers) {
                    if (c == number) {
                        digit = digit + 1;
                    } } } }
        return digit;
    }

    public static String getNumbersFromString( String sample){
        StringBuilder result = new StringBuilder();
        if (hasNumbers(sample)){
            char[] content = sample.toCharArray();
            char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
            for (char c : content) {
                for (char number : numbers) {
                    if (c == number) {
                        result.append(c);
                    } } } }
        return result.toString();
    }
    }

