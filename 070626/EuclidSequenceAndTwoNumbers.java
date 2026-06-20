import java.util.*;

public class EuclidSequenceAndTwoNumbers {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         int n = sc.nextInt();
         int[] b = new int[n];
         for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
         }

         Arrays.sort(b);

         // int left = 0, right = n - 1;
         // while(left < right) {
         //    int temp = b[left];
         //    b[left] = b[right];
         //    b[right] = temp;
         //    left++;
         //    right--;
         // }

         boolean valid = true;
         for(int i = n - 1; i >= 2; i--) {
            if(b[i] % b[i - 1] != b[i - 2]) {
               valid = false;
               break;
            }        
         }

         if(valid) {
            System.out.println(b[n - 1] +" "+ b[n - 2]);
         } 
         else {
            System.out.println(-1);
         }
      }
      sc.close();
   }
}
