import java.util.Scanner;

public class Marenol_EV {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      if(sc.hasNextInt()) {
         int t = sc.nextInt();
         while (t-- > 0) {
            solve(sc);
         }
      }
      sc.close();
   }

   public static void solve(Scanner sc) {
      int n = sc.nextInt();
      String a = sc.next();
      String b = sc.next();

      int evenA = 0, oddA = 0;
      int evenB = 0, oddB = 0;
      for(int i = 0; i < n; i++) {
         if(a.charAt(i) == '1') {
            if(i % 2 == 0) evenA++;
            else oddA++;
         }
         if(b.charAt(i) == '1') {
            if(i % 2 == 0) evenB++;
            else oddB++;
         }
      }

      if(evenA == evenB && oddA == oddB) {
         System.out.println("YES");
      } else {
         System.out.println("NO");
      }
   }
}