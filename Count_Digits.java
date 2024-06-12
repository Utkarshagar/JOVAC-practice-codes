

public class Count_Digits {
    public static void main(String[] args) {
        int n = 15687582;

        
        int digits = (int) ( Math.log(n) / Math.log(10) ) + 1;
        System.out.println(digits);
    }
}
