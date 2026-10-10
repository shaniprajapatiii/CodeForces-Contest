import java.util.*;

public class RobotOddMoves {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int a = sc.nextInt();
         int b = sc.nextInt();

         if(a == 0 && b == 0) {
            System.out.println(0);
         }
         else if (b <= a && (a % 2 == b % 2)) {
            System.out.println(a);
         }
         else if (b <= a + 1 && ((a + 1) % 2 == b % 2)) {
            System.out.println(a + 1);
         }
         else {
            System.out.println(-1);
         }
      }
      sc.close();
   }
}