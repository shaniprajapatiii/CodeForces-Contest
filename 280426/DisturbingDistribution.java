import java.util.*;

public class DisturbingDistribution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];

         long sum = 0;
         int lastOneIndex = -1;
         boolean hasOne = false;
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > 1) {
               sum += a[i];
            }
            else {
               hasOne = true;
               lastOneIndex = i;
            }
         }
         if(hasOne) {
            boolean ok = false;
            for(int i = lastOneIndex + 1; i < n; i++) {
               if(a[i] > 1) {
                  ok = true;
                  break;
               }
            }
            if(!ok) {
               sum += 1;
            }
         }
         System.out.println(sum % 100000);
      }
      sc.close();
   }
}