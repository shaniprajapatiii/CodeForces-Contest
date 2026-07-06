import java.util.*;

public class Biagrams {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      
      while(t-- > 0) {
         int k = sc.nextInt();

         boolean ok = false;
         int twice = 0;

         for(int i = 0; i < k; i++) {
            int c = sc.nextInt();

            if(c >= 3) {
               ok = true;
            }
            if(c >= 2) {
               twice++;
            }
         }
         if(ok || twice >= 2) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}