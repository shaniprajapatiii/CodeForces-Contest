import java.util.*;

public class BooksOnTheShelf {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-- > 0) {
         int n = sc.nextInt();
         int[] a = new int[n];
         for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
         }
         Arrays.sort(a);
         ArrayList<Integer> left = new ArrayList<>();
         ArrayList<Integer> middle = new ArrayList<>();
         ArrayList<Integer> right = new ArrayList<>();
         int i = 0;

         while(i < n) {
            int j = i;
            while(j < n && a[j] == a[i]) {
               j++;
            }
            int freq = j - i;
            left.add(a[i]);
            for(int k = 2; k < freq; k++) {
               middle.add(a[i]);
            }

            if(freq >= 2) {
               right.add(a[i]);
            }
            i = j;
         }
         Collections.reverse(right);
         int ans = left.size() + right.size();
         System.out.println(ans);

         StringBuilder sb = new StringBuilder();
         for(int x : left) {
            sb.append(x).append(" ");
         }
         for(int x : middle) {
            sb.append(x).append(" ");
         }
         for(int x : right) {
            sb.append(x).append(" ");
         }
         System.out.println(sb);
      }
      sc.close();
   }
}
