import java.util.*;

public class ZhilyBracketSwapping {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         String a = sc.next();
         String b = sc.next();

         int totalOpen = 0;
         for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '(')
               totalOpen++;
            if (b.charAt(i) == '(')
               totalOpen++;
         }

         if (totalOpen != n) {
            System.out.println("NO");
            continue;
         }

         int balA = 0, balB = 0;
         boolean ok = true;

         for (int i = 0; i < n; i++) {
            char ai = a.charAt(i);
            char bi = b.charAt(i);

            if (ai == bi) {
               // Both same, no choice
               balA += (ai == '(') ? 1 : -1;
               balB += (bi == '(') ? 1 : -1;
            } else {
               if (balA <= balB) {
                  balA++; 
                  balB--; 
               } else {
                  balA--;
                  balB++;
               }
            }

            if (balA < 0 || balB < 0) {
               ok = false;
               break;
            }
         }

         System.out.println((ok && balA == 0 && balB == 0) ? "YES" : "NO");
      }
      sc.close();
   }
}