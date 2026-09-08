import java.util.*;

public class MonocarpAndProject {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         long x = sc.nextLong();
         long y = sc.nextLong();
         long k = sc.nextLong();

         long diff = y - x;
         long ans = 0;
         long count = 0;
         while (count < k && x + count <= diff) {
            ans += diff % (x + count);
            count++;
         }
         if(count < k) {
            ans += (k - count) * diff;
         }
         System.out.println(ans);
      }
      sc.close();
   }   
}
