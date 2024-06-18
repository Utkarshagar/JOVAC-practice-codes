
import java.util.Scanner;

public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        lcmAndGcd(a, b);
        sc.close();
    }
    static int gcd(int a,int b){
        if(a==0)
        return b;
        if(b==0)
        return a;
        
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a==0)
        return b;
        return a;
    }
    static void lcmAndGcd(int A , int B) {
        int gcd = gcd(A,B);
        int lcm = (A*B) / gcd;
        System.out.println("LCM = "+lcm+" and GCD = "+gcd);
        
    }
}
