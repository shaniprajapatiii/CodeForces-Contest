import java.util.*;

public class UnrequitedLove {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         long[] a = new long[n];
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
         }
         int m = n - 4;
         long[] value = new long[m];
         HashMap<Long, Long> freq = new HashMap<>();

         for(int i = 0; i < m; i++) {
            value[i] = a[i] + a[i + 2] - a[i + 4];
            freq.put(value[i], freq.getOrDefault(value[i], 0L) + 1);
         }

         long ans = 0;
         for(long count : freq.values()) {
            ans += count * (count - 1) / 2;
         }

         for(int i = 0; i < m; i++) {
            if(i + 2 < m && value[i] == value[i + 2]) {
               ans--;
            }
            if(i + 4 < m && value[i] == value[i + 4]) {
               ans--;
            }
         }
         System.out.println(ans);
      }
      sc.close();
   }
}
