import java.util.*;
public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[] = {9,8,7,-1,4,3,2,1,10,0,-6,-2};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
