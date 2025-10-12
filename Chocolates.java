import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int last = array[n-1];
        int max =last-1;
        int ans =0;
        ans+=last;
        for(int i= n-2;i>=0;i--){
        ans+=Math.min(array[i],max);
        max = Math.min(max-1,array[i]-1);
        }
        System.out.println(ans);
    }
}
