import java.util.*;

public class DestroyingTowers {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }
         
         int currMin = a[0];
         int finalSum = 0;

         for(int i = 0; i < n; i++) {
            currMin = Math.min(currMin, a[i]);
            finalSum += currMin;
         }
         
         System.out.println(finalSum);
      }
      sc.close();
   }
}
