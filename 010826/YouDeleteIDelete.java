import java.util.*;

public class YouDeleteIDelete {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         String s = sc.next();
         String ans = null;
         
         for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0') continue;

            String afterAlice = deleteChar(s, i);
            String best = null;
            
            for(int j = 0; j < afterAlice.length(); j++) {
               if(afterAlice.charAt(j) != '1') continue;
               
               String afterBob = deleteChar(afterAlice, j);

               if(best == null || afterBob.compareTo(best) < 0) {
                  best = afterBob;
               }
            }

            if(ans == null || best.compareTo(ans) > 0) {
               ans = best;
            }
         }

         System.out.println(ans);
      }

      sc.close();
   }

   private static String deleteChar(String s, int idx) {
      return s.substring(0, idx) + s.substring(idx + 1);
   }
}