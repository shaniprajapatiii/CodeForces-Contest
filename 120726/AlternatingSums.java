import java.util.*;

public class AlternatingSums {

   static final long MOD = 1000000007L;
   static final int MAXN = 200005;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long[] pow2 = new long[MAXN];
      pow2[0] = 1;

      for(int i = 1; i < MAXN; i++) {
         pow2[i] = (pow2[i - 1] * 2) % MOD;
      }

      int t = sc.nextInt();

      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }

         int i = 0;
         boolean hasMinusOne = false;

         while(i < n && a[i] == -1) {
            hasMinusOne = true;
            i++;
         }

         int positiveGroups = 0;
         int adjPairs = 0;
         int prev = -1;

         while(i < n) {
            int value = a[i];

            while(i < n && a[i] == value) {
               i++;
            }

            if(positiveGroups > 0 && value == prev + 1) {
               adjPairs++;
            }

            prev = value;
            positiveGroups++;
         }

         int groups = positiveGroups + (hasMinusOne ? 1 : 0);

         long comp = 1;

         if(hasMinusOne) {
            comp += adjPairs;
         }

         long ans = (comp % MOD) * pow2[n - groups] % MOD;

         System.out.println(ans);
      }

      sc.close();
   }
}