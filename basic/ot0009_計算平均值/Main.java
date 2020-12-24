import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 1;
    int sum = sc.nextInt();
    while (sc.nextInt() != -1){
      sum = sum+sc.nextInt();
      count += 1;
    }
    System.out.print(sum/count);
    sc.close();
  }
}