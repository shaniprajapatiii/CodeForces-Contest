import java.util.*;

public class DissQuackAndArrayGame {

   static final long MOD = 1000000007L;
   static final long INF = Long.MAX_VALUE / 4;

   static long[] pow2 = new long[21];

   static{
      for(int i = 0; i <= 20; i++) {
         pow2[i] = 1L << i;
      }
   }

   static long removeCost(long w) {
      long result = 0;

      while(w > 0) {
         if((w & 1) == 1) {
            w--;
            result++;
         } else {
            w >>= 1;
            result++;
         }
      }

      return result;
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }

         long ans = INF;

         for(int k = 0; k <= 20; k++) {
            long step = pow2[k];
            long curr = k;

            for(int x : a) {
               long need = (x + step - 1) / step;
               long best = INF;

               for(int j = 0; j <= 20; j++) {
                  long block = pow2[j];
                  long w = ((need + block - 1) / block) * block;
                  long cost = (w - need) * step + removeCost(w);
                  if(cost < best) {
                     best = cost;
                  }
               }
               curr += (need * step - x) + best;
               if(curr >= ans) break;
            }

            ans = Math.min(ans, curr);
         }
         System.out.println(ans);
      }

      sc.close();
   }
}