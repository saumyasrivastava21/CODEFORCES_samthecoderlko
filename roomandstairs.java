import java.util.Scanner;

public class roomandstairs {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t-->0)
        {
            int n = ob.nextInt();
            String s= ob.next();
            int maxlen = n;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='1')
                {
                    maxlen = Math.max(maxlen,2*(i+1));
                    maxlen = Math.max(maxlen,2*(n-i));
                }
            }
            System.out.println(maxlen);
        }
        ob.close();
    }
}
