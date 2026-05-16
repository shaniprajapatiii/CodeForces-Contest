import java.util.*;

public class MarisaStealsReimusTakeout {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         int[] w = new int[n];

         for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
         }

         int count0 = 0;
         int count1 = 0;
         int count2 = 0;

         for (int i = 0; i < n; i++) {
            if(w[i] == 0) {
               count0++;
            } 
            else if(w[i] == 1) {
               count1++;
            } 
            else if(w[i] == 2) {
               count2++;
            }
         }

         int ans = count0;
         int minCount = Math.min(count1, count2);
         ans += minCount;
         ans += (count1 - minCount) / 3;
         ans += (count2 - minCount) / 3;
         System.out.println(ans);
      }

      sc.close();
   }
}
