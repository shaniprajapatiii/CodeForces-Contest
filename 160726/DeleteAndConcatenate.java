import java.util.*;

public class DeleteAndConcatenate {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         long c = sc.nextLong();

         long[] a = new long[n];
         long score = 0;

         for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            score += (a[i] - c);
         }

         for(int i = 0; i < n / 2; i++) {
            long temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
         }

         Arrays.sort(a);
         for(int i = 0; i < n / 2; i++) {
            if(a[i] < c) {
               score +=  (c - a[i]);
            } else {
               break;
            }
         }
         System.out.println(score);
      }
      sc.close();
   }
}