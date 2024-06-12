package arrays;

import java.util.Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = { 10 , -1 , 20 ,3 , 4 , 30};


        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
