import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {

        
        Arrays.sort(arr);
        return arr[arr.length-1];

    
    }
}
