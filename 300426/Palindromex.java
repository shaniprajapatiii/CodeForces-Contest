import java.util.*;

public class Palindromex {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int size = 2 * n;
         int[] arr = new int[size];

         int p1 = -1, p2 = -1;
         for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
               if(p1 == -1) {
                  p1 = i;
               } else {
                  p2 = i;
               }
            }
         }

         int ans = 0;
         ans = Math.max(ans, getMex(arr, p1, p1, n));
         ans = Math.max(ans, getMex(arr, p2, p2, n));
         ans = Math.max(ans, getMex(arr, (p1 + p2) / 2, (p1 + p2 + 1) / 2, n));
         
         System.out.println(ans);
      }
      sc.close();
   }

   public static int getMex(int[] arr, int l, int r, int n) {
      int size = arr.length;

      while(l >= 0 && r < size && arr[l] == arr[r]) {
         l--;
         r++;
      }
      l++;
      r--;
      int[] freq = new int[n + 1];
      for(int i = l; i <= r; i++) {
         if(arr[i] < n) {
            freq[arr[i]]++;
         }
      }
      int mex = 0;
      while(freq[mex] > 0) {
         mex++;
      }
      return mex;
   }
}
/*
6
4
1 2 0 3 3 0 2 1
2
0 1 0 1
2
1 1 0 0
3
2 0 2 1 1 0
4
0 1 3 0 3 1 2 2
3
0 1 2 1 0 2
OutputCopy
4
2
1
1
2
3
*/