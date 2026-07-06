import java.util.*;

public class PredominantFrequencyDivision {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];

         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }

         if(n < 4) {
            System.out.println("NO");
            continue;
         }

         int[] s1 = new int[n];
         int[] s2 = new int[n];

         s1[0] = (a[0] == 1) ? 1 : -1;

         s2[0] = (a[0] == 3) ? -1 : 1;

         for(int i = 1; i < n; i++) {
            s1[i] = s1[i - 1] + (a[i] == 1 ? 1 : -1);
            s2[i] = s2[i - 1] + (a[i] == 3 ? -1 : 1);
         }

         int[] max = new int[n];
         max[n - 2] = s2[n - 2];

         for(int i = n - 3; i >= 0; i--) {
            max[i] = Math.max(max[i + 1], s2[i]);
         }

         boolean ok = false;

         for(int i = 0; i <= n - 4; i++) {
            if(s1[i] >= 0 && max[i + 2] >= s2[i]) {
               ok = true;
               break;
            }
         }

         if(ok) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }

      sc.close();
   }
}