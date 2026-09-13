import java.util.*;

public class RumbNeedAHand {
   public static void main(String[] args) {
      Scanner sc = new Scanner((System.in));
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] p = new int[n];
         for(int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
         }

         ArrayList<Integer> list = new ArrayList<>();
         for(int i = 0; i < n; i++) {
            if(p[i] != i + 1) {
               list.add(i);
            }
         }
         boolean can = true;
         int m = list.size();
         for(int i = 0; i < m; i++) {
            int pos = list.get(i);
            int target = list.get(list.size() - 1 - i);
            if(p[pos] != target + 1) {
               can = false;
               break;
            }
         }
         System.out.println(can ? "YES" : "NO");
      }
      sc.close();
   }
}