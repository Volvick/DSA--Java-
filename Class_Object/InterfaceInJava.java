package Class_Object;

public class InterfaceInJava{
  public static void main(String[] args) {
    Queen q1 = new Queen();
    q1.moves();
  }

}
interface ChessPlayer{
  void moves();
}
class Queen implements ChessPlayer{
  public void moves(){
    System.out.println("left,right,top,bottom and diagonal(in all 4 dir)");
  }
}
class Rook implements ChessPlayer{
  public void moves(){
    System.out.println("up,down,left,right");
  }
}
class King implements ChessPlayer{
  public void moves(){
    System.out.println("up,down,left,right and diagonal by -1Step");
  }
}
