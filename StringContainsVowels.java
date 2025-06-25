public class StringContainsVowels {

 public static void main(String[] args) {
  boolean result=stringContainsVowels("hello");
  System.out.println(stringContainsVowels("TV")); // false
 }

 public static boolean stringContainsVowels(String input) {
  return input.toLowerCase().matches(".*[aeiou].*");
 }

}