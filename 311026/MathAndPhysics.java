import java.util.*;

public class MathAndPhysics {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         long sum = 0;
         boolean in = false;
         boolean found = false;
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if(a[i] >= 2) {
               found = true;
               if(i > 0 && i < n - 1) {
                  in = true;
               }
            }
         }
         if(!found) {
            System.out.println(-1);
         }
         else if(in) {
            System.out.println(sum - 1);
         }
         else {
            System.out.println(sum - (n - 1));
         }
      }
      sc.close();
   }
}
