import java.util.*;
public class StakesAndShapes {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int x = sc.nextInt();
         int y = sc.nextInt();
         int z = sc.nextInt();

         int n = x + y + z;
         StringBuilder sb = new StringBuilder();
         char move;
         if(y >= z) {
            move = 'R';
         }
         else if(z >= x) {
            move = 'S';
         }
         else {
            move = 'P';
         }
         for(int i = 0; i < n; i++) {
            sb.append(move);
         }
         System.out.println(sb.toString());
      }
      sc.close();
   }
}
