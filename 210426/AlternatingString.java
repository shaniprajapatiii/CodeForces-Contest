import java.util.*;

public class AlternatingString {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         String s = sc.next();
         int n = s.length();
         int c = 0;
         for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
               c++;
            }
         }
         if (c <= 2) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}
// time complexity: O(n)
// space complexity: O(1)