import java.util.*;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];   // use long
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }

        long ans = array[n - 1];       // total chocolates, long
        long max = array[n - 1] - 1;   // max allowed for previous boxes

        for (int i = n - 2; i >= 0; i--) {
            if (max <= 0) break;       // cannot take negative chocolates
            long take = Math.min(array[i], max);
            ans += take;
            max = take - 1;            // strictly decreasing
        }

        System.out.println(ans);
    }
}

