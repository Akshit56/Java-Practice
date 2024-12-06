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

import java.util.*;

public class class102 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("\n");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
