import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            List<Integer> ans = new ArrayList<>();
            String n = sc.next();
            int len = n.length();
            int place = 1;

            // Start from the rightmost digit (units) and multiply place by 10
            for (int i = len - 1; i >= 0; i--) {
                int digit = n.charAt(i) - '0';
                if (digit != 0) {
                    ans.add(digit * place);
                }
                place *= 10;
            }

            // Print count
            System.out.println(ans.size());

            // Print round numbers in **right-to-left order** (smallest to largest place)
            StringBuilder sb = new StringBuilder();
            for (int num : ans) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
