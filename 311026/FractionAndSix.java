import java.util.Scanner;

public class FractionAndSix {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int m = sc.nextInt();
         String p = sc.next();
         String q = sc.next();

         int[] countP = new int[26];
         int[] countQ = new int[26];
         for(char c : p.toCharArray()) {
            countP[c - 'a']++;
         }
         for(char c : q.toCharArray()) {
            countQ[c - 'a']++;
         }
         for(int i = 0; i < 26; i++) {
            int common = Math.min(countP[i], countQ[i]);
            countP[i] -= common;
            countQ[i] -= common;
         }
         boolean possible = true;
         for(int i = 0; i < 26; i++) {
            if(countQ[i] > 0) {
               possible = false;
               break;
            }
         }
         if(possible) {
            int sIdx = 's' - 'a';
            int iIdx = 'i' - 'a';
            int xIdx = 'x' - 'a';

            if(countP[sIdx] == 1 && countP[iIdx] == 1 && countP[xIdx] == 1) {
               for(int i = 0; i < 26; i++) {
                  if(i != sIdx && i != iIdx && i != xIdx) {
                     if(countP[i] > 0) {
                        possible = false;
                        break;
                     }
                  }
               }
            } else {
               possible = false;
            }
         }

         if(possible) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}