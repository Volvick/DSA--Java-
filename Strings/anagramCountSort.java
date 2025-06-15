package Strings;

import java.util.Arrays;

public class anagramCountSort {

  public static boolean anagramCountSort(String s1,String s2){
    int count1[] = new int[26];
    int count2[] = new int[26];
    for (int i = 0; i < s1.length(); i++) {
      char ch = s1.charAt(i);
      int indx = ch-'a';
      count1[indx]++;
    }
    for (int i = 0; i < s2.length(); i++) {
      char ch = s2.charAt(i);
      int indx = ch-'a';
      count2[indx]++;
    }
    return Arrays.equals(count1, count2);
  }
  public static void main(String[] args) {
     String str1 = "volvick";
    String str2 = "ikvlvco";
    System.out.println(anagramCountSort(str1, str2));
  }
}
