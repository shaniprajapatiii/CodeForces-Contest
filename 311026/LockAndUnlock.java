import java.util.*;
public class LockAndUnlock {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t= sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }
         Arrays.sort(a);
         int mid = a[n / 2];
         int cost = 0;
         for(int i = 0; i < n; i++) {
            cost += Math.abs(a[i] - mid);
         }
         System.out.println(cost + " " + (a[n -1] - a[0]));
      }
      sc.close();
   }
}
