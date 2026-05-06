import java.util.*;

public class ZhilyAndArrayOperating {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();
      while (t-- > 0) {

         int n = sc.nextInt();
         long[] arr = new long[n];

         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
         }

         int count = 0;
         long suffixSum = 0;

         for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + suffixSum > 0) {
               suffixSum += arr[i];
               count++;
            } else {
               suffixSum = 0;
            }
         }

         System.out.println(count);
      }

      sc.close();
   }
}