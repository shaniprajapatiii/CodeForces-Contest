import java.util.Scanner;

public class RankSubsequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] l = new int[n + 1];
            int[] r = new int[n + 1];
            int[] u = new int[n + 1];
            int[] v = new int[n + 1];
            for(int i = 1; i <= n; i++) {
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();
                u[i] = sc.nextInt();
                v[i] = sc.nextInt();
            }

            int max = 0;
            for (int m = n; m >= 1; m--) {
                if(formSubsequence(n, m, l, r, u, v)) {
                    max = m;
                    break;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }

    private static boolean formSubsequence(int n, int m, int[] l, int[] r, int[] u, int[] v) {
        int curr = 0;

        for(int j = 1; j <= m; j++) {
            int rank = m - j + 1;
            boolean found = false;

            for (int i = curr + 1; i <= n; i++) {
                boolean leftValid = (j < l[i] || j > r[i]);
                boolean rightValid = (rank < u[i] || rank > v[i]);

                if(leftValid && rightValid) {
                    curr = i;
                    found = true;
                    break;
                }
            }

            if(!found) return false;
        }
        return true;
    }
}