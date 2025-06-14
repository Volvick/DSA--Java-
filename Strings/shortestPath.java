package Strings;

public class shortestPath {
  public static float shortestPath(String str) {
    int x = 0, y = 0;
    for (int i = 0; i < str.length(); i++) {
      char dir = str.charAt(i);
      switch (dir) {
        case 'S': y--;
          break;
        case 'N': y++;
          break;
        case 'W': x--;
          break;
        default: x++;
          break;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static void main(String[] args) {
    String str = "WNEENESENNN";
    System.out.println(shortestPath(str));
  }
}
