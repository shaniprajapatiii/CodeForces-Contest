import java.util.*;

public class WhoWatchesTheWatchpig {
   static final int inf = 1_000_000;

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         String s = sc.next();

         int ans = inf;

         for(int m = 0; m <= n; m++) {
            int[][] dp = new int[n + 1][m + 1];
            for(int i = 0; i <= n; i++) Arrays.fill(dp[i], inf);

            dp[0][0] = 0;

            for(int i = 0; i < n; i++) {
               for(int p = 0; p <= Math.min(i, m); p++) {
                  if(dp[i][p] == inf) continue;

                  if(p >= k) {
                     int cost = dp[i][p] + (s.charAt(i) == 'L' ? 0 : 1);
                     dp[i + 1][p] = Math.min(dp[i + 1][p], cost);
                  }

                  if(p < m) {
                     int suffixL = (n - (i + 1)) - (m - (p + 1));
                     if(suffixL >= k) {
                        int cost = dp[i][p] + (s.charAt(i) == 'R' ? 0 : 1);
                        dp[i + 1][p + 1] = Math.min(dp[i + 1][p + 1], cost);
                     }
                  }
               }
            }
            ans = Math.min(ans, dp[n][m]);
         }

         if(ans == inf)
            System.out.println(-1);
         else {
            System.out.println(ans);
         }
      }
      sc.close();
   }
}