import java.util.*;

public class PermutationConstruction {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();
      while (t-- > 0) {

         int n = sc.nextInt();
         long[] a = new long[n];

         for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
         }

         long[][] s = new long[n][2];
         long sum = 0;

         for (int i = 0; i < n; i++) {
            s[i][0] = sum;
            s[i][1] = i;
            sum += a[i];
         }

         Arrays.sort(s, (x, y) -> Long.compare(x[0], y[0]));

         int[] res = new int[n];
         for (int i = 0; i < n; i++) {
            res[(int) s[i][1]] = n - i;
         }

         for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
         }
         System.out.println();
      }

      sc.close();
   }
}