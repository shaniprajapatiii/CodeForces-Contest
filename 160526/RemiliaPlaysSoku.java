import java.util.*;

public class RemiliaPlaysSoku {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         long n = sc.nextLong();
         long x1 = sc.nextLong();
         long x2 = sc.nextLong();
         long k = sc.nextLong();

         long diff = Math.abs(x1 - x2);
         long distance = Math.min(diff, n - diff);
         
         if(n <= 3) {
            System.out.println(distance);
         }
         else {
            System.out.println(distance + k);
         }
      }

      sc.close();
   }
}
