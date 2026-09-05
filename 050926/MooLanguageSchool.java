import java.util.*;

public class MooLanguageSchool {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int k = sc.nextInt();
         String s = sc.next();

         int result = 0;
         for(int i = 0; i < n; i += k) {
            boolean allOne = true;
            for(int j = i; j < i + k; j++) {
               if(s.charAt(j) == '0') {
                  allOne = false; break;
               }
            }
            if(allOne) result++;
         }
         System.out.println(result);
      }
      sc.close();
   }
}