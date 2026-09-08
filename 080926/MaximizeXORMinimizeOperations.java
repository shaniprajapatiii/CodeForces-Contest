import java.util.*;

public class MaximizeXORMinimizeOperations {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         long x = sc.nextLong();
         long y = sc.nextLong();

         long sum = x + y;
         long cur = 0;
         long target = 0;

         for(int i = 30; i >= 0; i--) {
            long bit = 1L << i;
            if((sum & bit) != 0) {
               cur |= bit;
               if(target + bit <= x) {
                  target += bit;
               }
            }
         }

         long ops = x - target;
         System.out.println(cur + " " + ops);
      }
      sc.close();
   }
}