import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    for(int i = 0; i < N; i++){
        int k = sc.nextInt();
        int max = 0;
        for(int j =  0; j < k; j++){
            max = Math.max(max, sc.nextInt());            
        }
        System.out.println(max);
    }
    sc.close();
  }
}
