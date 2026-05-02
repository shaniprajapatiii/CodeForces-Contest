import java.util.*;

public class PartyMonster {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long t = sc.nextLong();
      while (t-- > 0) {
         long n = sc.nextLong();
         // s is the string of length n
         String s = sc.next();

         long countOpen = 0;
         long countClose = 0;
         for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
               countOpen++;
            } else {
               countClose++;
            }
         }
         if (countOpen == countClose) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}
/* 
6
2
()
2
)(
3
(((
6
())(()
4
(()(
5
)()()
OutputCopy
YES
YES
NO
YES
NO
NO
*/