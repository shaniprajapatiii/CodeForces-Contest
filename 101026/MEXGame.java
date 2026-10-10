import java.util.*;
public class MEXGame {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         int[] temp = new int[n + 2];
         for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a <= n + 1) temp[a]++;
         }

         boolean alice = false;
         for(int i = 0; i <= n + 1; i++) {
            if(temp[i] < 2 * k) {
               if(temp[i] == 2 * k - 1) {
                  alice = true;
               }
               else {
                  alice = false;
               }
               break;
            }
         }

         System.out.println(alice ? "YES" : "NO");
      }
      sc.close();
   }
}
