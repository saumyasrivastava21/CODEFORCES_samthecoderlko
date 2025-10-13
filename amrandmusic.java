import java.util.*;

public class amrandmusic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // difficulty
            arr[i][1] = i + 1;        // index (1-based)
        }

        // Sort by difficulty
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int ans = 0;
        List<Integer> res = new ArrayList<>();

        int i = 0;
        while (i < n && k >= arr[i][0]) {
            k -= arr[i][0];
            ans++;
            res.add(arr[i][1]);
            i++;
        }
        Collections.sort(res);

        System.out.println(ans);
        for (int x : res)
            System.out.print(x + " ");
    }
}
