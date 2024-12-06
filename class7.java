import java.util.*;

public class class7 {
  public static int factorialNum(int a) {
    if (a < 0) {
      System.out.println("Invalid");
      return -1;
    } else if (a == 0) {
      return 1;
    }
    int num = 1;
    while (a != 0) {
      num *= a;
      a--;
    }
    return num;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter Number : ");
    int a = sc.nextInt();
    System.out.println("Factorial is " + factorialNum(a));
  }
}
