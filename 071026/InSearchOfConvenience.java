import java.util.*;

public class InSearchOfConvenience {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int x = sc.nextInt();
         int y = sc.nextInt();
         int r = sc.nextInt();

         int x1 = x;
         int y1 = y + r;

         System.out.println(x1 + " " + y1);
      }
      sc.close();
   }
}