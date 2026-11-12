import java.util.*;
public class LettersDown {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         String s = sc.next();
         boolean[] used = new boolean[26];
         for(int i = 0; i < n / 2; i++) {
            int a = s.charAt(i) - 'a';
            int b = s.charAt(n - 1 - i) - 'a';
            int low = Math.min(a, b);
            int high = Math.max(a, b);

            for(int j = low; j < high; j++) {
               used[j] = true;
            }
         }
         int ans = 0;
         for(int i = 0; i < 26; i++) {
            if(used[i]) {
               ans++;
            }
         }
         System.out.println(ans);
      }
      sc.close();
   }
}
