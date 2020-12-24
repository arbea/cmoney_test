import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int output = 0;
    while(input != 0){
        output = output*10+input%10;
        input = input/10;        
    }
    System.out.print(output);
    sc.close();
  }
}
