import java.util.Scanner;
public class Armstrong_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrongNumber(n));
        sc.close();
    }
    static String armstrongNumber(int n){
        // code here
        int m = n;
        int r1 = n%10;
        n/=10;
        int r2 = n%10;
        n/=10;
        int r3 = n%10;
        n/=10;
        int r = (r3*r3*r3)+(r2*r2*r2)+(r1*r1*r1);
        return m==r ? "Yes":"No";
    }
}
