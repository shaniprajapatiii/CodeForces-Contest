import java.util.*;
public class DidNotGoToPrint {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         String s = sc.next();

         Stack<Integer> stack = new Stack<>();
         boolean[] print = new boolean[n + 1];
         int count = 0;
         for(int i = 1; i <= n; i++) {
            char ch = s.charAt(i - 1);
            if(ch == '1') {
               stack.push(i);
            }
            else if(ch == '2') {
               if(!stack.isEmpty()) {
                  int doc = stack.pop();
                  print[doc] = true;
               }
               else {
                  print[i] = true;
               }
            }
            else if(ch == '3') {
               print[i] = true;
            }
         }

         for(int i = 1; i <= n; i++) {
            if(!print[i]) {
               count++;
            }
         }

         System.out.println(count);

         for(int i = 1; i <= n; i++) {
            if(!print[i]) {
               System.out.print(i + " ");
            }
         }
         System.out.println();
      }
      sc.close();
   }
}