import java.util.*;

public class ThresholdMovement {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();

         if(n % 2 == 1) {
            for(int i = 0; i < n; i++) {
               sc.nextInt();
            }
            System.out.println("NO");
            continue;
         }

         int maxEvenPos = Integer.MIN_VALUE;
         int minOddPos = Integer.MAX_VALUE;

         for(int i = 1; i <= n; i++) {
            int w = sc.nextInt();

            if(i % 2 == 0) {
               maxEvenPos = Math.max(maxEvenPos, w);
            }
            else {
               minOddPos = Math.min(minOddPos, w);
            }
         }

         if(maxEvenPos + 1 < minOddPos) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}