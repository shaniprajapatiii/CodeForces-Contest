import java.util.*;

public class EverythingEverywhere {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int p = sc.nextInt();   // first element

         int ans = 0;
         for (int i = 1; i < n; i++) {
            int c = sc.nextInt();

            int d = Math.abs(p - c);

            int m = Math.max(p, c);

            if (d > 0 && m % d == 0) {
               ans++;
            }
            p = c;
         }
         System.out.println(ans);
      }
      sc.close();
   }
}
