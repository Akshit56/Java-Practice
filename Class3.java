// import java.util.*;

// public class Class3 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();
//     if (age >= 18) {
//       System.out.println("Adult");
//     } else {
//       System.out.println("Not Adult");
//     }
//   }

// }

import java.util.*;

public class Class3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch (button) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Bonjour");
        break;
      default:
        System.out.println("Invalid");
    }
  }

}
