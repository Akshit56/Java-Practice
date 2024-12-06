// //Arrays

// public class class10 {
//   public static void main(String[] args) {
//     int nums[] = new int[3];
//     nums[0] = 10;
//     nums[1] = 20;
//     nums[2] = 30;
//     int nums2[] = { 1, 2, 3, 4, 5 };
//     for (int i = 0; i < 3; i++) {
//       System.out.print(nums[i] + " ");
//     }
//   }
// }

// taking size and array numbers from the user:
// import java.util.*;

// public class class102 {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     int arr[] = new int[size];
//     for (int i = 0; i < size; i++) {
//       arr[i] = sc.nextInt();
//     }
//     System.out.print("\n");
//     for (int i = 0; i < size; i++) {
//       System.out.print(arr[i] + " ");
//     }
//   }
// }

//find number in an array and print that index:

import java.util.*;

public class class103 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Size of Array : ");
    int size = sc.nextInt();
    System.out.print("\n");
    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Your Array is : ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
    System.out.print("Enter the number you want to find: ");
    int num = sc.nextInt();
    int found = 0;
    for (int i = 0; i < size; i++) {
      if (arr[i] == num) {
        System.out.println("Found at index : " + i);
        found = 1;
        break;
      }
    }
    if (found == 0) {
      System.out.println("Not Found");
    }
  }
}
