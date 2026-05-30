import java.util.*;

public class CakeLeveling {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      StringBuilder sb = new StringBuilder();

      while (t-- > 0) {
         int n = sc.nextInt();

         long sum = 0;
         long maxH = Long.MAX_VALUE;

         for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            sum += x;
            long currHeight = sum / (i + 1);

            maxH = Math.min(maxH, currHeight);

            sb.append(maxH).append(" ");
         }
         sb.append("\n");
      }
      System.out.print(sb.toString());
      sc.close();
   }   
}
