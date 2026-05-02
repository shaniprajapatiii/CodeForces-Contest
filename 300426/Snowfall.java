import java.util.*;

public class Snowfall {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long t = sc.nextLong();
      while (t-- > 0) {
         long n = sc.nextLong();
         long[] arr = new long[(int) n];
         
         for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
         }

         // divisible by 6
         for(long x : arr) {
            if(x % 6 == 0) {
               System.out.print(x + " ");
            }
         }
         
         // divisible by 2 only
         for(long x : arr) {
            if(x % 6 != 0 && x % 2 == 0) {
               System.out.print(x + " ");
            }
         }

         // neither divisible by 2 nor 3
         for(long x : arr) {
            if(x % 2 != 0 && x % 3 != 0) {
               System.out.print(x + " ");
            }
         }

         // divisible by 3 only
         for(long x : arr) {
            if(x % 6 != 0 && x % 3 == 0 && x % 2 != 0) {
               System.out.print(x + " ");
            }
         }
         System.out.println();
      }
      sc.close();
   }
}
/*
5
6
12 7 9 4 18 5
4
3 6 2 8
7
1 10 15 20 3 6 9
5
11 14 21 2 5
3
6 6 6
OutputCopy
12 18 4 7 5 9
2 8 3 6
6 10 20 1 15 3 9
21 5 11 2 14
6 6 6
*/
/*  
Note
In the first test case, an optimal arrangement is a=[12,18,4,7,5,9]
. The subarrays whose products are divisible by 6
 are:

[12]
[18]
[12,18]
[18,4]
[12,18,4]
[18,4,7]
[12,18,4,7]
[18,4,7,5]
[4,7,5,9]
[12,18,4,7,5]
[18,4,7,5,9]
[12,18,4,7,5,9]
Therefore, f(a)=12
. It can be proven that no other arrangement yields a smaller value of f(a)
*/