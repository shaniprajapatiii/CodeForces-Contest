import java.util.*;

public class Convergence {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];

         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }

         int minCall = Integer.MAX_VALUE;

         for(int i = 0; i < n; i++) {
            long target = a[i];

            int left = 0, right = 0;
            for(int j = 0; j < n; j++) {
               if(a[j] < target) {
                  left++;
               } else if(a[j] > target) {
                  right++;
               }
            }
            minCall = Math.min(minCall, Math.max(left, right));
         }
         System.out.println(minCall);
      }
      sc.close();
   }
}
