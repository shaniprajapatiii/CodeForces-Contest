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
         for(int i = 62; i >= 0; i++) {
            if(((sum >> i) & 1L) == 1L) {
               if((cur | (1L << i)) <= x) {
                  cur |= (1L << i);
               }
            }
         }

         System.out.println(sum + " " + (x - cur));
      }
      sc.close();
   }   
}
