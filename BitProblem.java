import java.util.Scanner;

public class BitProblem {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        while(n-->0){
            String statement = sc.next();
            if(statement.equals("++X") || statement.equals("X++")){
                x++;
            } else if(statement.equals("--X") || statement.equals("X--")){
                x--;
            }
        }
        System.out.println(x);
    }
    
}