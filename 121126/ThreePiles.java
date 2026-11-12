import java.util.Scanner;

public class ThreePiles {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int sum = a + b + c;

         if(sum % 3 == 0) {
            int target = sum / 3;
            if(a == target - 1 && b == target && c == target + 1) {
               System.out.println("YES");
            } else {
               System.out.println("NO");
            }
         }
         else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}
