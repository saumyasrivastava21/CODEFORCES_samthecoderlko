import java.util.Scanner;

public class chewbaccaandnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] arr = n.toCharArray();
        for(int i=0;i<arr.length;i++){
            int digit = arr[i]-'0';
            int inverted = 9-digit;
            if(i==0 && inverted==0){
                continue;
            }
            if(inverted<digit){
                arr[i] = (char)(inverted+'0');
            }
        }
        System.out.println(new String(arr));
    }
}
