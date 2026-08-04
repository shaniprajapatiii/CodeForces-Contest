import java.util.*;

public class Evanescent {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         int n = sc.nextInt();
         String s = sc.next();

         int count = 1;
         for(int i = 1; i < n; i++) {
            if(s.charAt(i) != s.charAt(i - 1)) {
               count++;
            }
         }

         int minComp = count;

         for(int i = 1; i < n - 1; i++) {
            char left = s.charAt(i - 1);
            char right = s.charAt(i + 1);
            char curr = s.charAt(i);

            if(curr != left && curr != right) {
               if(left == right) {
                  minComp = Math.min(minComp, count - 2);
               } else {
                  minComp = Math.min(minComp, count - 1);
               }
            }
         }
         System.out.println(minComp);
      }
      sc.close();
   }
}
