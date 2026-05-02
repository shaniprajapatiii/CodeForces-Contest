import java.util.*;

public class ItAllWentSideways {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         long[] arr = new long[n];
         long m = 0;

         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            m += arr[i];
         }

      }
      sc.close();
   }
}
