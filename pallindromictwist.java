import java.util.Scanner;

public class pallindromictwist {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while (t-- > 0) {
            int n = ob.nextInt();
            String s = ob.next();
            int i =0;
            int j=n-1;
            boolean flag = true;
            while(i<j)
            {
                    int abs = Math.abs(s.charAt(i)-s.charAt(j));
                    if(abs!=2 && abs!=0)
                    {
                       flag = false;
                        break;
                    }
                i++;
                j--;
            }
            if(!flag)
                System.out.println("NO");
            else
            System.out.println("YES");
        }
        ob.close();
    }
}
