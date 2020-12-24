import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print(2*sc.nextInt()+6/sc.nextInt()+sc.nextInt());
    sc.close();
  }
}
