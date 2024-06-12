public class HCF {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;

        System.out.println(optimalSolution(a , b));
    }

     static int bruteForce(int a , int b){
        for(int i = Math.min(a , b); i >= 2 ; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }

    static int optimalSolution(int a , int b){
        while(a > 0 && b > 0) {
           
            if(a > b) {
                
                a = a % b;
            }
           
            else {
                
                b = b % a;
            }
        }
       
        if(a == 0) {
            return b;
        }
        
        return a;
    }
}
