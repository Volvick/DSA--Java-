package Strings;
import java.util.Arrays;

public class anagram {
  public static boolean anagram(String str1,String str2){
    char ch1[] = str1.toCharArray();
    Arrays.sort(ch1);
    char ch2[] = str2.toCharArray();
    Arrays.sort(ch2);
    boolean result =  Arrays.equals(ch1, ch2);
    return result;
  }
  public static void main(String[] args) {
    String str1 = "volvick";
    String str2 = "ikvlvco";
    System.out.println(anagram(str1, str2));
  }
}
