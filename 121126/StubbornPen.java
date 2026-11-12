import java.util.Scanner;

public class StubbornPen {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         String s = sc.next();
         char curr = 'R';
         int count = 0;

         for(int i = 0; i < n; i++) {
            if(curr != s.charAt(i)) {
               count++;
               curr = (curr == 'R') ? 'B' : 'R';
            }
            curr = (curr == 'R') ? 'B' : 'R';
         }
         System.out.println(count);
      }
      sc.close();
   }
}
