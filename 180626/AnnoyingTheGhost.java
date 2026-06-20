import java.util.*;

public class AnnoyingTheGhost {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while (t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         int[] b = new int[n];

         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }
         for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
         }

         boolean[] usedB = new boolean[n];
         int[] dest = new int[n];
         boolean possible = true;

         for(int i = 0; i < n; i++) {
            int matchedIdx = -1;

            for(int j = 0; j < n; j++) {
               if(!usedB[j] && a[i] <= b[j]) {
                  matchedIdx = j;
                  break;
               }
            }

            if(matchedIdx == -1) {
               possible = false;
               break;
            }

            usedB[matchedIdx] = true;
            dest[i] = matchedIdx;
         }

         if(!possible) {
            System.out.println(-1);
         }
         else {
            int swaps = 0;
            for(int i = 0; i < n; i++) {
               for(int j = i + 1; j < n; j++) {
                  if(dest[i] > dest[j]) {
                     swaps++;
                  }
               }
            }
            System.out.println(swaps);
         }
      }
      sc.close();
   }
}
