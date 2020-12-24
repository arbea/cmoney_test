import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float BMI = (float)Math.pow(1/(sc.nextDouble()/100),2)*sc.nextFloat();
    if (BMI<18.5)
      System.out.printf("%.1f 過輕", BMI);
    else if (BMI<24)
      System.out.printf("%.1f 正常", BMI);
    else if (BMI<27)
      System.out.printf("%.1f 過重", BMI);
    else if (BMI<30)
      System.out.printf("%.1f 輕度肥胖", BMI);
    else if (BMI<35)
      System.out.printf("%.1f 中度肥胖", BMI);
    else
      System.out.printf("%.1f 重度肥胖", BMI);
    sc.close();
  }
}