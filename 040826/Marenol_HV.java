import java.util.*;

public class Marenol_HV {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         solve(sc);
      }
      sc.close();
   }

   public static void solve(Scanner sc) {
      int n = sc.nextInt();
      String a = sc.next();
      String b = sc.next();

      ArrayList<Integer> evenA = new ArrayList<>();
      ArrayList<Integer> oddA = new ArrayList<>();
      ArrayList<Integer> evenB = new ArrayList<>();
      ArrayList<Integer> oddB = new ArrayList<>();

      for(int i = 0; i < n; i++) {
         if(a.charAt(i) == '1') {
            if(i % 2 == 0) evenA.add(i);
            else oddA.add(i);
         }
         if(b.charAt(i) == '1') {
            if(i % 2 == 0) evenB.add(i);
            else oddB.add(i);
         }
      }

      if(evenA.size() != evenB.size() || oddA.size() != oddB.size()) {
         System.out.println(-1);
         return;
      }

      long op = 0;

      for(int i = 0; i < evenA.size(); i++) {
         op += Math.abs(evenA.get(i) - evenB.get(i)) / 2;
      }
      for(int i = 0; i < oddA.size(); i++) {
         op += Math.abs(oddA.get(i) - oddB.get(i)) / 2;
      }

      System.out.println(op);
   }
}