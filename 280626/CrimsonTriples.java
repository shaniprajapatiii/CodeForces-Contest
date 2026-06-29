import java.util.*;

public class CrimsonTriples {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();

         long ans = 0;
         for (int i = 1; i <= n; i++) {
            long cnt = n / i;
            ans += cnt * cnt;
         }

         System.out.println(ans);
      }
      
      sc.close();
   }
}
