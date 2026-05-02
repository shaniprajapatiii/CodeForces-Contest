import java.util.*;

public class RedBlackPair {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long t = sc.nextLong();
      while (t-- > 0) {
         int n = sc.nextInt();
         String s1 = sc.next();
         String s2 = sc.next();
         
         int d0 = 0;
         int d1 = s1.charAt(0) != s2.charAt(0) ? 1 : 0;

         for (int i = 1; i < n; i++) {
            int v = s1.charAt(i) != s2.charAt(i) ? 1 : 0;
            int h = (s1.charAt(i) != s1.charAt(i - 1) ? 1 : 0) + (s2.charAt(i) != s2.charAt(i - 1) ? 1 : 0);
            int d2 = Math.min(d0 + h, d1 + v);
            d0 = d1;
            d1 = d2;
         }
         System.out.println(d1);

      }
      sc.close();
   }
}
// input: 
// 3
// 1
// R
// B
// 2
// BR
// BR
// 3
// RBR
// BRB
// output:
// 1
// 0
// 2
