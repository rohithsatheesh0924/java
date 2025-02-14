import java.util.Arrays;
public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        //sol1
        //Arrays.sort(a);
        //int arr[]=new int[2];
        //arr[0]=a[n-2];
        //arr[1]=a[1];
       //return arr;

         Arrays.sort(a);
         return new int[]{a[n-2],a[1]};
       
        }
    


    }
