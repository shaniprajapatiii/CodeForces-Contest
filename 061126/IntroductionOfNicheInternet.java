import java.util.*;

public class IntroductionOfNicheInternet {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         long[] arr = new long[n];
         for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
         }
         Arrays.sort(arr);
         long sum = 0;
         for(int i = n - k; i < n; i++) sum += arr[i];

         if(k < n && arr[n - k - 1] * k >= sum) {
            System.out.println("NO");
            continue;
         }
         System.out.println("YES");
         
         for(int i = n - k; i < n; i++) {
            System.out.print(arr[i] + " ");
         }
         for(int i = n - k - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
      }
      sc.close();
   }
}
