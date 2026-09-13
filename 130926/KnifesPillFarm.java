import java.util.*;

public class KnifesPillFarm {
   public static void main(String[] args) {
      Scanner sc = new Scanner((System.in));
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int m = sc.nextInt();
         long[] a = new long[n];
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
         }

         int k = m - 1;
         PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
         long sum = 0;
         long ans = Long.MIN_VALUE;

         for(int i = 0; i < n; i++) {
            if(pq.size() == k) {
               long score = (long) m * a[i] - sum;
               ans = Math.max(ans, score);
            }
            if(k > 0) {
               if(pq.size() < k) {
                  pq.add(a[i]);
                  sum += a[i];
               }
               else {
                  if(a[i] < pq.peek()) {
                     long removed = pq.poll();
                     sum -= removed;
                     pq.add(a[i]);
                     sum += a[i];
                  }
               }
            }
         }
         System.out.println(ans);
      }
      sc.close();
   }
}