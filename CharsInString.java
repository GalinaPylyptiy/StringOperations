package operationsWithString;
import java.util.LinkedHashSet;
import java.util.Set;

public class CharsInString {

   public static String deleteSimilarChars(String sample){
      char[] chars = sample.toCharArray();
      Set<Character> singularChars = new LinkedHashSet<>();
      StringBuilder result = new StringBuilder();
      for(char c:chars){
          singularChars.add(c);
      }
      for(Character ch:singularChars){
         result.append(ch);
      }
      return result.toString();
   }

   public static void divideEvenAndOddChars(String sample){
     char [] chars = sample.toCharArray();
     StringBuilder odd = new StringBuilder();
     StringBuilder even = new StringBuilder();
     for(int i = 0; i<chars.length;i++){
         if(i%2==0){
            even.append(chars[i]);
         }  else odd.append(chars[i]);
     }
       System.out.println("Even string : " + even);
       System.out.println("Odd string: " + odd);
   }

  public static int countCharFrequencyInString(String sample, char c){
       char[] chars = sample.toCharArray();
       int count = 0;
       for(char ch: chars){
          if (ch == c) {
              count++;
          } }
       return count;
       }
   }


