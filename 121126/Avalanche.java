import java.util.*;

public class Avalanche {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         int xor = 0;
         for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(i % (k + 1) == 0) {
               xor ^= (a & 1);
            }
         }
         System.out.println(xor == 1 ? "Alice" : "Bob");
      }
      sc.close();
   }
}