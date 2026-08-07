import java.util.*;

public class TheBestCard {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         if(prime(n + 1)) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }

   static boolean prime(int x) {
      if(x < 2) return false;
      if(x % 2 == 0) return x == 2;
      for(int i = 3; i * i <= x; i += 2) {
         if(x % i == 0) return false;
      }
      return true;
   }
}