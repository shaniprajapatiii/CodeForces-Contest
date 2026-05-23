import java.util.*;

public class WeBeFlipping {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {

         int n = sc.nextInt();
         
         long[] a = new long[n + 1];

         for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
         }

         ArrayList<Integer> op = new ArrayList<>();

         int flip = 0;

         for (int i = n; i >= 1; i--) {
            long curr;

            if(flip % 2 == 0) {
               curr = a[i];
            }
            else{
               curr = -a[i];
            }
            if(curr > 0) {
               op.add(i);
               flip ^= 1;
            }
         }

         System.out.println(op.size());

         for(int i : op) {
            System.out.print(i + " ");
         }

         System.out.println();
      }
      sc.close();
   }
}
