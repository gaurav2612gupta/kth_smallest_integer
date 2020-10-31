import java.io.EOFException;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,3,-1,-3,5,3,6,7};
        int k=sc.nextInt();
        for (int i = 0; i < arr.length-k+1; i++) {
            int max=arr[i];
            for (int j = i; j < i+k; j++) {
                if(arr[j]>max)
                    max=arr[j];
            }
            System.out.println(max);
        }
    }
}


