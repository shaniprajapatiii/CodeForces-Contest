import java.util.*;

public class NumberBwTwoNo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         long x = sc.nextLong();
         long y = sc.nextLong();
         boolean found = false;
         for (long i = x + 1; i < y; i++) {
            if (y % i == 0) {
               found = true;
               break;
            }
         }
         if (found) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}

// time complexity: O(y - x)
// space complexity: O(1)

