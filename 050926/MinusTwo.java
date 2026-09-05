import java.util.HashMap;
import java.util.Scanner;

public class MinusTwo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int odd = 0, div4 = 0, div2 = 0, ans = 0;
         HashMap<Integer, Integer> freq = new HashMap<>();
         for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int count = freq.getOrDefault(a, 0) + 1;
            freq.put(a, count);
            ans = Math.max(ans, count);

            if((a & 1) == 1) odd++;
            else if(a % 4 == 0) div4++;
            else div2++;
         }
         ans = Math.max(ans, odd);
         ans = Math.max(ans, div2);
         ans = Math.max(ans, div4);
         System.out.println(ans);
      }
      sc.close();
   }  
}