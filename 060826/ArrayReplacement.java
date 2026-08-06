import java.util.*;

public class ArrayReplacement {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         long[] a = new long[n];
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
         }

         long[] dp = new long[n - 1];
         for(int i = 0; i < n - 1; i++) {
            dp[i] = a[i + 1] - a[i];
         }

         int i = 0;
         while(i < n - 1) {
            int j = i;
            long parity = Math.abs(dp[i] % 2);
            while(j < n - 1 && Math.abs(dp[j] % 2) == parity) {
               j++;
            }
            Arrays.sort(dp, i, j);
            i = j;
         }

         StringBuilder sb = new StringBuilder();
         long cur = a[0];
         sb.append(cur);

         for(int k = 0; k < n - 1; k++) {
            cur += dp[k];
            sb.append(" ").append(cur);
         }

         System.out.println(sb.toString());
      }
      sc.close();
   }
}

// https://codeforces.com/contest/2252/problem/D