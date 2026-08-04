import java.util.*;

public class Riptide {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0) {
         int[] arr = new int[3];
         arr[0] = sc.nextInt();
         arr[1] = sc.nextInt();
         arr[2] = sc.nextInt();

         Arrays.sort(arr);
         if(arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(0);
         } else {
            System.out.println(Math.min(arr[1] - arr[0], arr[2] - arr[1]));
         }
      }
      sc.close();
   }
}