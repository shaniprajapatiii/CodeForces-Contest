import java.util.*;

public class MentalMonumental {

   static void solve(Scanner sc) {
      int n = sc.nextInt();
      int[] a = new int[n];

      for (int i = 0; i < n; i++) {
         a[i] = sc.nextInt();
      }

      Arrays.sort(a);

      int l = 0, h = n, maxwf = 0;

      while (l <= h) {
         int m = (l + h) / 2;

         boolean[] u = new boolean[m];

         // mark valid
         for (int i = 0; i < m; i++) {
            if (a[i] <= m - i - 1) { // IMPORTANT FIX from image
               u[i] = true;
            }
         }

         int p = 0;
         boolean ok = true;

         for (int i = 0; i < m; i++) {
            if (u[i]) {

               // EXACT condition from image
               while (p < n && (p <= i || a[p] < 2 * i + 1)) {
                  p++;
               }

               if (p >= n) {
                  ok = false;
                  break;
               }

               p++;
            }
         }

         if (ok) {
            maxwf = m;
            l = m + 1;
         } else {
            h = m - 1;
         }
      }

      System.out.println(maxwf);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();
      while (t-- > 0) {
         solve(sc);
      }

      sc.close();
   }
}