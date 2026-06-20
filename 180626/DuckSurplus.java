import java.util.*;

public class DuckSurplus {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         int n = sc.nextInt();
         long[] a = new long[n];

         for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
         }

         long maxEle = 0;
         long sufixSum = 0;
         long count = 0;
         
         for(int i = n - 1; i >= 0; i--) {
            sufixSum += a[i];
            count++;

            long currMax = (sufixSum + count - 1) / count;
            if(a[i] > currMax) {
               currMax = a[i];
            }
            if(currMax > maxEle) {
               maxEle = currMax;
            }
         }
         System.out.println(maxEle);
      }
      sc.close();
   }
}
