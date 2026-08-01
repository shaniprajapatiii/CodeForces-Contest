import java.util.*;

public class MergeToMatch {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {

         int n = sc.nextInt();
         int m = sc.nextInt();
         int[] a = new int[n];
         int[] b = new int[m];

         for(int i = 0; i < n; i++) a[i] = sc.nextInt();
         for (int i = 0; i < m; i++) b[i] = sc.nextInt();
         Arrays.sort(a);
         Arrays.sort(b);

         boolean ok = true;
         if(n < 2*m) ok = false;
         if(ok) {
            for(int i = 0; i < m; i++) {
               if(a[i] >= b[i]) {
                  ok = false;
                  break;
               }
            }
         }
         if(ok) {
            for(int i = 0; i < m; i++) {
               if(a[n - m + i] <= b[i]) {
                  ok = false;
                  break;
               }
            }
         }
         System.out.println(ok ? "YES" : "NO");
      }
      sc.close();
   }
}