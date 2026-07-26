import java.util.*;

public class StringConstruction {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();

         if (k == n - 1) {
            System.out.println(-1);
            continue;
         }
         int blocks = n - k;
         int extraZero = k / 2;
         int extraOne = (k + 1) / 2;

         StringBuilder sb = new StringBuilder();
         char cur = '0';

         for (int b = 1; b <= blocks; b++) {
            int len = 1;
            if (b == 1) {
               len += extraZero;
            }
            else if (b == 2) {
               len += extraOne;
            }

            for(int j = 0; j < len; j++) {
               sb.append(cur);
            }
            cur = (cur == '0') ? '1' : '0';
         }
         System.out.println(sb.toString());
      }
      sc.close();
   }
}
