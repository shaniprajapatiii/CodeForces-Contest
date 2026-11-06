import java.util.*;
public class P2_15K4JR3B {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] arr = new int[n];

         for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
         }
         Arrays.sort(arr);
         long x = 0, y = 0;
         for(int i = n - 1; i >= 0; i--) {
            long val = 1L << arr[i];
            if(x <= y) {
               x += val;
            } else {
               y += val;
            }
         }
         System.out.println(x * y);
      }
      sc.close();
   }
}