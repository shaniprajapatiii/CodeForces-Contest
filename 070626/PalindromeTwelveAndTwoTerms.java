import java.util.*;

public class PalindromeTwelveAndTwoTerms {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         long n = sc.nextLong();
         
         long a = n % 12;

         if(a == 10) a = 22;

         if(a > n) {
            System.out.println(-1);
         } else {
            System.out.println(a + " " + (n - a));
         }
      }
      sc.close();
   }
}
