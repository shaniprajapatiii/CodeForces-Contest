import java.util.*;

public class InSearchOfConvenience {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int x = sc.nextInt();
         int y = sc.nextInt();
         int r = sc.nextInt();

         boolean found = false;

         for(int i = -r; i <= r && !found; i++) {
            for(int j = -r; j <= r; j++) {
               int x1 = x - i;
               int y1 = y - j;
               if((x1*x1 + y1*y1) == r*r) {
                  System.out.println(i + " " + j);
                  found = true;
                  break;
               }
            }
         }
      }
      sc.close();
   }
}