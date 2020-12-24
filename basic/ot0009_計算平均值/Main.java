import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int input = sc.nextInt();
    int sum = 0;
    while (input != -1){
      sum = sum+input;
      count += 1;
      input = sc.nextInt();
    }
    System.out.print(sum/count);
    sc.close();
  }
}