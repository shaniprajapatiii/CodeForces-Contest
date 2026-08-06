import java.util.Scanner;

public class AlwaysChanging {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         String s = sc.next();

         int count0 = 0, count1 = 0;
         int k0 = 0, k1 = 0;
         char last = ' ';

         for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '0') {
               count0++;
            } else {
               count1++;
            }

            if(ch != last) {
               if(ch == '0') {
                  k0++;
               } else {
                  k1++;
               }
               last = ch;
            }
         }


         int maxOne = -1;

         for(int d = -1; d <= 1; ++d) {
            if(Math.abs(count0 - count1 - d) <= 1) {
               int r1 = Math.min(k1, k0 - d);
               int r0 = r1 + d;
               if(r1 >= 0 && r0 >= 0) {
                  maxOne = Math.max(maxOne, r0 + r1);
               }
            }
         }

         if(maxOne == -1) {
            System.out.println("-1");
         } else {
            System.out.println(n - maxOne);
         }
      }
      sc.close();
   }
}

// https://codeforces.com/contest/2252/problem/B