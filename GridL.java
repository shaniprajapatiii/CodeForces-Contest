import java.util.*;

public class GridL {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         long p = sc.nextLong();
         long q = sc.nextLong();

         // long s = p + 2 * q;

         if(p == 0) {
            if(q % 2 == 0) {
               System.out.println(-1);
            } else {
               System.out.println(1 + " " + q);
            }
         }
         else {
            if(p == 1 && q == 1) {
               System.out.println(-1);
            } else if(q >= 2) {
               System.out.println(2 + " " + 2);
            } else {
               System.out.println(1 + " " + 2);
            }
         }

      }
      sc.close();
   }
}
