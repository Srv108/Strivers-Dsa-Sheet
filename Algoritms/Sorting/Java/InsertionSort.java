import java.util.*;
public class InsertionSort {


    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int ele = arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j] > ele) {
                    arr[j+1] = arr[j];
                }else break;
            }
            arr[j+1] = ele;
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[] = {9,8,7,4,3,2,1};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
