package Strings;

import java.util.Scanner;

public class ShortestPathWASD {

  public static float shortestPath(String str) {
    int x = 0, y = 0;

    for (int i = 0; i < str.length(); i++) {
      char dir = str.charAt(i);

      switch (dir) {
        case 'W': y++; break;  // up
        case 'S': y--; break;  // down
        case 'A': x--; break;  // left
        case 'D': x++; break;  // right
      }
    }

    return (float) Math.sqrt(x * x + y * y);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter path using W (up), A (left), S (down), D (right): ");
    String input = sc.nextLine().toUpperCase();
    System.out.println("Shortest distance: " + shortestPath(input));
  }
}
