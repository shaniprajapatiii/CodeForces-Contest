import java.util.*;

public class AnotherPuzzleFromPapyrus {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         int c = sc.nextInt();

         int[] a = new int[n];
         int[] b = new int[n];
         
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }
         for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
         }

         long ans = Long.MAX_VALUE;
         boolean possible = true;
         long cost = 0;

         for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
               possible = false;
               break;
            }
            cost += (a[i] - b[i]);
         }
         if (possible) {
            ans = cost;
         }

         int[] sa = Arrays.copyOf(a, n);
         Arrays.sort(sa);

         int[] sb = Arrays.copyOf(b, n);
         Arrays.sort(sb);

         possible = true;
         cost = c;

         for (int i = 0; i < n; i++) {
            if (sa[i] < sb[i]) {
               possible = false;
               break;
            }
            cost += (sa[i] - sb[i]);
         }
         if (possible) {
            ans = Math.min(ans, cost);
         }

         if (ans == Long.MAX_VALUE) {
            System.out.println(-1);
         } else {
            System.out.println(ans);
         }
      }
      sc.close();
   }
}