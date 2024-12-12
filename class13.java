// import java.util.*;

public class class13 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    for (int i = 0; i < sb.length() / 2; i++) {
      char front = sb.charAt(i);
      char back = sb.charAt(sb.length() - 1 - i);
      sb.setCharAt(i, back);
      sb.setCharAt(sb.length() - i - 1, front);
    }
    System.out.println(sb);
  }
}
