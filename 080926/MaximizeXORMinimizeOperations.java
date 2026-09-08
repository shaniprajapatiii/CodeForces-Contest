import java.util.*;

public class MaximizeXORMinimizeOperations {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         long x = sc.nextLong();
         long y = sc.nextLong();

         long sum = x + y;
         long cur = x;

         while((cur & (sum - cur)) != 0) {
            long low = cur & (sum - cur);
            cur -= Long.lowestOneBit(low);
         }

         System.out.println(sum + " " + (x - cur));
      }
      sc.close();
   }
}
