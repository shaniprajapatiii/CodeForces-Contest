import java.util.*;

public class BossFight {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         int n = sc.nextInt();
         HashMap<Integer, Integer> freq = new HashMap<>();
         int sum = 0;
         int maxFreq = 0;
         int maxValue = 0;

         for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
            freq.put(x, freq.getOrDefault(x, 0) + 1);

            if(freq.get(x) > maxFreq) {
               maxFreq = freq.get(x);
               maxValue = x;
            }
         }

         if(maxFreq <= n - maxFreq + 1) {
            System.out.println(sum);
         } else {
            int unused = maxFreq - (n - maxFreq + 2);
            int ans = sum - unused * maxValue;
            System.out.println(ans);
         }
      }
      sc.close();
   }
}
// https://codeforces.com/contest/2252/problem/A